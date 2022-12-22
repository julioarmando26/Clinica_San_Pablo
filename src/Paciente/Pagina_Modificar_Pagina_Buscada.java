
package Paciente;

import java.sql.*;
import javax.swing.*;
import Paciente.Paciente;

public class Pagina_Modificar_Pagina_Buscada extends javax.swing.JFrame {
    
    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
   
    public Pagina_Modificar_Pagina_Buscada() {
        initComponents();
        Modificar_Datos(null);
    }

    public void Modificar_Datos(String valor){
        String codsql;
        
        if(valor == null){
            codsql = "SELECT * FROM paciente";
        }else{
            if (valor !=null) {
                codsql = "SELECT * FROM paciente WHERE paciente_dni = '"+valor+"'" ;
            }else{
                    codsql = "SELECT * FROM paciente";
            }
        }
        String []datos = new String[7];
        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery(codsql);
            
            while(resultado.next()){
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
            }
            txtDni.setText(datos[0]);
            txtNombres.setText(datos[1]);
            txtFechaNac.setText(datos[2]);
            txtCel.setText(datos[3]);
            txtDir.setText(datos[4]);
            txtCorreos.setText(datos[5]);
            txtHistory.setText(datos[6]);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e+" Error en la consulta");
        }
    }
    
    public void Actualizar(){
        String valor = txtDni.getText();
        try {
            PreparedStatement actu = conect.prepareStatement("UPDATE paciente SET paciente_nombre='"+txtNombres.getText()+"', paciente_nacimiento='"+txtFechaNac.getText()+"', paciente_celular='"+txtCel.getText()+"', paciente_direccion='"+txtDir.getText()+"', paciente_correo='"+txtCorreos.getText()+"', paciente_historial='"+txtHistory.getText()+"' WHERE paciente_dni='"+valor+"'");
            actu.executeUpdate();
            Modificar_Datos(null);
            txtDni.getText();
            txtNombres.getText();
            txtFechaNac.getText();
            txtCel.getText();
            txtDir.getText();
            txtCorreos.getText();
            txtHistory.getText();
            JOptionPane.showMessageDialog(null,"Los datos han sido actualizados en la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e+" Error en la consulta");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        txtCorreos = new javax.swing.JTextField();
        txtHistory = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(188, 230, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 370, -1));

        txtDni.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 370, -1));

        txtFechaNac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 370, -1));

        txtCel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(txtCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 370, -1));

        txtDir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 370, -1));

        txtCorreos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(txtCorreos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 370, -1));

        txtHistory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(txtHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 370, -1));

        jButton1.setBackground(new java.awt.Color(45, 130, 181));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 430, 100, -1));

        jButton2.setBackground(new java.awt.Color(45, 130, 181));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("MENU PRINCIPAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 430, 200, -1));

        jButton3.setBackground(new java.awt.Color(45, 130, 181));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("GUARDAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 130, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Fecha de nacimiento: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("DNI: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Celular: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Direccion: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Correo: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Historial: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jPanel3.setBackground(new java.awt.Color(45, 130, 181));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 5));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_buscar/clinicaMontesur.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 440));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_buscar/logo.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 720, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(txtDni.getText().equals("") && txtNombres.getText().equals("") && txtFechaNac.getText().equals("") && txtCel.getText().equals("") && txtDir.getText().equals("") && txtCorreos.getText().equals("") && txtHistory.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Ya no puede retroceder. Por favor, si quiere salir seleccione Menú principal");
        }else{
            if(!txtDni.getText().equals("") && !txtNombres.getText().equals("") && !txtFechaNac.getText().equals("") && !txtCel.getText().equals("") && !txtDir.getText().equals("") && !txtCorreos.getText().equals("") && !txtHistory.getText().equals("") ){
                Pagina_Mostrar_Busqueda pmb = new Pagina_Mostrar_Busqueda();
                pmb.setVisible(true);
                pmb.buscar(txtDni.getText());
                dispose();
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Paciente paciente = new Paciente();
        paciente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(txtDni.getText().equals("")||txtNombres.getText().equals("")||txtFechaNac.getText().equals("")||txtCel.getText().equals("")||txtDir.getText().equals("")||txtCorreos.getText().equals("")||txtHistory.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Complete todo los espacios en blanco");
        }else{
            Actualizar();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pagina_Modificar_Pagina_Buscada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina_Modificar_Pagina_Buscada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina_Modificar_Pagina_Buscada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina_Modificar_Pagina_Buscada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_Modificar_Pagina_Buscada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCorreos;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtHistory;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
