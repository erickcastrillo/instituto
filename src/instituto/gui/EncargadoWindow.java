/*
 * Copyright (C) 2022 Julio
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package instituto.gui;

import instituto.data.controladdores.Controlador;
import instituto.data.modelos.Encargado;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class EncargadoWindow extends javax.swing.JFrame {

    /**
     * Creates new form encargadoW
     */
    public EncargadoWindow() {
        
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCelularEncargado = new javax.swing.JTextField();
        txtNombreEncargado = new javax.swing.JTextField();
        txtApellidoEncargado = new javax.swing.JTextField();
        txtSegundoApellidoEncargado = new javax.swing.JTextField();
        txtCedulaEncargado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarEstudiante = new javax.swing.JButton();
        txtCorreoEncargado = new javax.swing.JTextField();
        txtDireccionEncargado = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        btnNuevoEncargado = new javax.swing.JButton();
        btnGuardarEncargado = new javax.swing.JButton();
        chxAcceso = new javax.swing.JCheckBox();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudiantes_Encargado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Datos de Encargado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setText("Primer Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setText("Segundo Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setText("Cédula:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel6.setText("Celular:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txtCelularEncargado.setName("txtCelularEncargado"); // NOI18N
        getContentPane().add(txtCelularEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 260, 40));

        txtNombreEncargado.setName("txtNombreEncargado"); // NOI18N
        txtNombreEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreEncargadoKeyPressed(evt);
            }
        });
        getContentPane().add(txtNombreEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 260, 40));

        txtApellidoEncargado.setName("txtApellidoEncargado"); // NOI18N
        txtApellidoEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoEncargadoKeyPressed(evt);
            }
        });
        getContentPane().add(txtApellidoEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 260, 40));

        txtSegundoApellidoEncargado.setName("txtSegundoApellidoEncargado"); // NOI18N
        txtSegundoApellidoEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSegundoApellidoEncargadoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSegundoApellidoEncargadoKeyReleased(evt);
            }
        });
        getContentPane().add(txtSegundoApellidoEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 260, 40));

        txtCedulaEncargado.setName("txtCedulaEncargado"); // NOI18N
        txtCedulaEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaEncargadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaEncargadoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedulaEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 260, 40));

        jLabel7.setText("Correo Electronico:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel8.setText("Dirección:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        btnAgregarEstudiante.setText("Agregar estudiante");
        btnAgregarEstudiante.setName("btnAgregarEstudiante"); // NOI18N
        btnAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, -1));

        txtCorreoEncargado.setName("txtCorreoEncargado"); // NOI18N
        getContentPane().add(txtCorreoEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 260, 50));

        txtDireccionEncargado.setName("txtDireccionEncargado"); // NOI18N
        getContentPane().add(txtDireccionEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 260, 40));

        btnBorrar.setText("Eliminar datos");
        btnBorrar.setName("btnBorrar"); // NOI18N
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.setName("btnActualizar"); // NOI18N
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        jLabel9.setText("Clave:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        txtClave.setName("txtClave"); // NOI18N
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 260, 40));

        btnNuevoEncargado.setText("Nuevo");
        btnNuevoEncargado.setName("btnNuevoEncargado"); // NOI18N
        getContentPane().add(btnNuevoEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        btnGuardarEncargado.setText("Guardar");
        btnGuardarEncargado.setName("btnGuardarEncargado"); // NOI18N
        btnGuardarEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEncargadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        chxAcceso.setText("Brindar Acceso");
        chxAcceso.setName("chxAcceso"); // NOI18N
        chxAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxAccesoActionPerformed(evt);
            }
        });
        getContentPane().add(chxAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.setName("btnSalir"); // NOI18N
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        tblEstudiantes_Encargado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEstudiantes_Encargado.setName("tblEstudiantes_Encargado"); // NOI18N
        jScrollPane2.setViewportView(tblEstudiantes_Encargado);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, -1, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEncargadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEncargadoKeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c))
        {
            txtApellidoEncargado.setEditable(false);
        }else
        {
            txtApellidoEncargado.setEditable(true);
        }
    }//GEN-LAST:event_txtNombreEncargadoKeyPressed

    private void txtApellidoEncargadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEncargadoKeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c))
        {
            txtApellidoEncargado.setEditable(false);
        }else
        {
            txtApellidoEncargado.setEditable(true);
        }
    }//GEN-LAST:event_txtApellidoEncargadoKeyPressed

    private void txtSegundoApellidoEncargadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoApellidoEncargadoKeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c))
        {
            txtSegundoApellidoEncargado.setEditable(true);
        }else
        {
            txtSegundoApellidoEncargado.setEditable(false);
        }
    }//GEN-LAST:event_txtSegundoApellidoEncargadoKeyPressed

    private void txtSegundoApellidoEncargadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoApellidoEncargadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoApellidoEncargadoKeyReleased

    private void txtCedulaEncargadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEncargadoKeyPressed

    }//GEN-LAST:event_txtCedulaEncargadoKeyPressed

    private void txtCedulaEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEncargadoKeyTyped
        char c =evt.getKeyChar();
        if(Character.isLetter(c))
        {
            txtCedulaEncargado.setEditable(false);
        }else
        {
            txtCedulaEncargado.setEditable(true);
        }
    }//GEN-LAST:event_txtCedulaEncargadoKeyTyped

    private void btnAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstudianteActionPerformed
        EstudianteWindow ventana = new EstudianteWindow();
        ventana.setVisible(true);
        tblEstudiantes_Encargado.setVisible(true);

    }//GEN-LAST:event_btnAgregarEstudianteActionPerformed

    private void btnGuardarEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEncargadoActionPerformed
        Encargado encargado = new Encargado();
        encargado.setNombre(txtNombreEncargado.getText());
        encargado.setPrimerApellido(txtApellidoEncargado.getText());
        encargado.setSegundoApellido(txtSegundoApellidoEncargado.getText());
        encargado.setIdentificacion(txtCedulaEncargado.getText());
        encargado.setCorreoElectronico(txtCorreoEncargado.getText());
        encargado.setDireccion(txtDireccionEncargado.getText());
        encargado.setTelefono(txtCelularEncargado.getText());
        encargado.setClave(txtClave.getText());
        encargado.setAcceso(chxAcceso.isSelected());
        Boolean guardado = Controlador.crearEncargado(encargado);

        //Controlador.crearEncargado(encargado);
        
        JOptionPane.showMessageDialog(null, "Encargado guardado con éxito");
            dispose();
        btnActualizar.setVisible(true);
        btnActualizar.setVisible(true);
        btnAgregarEstudiante.setVisible(true);
    }//GEN-LAST:event_btnGuardarEncargadoActionPerformed

    private void chxAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxAccesoActionPerformed

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
            java.util.logging.Logger.getLogger(EncargadoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncargadoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncargadoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncargadoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncargadoWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarEstudiante;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardarEncargado;
    private javax.swing.JButton btnNuevoEncargado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chxAcceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEstudiantes_Encargado;
    private javax.swing.JTextField txtApellidoEncargado;
    private javax.swing.JTextField txtCedulaEncargado;
    private javax.swing.JTextField txtCelularEncargado;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCorreoEncargado;
    private javax.swing.JTextField txtDireccionEncargado;
    private javax.swing.JTextField txtNombreEncargado;
    private javax.swing.JTextField txtSegundoApellidoEncargado;
    // End of variables declaration//GEN-END:variables
}
