
package Empleado;

import java.sql.*;
import javax.swing.*;
import Proyecto.Inicio;
import Empleado.*;

public class Empleado extends javax.swing.JFrame {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    public static String usuario = "Administrador";
    
    
    public Empleado() {
        initComponents();
        Usuario(null);
        MostrarUsuario();
    }

    public void Usuario(String Valor){
        
        String Sentencia = "SELECT nombre FROM registro_usuario WHERE usuario_nombre ='"+Valor+"' ";
        
        String []datos = new String[7];
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery(Sentencia);
            
            while(resultado.next()){
                datos[0] = resultado.getString(1);
                
            }
            
            txtNombreUsuario.setText(datos[0]);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e+" Error en la consulta");
        }
        
    }
    
    public void MostrarUsuario(){
        txtNombreUsuario.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        RegUsuario = new javax.swing.JButton();
        RegPaciente = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        ReservarCitas = new javax.swing.JButton();
        VerCitas = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 130, 181));
        jLabel1.setText("Bienvenido(a): ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        txtNombreUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 430, 30));

        RegUsuario.setBackground(new java.awt.Color(45, 130, 181));
        RegUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        RegUsuario.setForeground(new java.awt.Color(255, 255, 255));
        RegUsuario.setText("Registrar Usuario");
        RegUsuario.setMaximumSize(new java.awt.Dimension(140, 29));
        RegUsuario.setMinimumSize(new java.awt.Dimension(140, 29));
        RegUsuario.setPreferredSize(new java.awt.Dimension(140, 29));
        RegUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(RegUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 30));

        RegPaciente.setBackground(new java.awt.Color(45, 130, 181));
        RegPaciente.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        RegPaciente.setForeground(new java.awt.Color(255, 255, 255));
        RegPaciente.setText("Registrar Paciente");
        RegPaciente.setMaximumSize(new java.awt.Dimension(140, 29));
        RegPaciente.setMinimumSize(new java.awt.Dimension(140, 29));
        RegPaciente.setPreferredSize(new java.awt.Dimension(140, 29));
        RegPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(RegPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, 30));

        Buscar.setBackground(new java.awt.Color(45, 130, 181));
        Buscar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar Paciente");
        Buscar.setMaximumSize(new java.awt.Dimension(140, 29));
        Buscar.setMinimumSize(new java.awt.Dimension(140, 29));
        Buscar.setPreferredSize(new java.awt.Dimension(140, 29));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 150, 30));

        ReservarCitas.setBackground(new java.awt.Color(45, 130, 181));
        ReservarCitas.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ReservarCitas.setForeground(new java.awt.Color(255, 255, 255));
        ReservarCitas.setText("Reservar Citas");
        ReservarCitas.setMaximumSize(new java.awt.Dimension(140, 29));
        ReservarCitas.setMinimumSize(new java.awt.Dimension(140, 29));
        ReservarCitas.setPreferredSize(new java.awt.Dimension(140, 29));
        ReservarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarCitasActionPerformed(evt);
            }
        });
        jPanel1.add(ReservarCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 120, 30));

        VerCitas.setBackground(new java.awt.Color(45, 130, 181));
        VerCitas.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        VerCitas.setForeground(new java.awt.Color(255, 255, 255));
        VerCitas.setText("Ver Citas");
        VerCitas.setMaximumSize(new java.awt.Dimension(140, 29));
        VerCitas.setMinimumSize(new java.awt.Dimension(140, 29));
        VerCitas.setPreferredSize(new java.awt.Dimension(140, 29));
        VerCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCitasActionPerformed(evt);
            }
        });
        jPanel1.add(VerCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 130, 30));

        Salir.setBackground(new java.awt.Color(45, 130, 181));
        Salir.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.setMaximumSize(new java.awt.Dimension(140, 29));
        Salir.setMinimumSize(new java.awt.Dimension(140, 29));
        Salir.setPreferredSize(new java.awt.Dimension(140, 29));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 60, 30));

        jPanel2.setBackground(new java.awt.Color(45, 130, 181));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 5));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_buscar/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -5, 830, 60));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 120, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setSelectionColor(new java.awt.Color(0, 0, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 790, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_buscar/clinicaMontesur.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        Buscar_Paciente bp = new Buscar_Paciente();
        bp.setVisible(true);
        dispose();
    }//GEN-LAST:event_BuscarActionPerformed

    private void RegPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegPacienteActionPerformed
        Registro_Paciente regisPac = new Registro_Paciente();
        regisPac.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegPacienteActionPerformed

    private void RegUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegUsuarioActionPerformed
        Registro_Usuario regisUsu = new Registro_Usuario();
        regisUsu.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegUsuarioActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Inicio start = new Inicio();
        start.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void ReservarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarCitasActionPerformed
        Separacion_De_Citas asignar = new Separacion_De_Citas();
        asignar.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReservarCitasActionPerformed

    private void VerCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCitasActionPerformed
        Buscar_Cita buscar = new Buscar_Cita();
        buscar.setVisible(true);
        dispose();
    }//GEN-LAST:event_VerCitasActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton RegPaciente;
    private javax.swing.JButton RegUsuario;
    private javax.swing.JButton ReservarCitas;
    private javax.swing.JButton Salir;
    private javax.swing.JButton VerCitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
