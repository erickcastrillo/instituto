/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package instituto.gui;

import instituto.data.controladdores.Controlador;
import static instituto.data.modelos.TipoUsuario.ADMINISTRACION;
import static instituto.data.modelos.TipoUsuario.ENCARGADO;
import instituto.data.modelos.Usuario;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;

/**
 *
 * @author Julio
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnRecuperarContrasena = new javax.swing.JButton();
        txtClave = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clave");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        btnIniciarSesion.setText("Log in");
        btnIniciarSesion.setName("btnIniciarSesion"); // NOI18N
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        btnRecuperarContrasena.setText("Olvidé contraseña");
        btnRecuperarContrasena.setName("btnRecuperarContrasena"); // NOI18N
        getContentPane().add(btnRecuperarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        txtClave.setName("txtClave"); // NOI18N
        txtClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClaveFocusGained(evt);
            }
        });
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 160, 60));

        txtTelefono.setName("txtTelefono"); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 160, 60));

        jLabel3.setText("Telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        btnRegistrar.setText("Registrarme");
        btnRegistrar.setName("btnRegistrar"); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String telefono = txtTelefono.getText();
        String clave = String.valueOf(txtClave.getText());

        if (telefono.equalsIgnoreCase("admin") && clave.equalsIgnoreCase("admin")) 
        {
            Principal ventana = new Principal();
            ventana.setVisible(true);
            this.dispose();
        }else 
                {
                    Usuario usuario = Controlador.login(telefono, clave);
                    if (usuario.getTipoUsuario().equals(ENCARGADO)) {
                    JOptionPane.showMessageDialog(null, "Login exitoso!");
                    EncargadoWindow ventana = new EncargadoWindow();
                    ventana.setVisible(true);
                    ventana.txtNombreEncargado.setText(usuario.getNombre());
                    ventana.txtApellidoEncargado.setText(usuario.getPrimerApellido());
                    ventana.txtSegundoApellidoEncargado.setText(usuario.getSegundoApellido());
                    ventana.txtCedulaEncargado.setText(usuario.getIdentificacion());
                    ventana.txtCelularEncargado.setText(usuario.getTelefono());
                    ventana.txtClave.setText(usuario.getClave());
                    ventana.lblHijos.setVisible(false);
                    ventana.lblSeleccionarHijo.setVisible(false);
                    ventana.btnAgregarEstudiante.setVisible(false);
                    ventana.btnAsociar.setVisible(false);
                    ventana.btnGuardarCambiosEncargado.setVisible(false);
                    ventana.chxAcceso.setVisible(false);
                    ventana.btnGuardarEncargado.setVisible(false);
                    
                    ventana.txtNombreEncargado.setEnabled(false);
                    ventana.txtApellidoEncargado.setEnabled(false);
                    ventana.txtSegundoApellidoEncargado.setEnabled(false);
                    ventana.txtCedulaEncargado.setEnabled(false);
                    ventana.txtCelularEncargado.setEnabled(false);
                    ventana.txtClave.setEnabled(false);
                    ventana.txtCorreoEncargado.setEnabled(false);
                    ventana.txtDireccionEncargado.setEnabled(false);
                    
                }else if (usuario.getTipoUsuario().equals(ADMINISTRACION))
                {
                    JOptionPane.showMessageDialog(null, "Login exitoso!");
                    AdministrativoWindow ventana = new AdministrativoWindow();
                    ventana.setVisible(true);
                    ventana.txtNombreAdministrativo.setText(usuario.getNombre());
                    ventana.txtPrimerApellidoAdministrativo.setText(usuario.getPrimerApellido());
                    ventana.txtSegundoApellidoAdministrativo.setText(usuario.getSegundoApellido());
                    ventana.txtCedulaAdministrativo.setText(usuario.getIdentificacion());
                    ventana.txtTelefonoAdministrativo.setText(usuario.getTelefono());
                    ventana.txtClaveAdministrativo.setText(usuario.getClave());
                    ventana.btnGuardar.setVisible(false);
                    ventana.txtNombreAdministrativo.setEnabled(false);
                    ventana.txtPrimerApellidoAdministrativo.setEnabled(false);
                    ventana.txtSegundoApellidoAdministrativo.setEnabled(false);
                    ventana.txtTelefonoAdministrativo.setEnabled(false);
                    ventana.txtClaveAdministrativo.setEnabled(false);
                    ventana.txtCedulaAdministrativo.setEnabled(false);
                    ventana.btnGuardar.setVisible(false);
                    ventana.btnGuardarCambiosAdministrativo.setVisible(false);               
                }else 
                {
                    JOptionPane.showMessageDialog(null, "Telefono o clave incorrectos", "Error al validar credenciales", JOptionPane.ERROR_MESSAGE);
                }
                }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveFocusGained

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        EncargadoWindow ventana = new EncargadoWindow();
        ventana.setVisible(true);
        ventana.chxAcceso.setVisible(false);
        ventana.btnAgregarEstudiante.setVisible(false);
        ventana.btnBorrar.setVisible(false);
        ventana.btnActualizar.setVisible(false);
        ventana.tblHijos.setVisible(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRecuperarContrasena;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
