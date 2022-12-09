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
import instituto.data.modelos.Estudiante;
import instituto.data.modelos.EstudianteIV;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class EstudianteWindow extends javax.swing.JFrame {

    /**
     * Creates new form EstudianteWindow
     */
    public EstudianteWindow() {
        initComponents();
        setLocationRelativeTo(null);
        lblSeccion.setVisible(false);
        cbxPrimaria.setVisible(false);
        cbxTercerCiclo.setVisible(false);
        cbxCuartoCiclo.setVisible(false);
        cbxEspecialidad.setVisible(false);
        lblEspecialidad.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtApellidoEstudiante = new javax.swing.JTextField();
        txtSegundoApellidoEstudiante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblEspecialidad = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnActualizarEst = new javax.swing.JButton();
        rdbCuartoCiclo = new javax.swing.JRadioButton();
        rdbPrimaria = new javax.swing.JRadioButton();
        rdbTercerCiclo = new javax.swing.JRadioButton();
        lblSeccion = new javax.swing.JLabel();
        cbxTercerCiclo = new javax.swing.JComboBox<>();
        cbxEspecialidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbxPrimaria = new javax.swing.JComboBox<>();
        cbxCuartoCiclo = new javax.swing.JComboBox<>();
        txtCedulaEstudiante = new javax.swing.JTextField();
        btnGuardarEstudiante1 = new javax.swing.JButton();
        btnSalirEstudiante = new javax.swing.JButton();
        btnUpdateEstudiante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setText("Primer Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setText("Segundo Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setText("Cédula:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel6.setText("Fecha Nacimiento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txtFechaNacimiento.setName("txtFechaNacimiento"); // NOI18N
        txtFechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaNacimientoKeyPressed(evt);
            }
        });
        getContentPane().add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 260, 40));

        txtNombreEstudiante.setName("txtNombreEstudiante"); // NOI18N
        txtNombreEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEstudianteActionPerformed(evt);
            }
        });
        txtNombreEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreEstudianteKeyPressed(evt);
            }
        });
        getContentPane().add(txtNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 260, 40));

        txtApellidoEstudiante.setName("txtApellidoEstudiante"); // NOI18N
        txtApellidoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoEstudianteKeyPressed(evt);
            }
        });
        getContentPane().add(txtApellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 260, 40));

        txtSegundoApellidoEstudiante.setName("txtSegundoApellidoEstudiante"); // NOI18N
        txtSegundoApellidoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSegundoApellidoEstudianteKeyPressed(evt);
            }
        });
        getContentPane().add(txtSegundoApellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 260, 40));

        jLabel7.setText("Nivel");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        lblEspecialidad.setText("Especialidad");
        lblEspecialidad.setName("lblEspecialidad"); // NOI18N
        getContentPane().add(lblEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        btnBorrar.setText("Borrar");
        btnBorrar.setName("btnBorrar"); // NOI18N
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, -1, -1));

        btnActualizarEst.setText("Actualizar");
        btnActualizarEst.setName("btnActualizarEst"); // NOI18N
        btnActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEstActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        buttonGroup1.add(rdbCuartoCiclo);
        rdbCuartoCiclo.setText("Cuarto Ciclo");
        rdbCuartoCiclo.setName("rdbCuartoCiclo"); // NOI18N
        rdbCuartoCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCuartoCicloActionPerformed(evt);
            }
        });
        getContentPane().add(rdbCuartoCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        buttonGroup1.add(rdbPrimaria);
        rdbPrimaria.setText("Primaria");
        rdbPrimaria.setName("rdbPrimaria"); // NOI18N
        rdbPrimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPrimariaActionPerformed(evt);
            }
        });
        getContentPane().add(rdbPrimaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        buttonGroup1.add(rdbTercerCiclo);
        rdbTercerCiclo.setText("Tercer Ciclo");
        rdbTercerCiclo.setName("rdbTercerCiclo"); // NOI18N
        rdbTercerCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbTercerCicloActionPerformed(evt);
            }
        });
        getContentPane().add(rdbTercerCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        lblSeccion.setText("Sección");
        lblSeccion.setName("lblSeccion"); // NOI18N
        getContentPane().add(lblSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        cbxTercerCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "7-A", "8-A", "9-A" }));
        cbxTercerCiclo.setName("cbxTercerCiclo"); // NOI18N
        cbxTercerCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTercerCicloActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTercerCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        cbxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Mecanica", "Secretariado" }));
        cbxEspecialidad.setName("cbxEspecialidad"); // NOI18N
        getContentPane().add(cbxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        jLabel1.setText("Datos de estudiante");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        cbxPrimaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1-A", "2-A", "3-A", "4-A", "5-A", "6-A" }));
        cbxPrimaria.setName("cbxPrimaria"); // NOI18N
        cbxPrimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPrimariaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxPrimaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        cbxCuartoCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "10-A", "11-A", "12-A" }));
        cbxCuartoCiclo.setName("cbxCuartoCiclo"); // NOI18N
        getContentPane().add(cbxCuartoCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        txtCedulaEstudiante.setName("txtCedulaEstudiante"); // NOI18N
        txtCedulaEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaEstudianteKeyPressed(evt);
            }
        });
        getContentPane().add(txtCedulaEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 260, 40));

        btnGuardarEstudiante1.setText("Guardar Estudiante");
        btnGuardarEstudiante1.setName("btnGuardarEstudiante1"); // NOI18N
        btnGuardarEstudiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEstudiante1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarEstudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, -1, -1));

        btnSalirEstudiante.setText("Salir");
        btnSalirEstudiante.setName("btnSalirEstudiante"); // NOI18N
        btnSalirEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        btnUpdateEstudiante.setText("Actualizar Estudiante");
        btnUpdateEstudiante.setName("btnUpdateEstudiante"); // NOI18N
        btnUpdateEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbCuartoCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCuartoCicloActionPerformed
        if (rdbCuartoCiclo.isSelected())
        {
            cbxPrimaria.setVisible(false);
            cbxTercerCiclo.setVisible(false);
            cbxCuartoCiclo.setVisible(true);
            cbxEspecialidad.setVisible(true);
            lblEspecialidad.setVisible(true);
            lblSeccion.setVisible(true);
        }
    }//GEN-LAST:event_rdbCuartoCicloActionPerformed

    private void rdbPrimariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPrimariaActionPerformed
        if (rdbPrimaria.isSelected())
        {
            cbxPrimaria.setVisible(true);
            cbxTercerCiclo.setVisible(false);
            cbxCuartoCiclo.setVisible(false);
            cbxEspecialidad.setVisible(false);
            lblEspecialidad.setVisible(false);
            lblSeccion.setVisible(true);
        }

    }//GEN-LAST:event_rdbPrimariaActionPerformed

    private void rdbTercerCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbTercerCicloActionPerformed
        if (rdbTercerCiclo.isSelected())
        {
            cbxPrimaria.setVisible(false);
            cbxTercerCiclo.setVisible(true);
            cbxCuartoCiclo.setVisible(false);
            cbxEspecialidad.setVisible(false);
            lblEspecialidad.setVisible(false);
            lblSeccion.setVisible(true);
        }
    }//GEN-LAST:event_rdbTercerCicloActionPerformed

    private void cbxTercerCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTercerCicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTercerCicloActionPerformed

    private void cbxPrimariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPrimariaActionPerformed

    }//GEN-LAST:event_cbxPrimariaActionPerformed

    private void txtNombreEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstudianteKeyPressed
        char c =evt.getKeyChar();
                if(Character.isDigit(c))
                {
                    txtNombreEstudiante.setEditable(false);
                }else 
                {
                    txtNombreEstudiante.setEditable(true);
                }
    }//GEN-LAST:event_txtNombreEstudianteKeyPressed

    private void txtApellidoEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEstudianteKeyPressed
        char c =evt.getKeyChar();
                if(Character.isDigit(c))
                {
                    txtApellidoEstudiante.setEditable(false);
                }else 
                {
                    txtApellidoEstudiante.setEditable(true);
                }
    }//GEN-LAST:event_txtApellidoEstudianteKeyPressed

    private void txtSegundoApellidoEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoApellidoEstudianteKeyPressed
        char c =evt.getKeyChar();
                if(Character.isDigit(c))
                {
                    txtSegundoApellidoEstudiante.setEditable(false);
                }else 
                {
                    txtSegundoApellidoEstudiante.setEditable(true);
                }
    }//GEN-LAST:event_txtSegundoApellidoEstudianteKeyPressed

    private void txtFechaNacimientoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaNacimientoKeyPressed
       char c =evt.getKeyChar();
                if(Character.isLetter(c))
                {
                    txtFechaNacimiento.setEditable(false);
                }else 
                {
                    txtFechaNacimiento.setEditable(true);
                }
    }//GEN-LAST:event_txtFechaNacimientoKeyPressed

    private void txtNombreEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEstudianteActionPerformed

    private void txtCedulaEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEstudianteKeyPressed
        char c =evt.getKeyChar();
                if(Character.isLetter(c))
                {
                    txtFechaNacimiento.setEditable(false);
                }else 
                {
                    txtFechaNacimiento.setEditable(true);
                }
    }//GEN-LAST:event_txtCedulaEstudianteKeyPressed

    private void btnGuardarEstudiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEstudiante1ActionPerformed
        if(rdbPrimaria.isSelected())
        {
            Estudiante estudiante = new Estudiante();
            estudiante.setNombre(txtNombreEstudiante.getText());
            estudiante.setPrimerApellido(txtApellidoEstudiante.getText());
            estudiante.setSegundoApellido(txtSegundoApellidoEstudiante.getText());
            estudiante.setIdentificacion(txtCedulaEstudiante.getText());
            estudiante.setFechaNacimiento(txtFechaNacimiento.getText());
            estudiante.setSeccion(String.valueOf(cbxPrimaria.getSelectedItem()));
            estudiante.setNivel("Primaria");
            //estudiante.setIdEncargado();
            Boolean guardado = Controlador.crearEstudiante(estudiante);
            if (guardado)
            {
               JOptionPane.showMessageDialog(null, "Estudiante de primaria guardado con éxito"); 
               dispose();
            }else 
            {
              JOptionPane.showMessageDialog(null, "Error al guardar estudiante",
                        "Atención", JOptionPane.ERROR_MESSAGE);
            }
            
        }else if (rdbTercerCiclo.isSelected())
        {
            Estudiante estudiante = new Estudiante();
            estudiante.setNombre(txtNombreEstudiante.getText());
            estudiante.setPrimerApellido(txtApellidoEstudiante.getText());
            estudiante.setSegundoApellido(txtSegundoApellidoEstudiante.getText());
            estudiante.setIdentificacion(txtCedulaEstudiante.getText());
            estudiante.setFechaNacimiento(txtFechaNacimiento.getText());
            estudiante.setSeccion(String.valueOf(cbxTercerCiclo.getSelectedItem()));
            estudiante.setNivel("Tercer Ciclo");
            Boolean guardado = Controlador.crearEstudiante(estudiante);
            if (guardado)
            {
               JOptionPane.showMessageDialog(null, "Estudiante de Tercer Ciclo guardado con éxito"); 
               dispose();
            }else 
            {
              JOptionPane.showMessageDialog(null, "Error al guardar estudiante",
                        "Atención", JOptionPane.ERROR_MESSAGE);
            }
            
        }else if (rdbCuartoCiclo.isSelected())
        {
            EstudianteIV estudianteiv = new EstudianteIV();
            estudianteiv.setNombre(txtNombreEstudiante.getText());
            estudianteiv.setPrimerApellido(txtApellidoEstudiante.getText());
            estudianteiv.setSegundoApellido(txtSegundoApellidoEstudiante.getText());
            estudianteiv.setIdentificacion(txtCedulaEstudiante.getText());
            estudianteiv.setFechaNacimiento(txtFechaNacimiento.getText());
            estudianteiv.setNivel("Cuarto Ciclo");
            estudianteiv.setSeccion(String.valueOf(cbxCuartoCiclo.getSelectedItem()));
            estudianteiv.setEspecialidad(String.valueOf(cbxEspecialidad.getSelectedItem()));
            //estudianteiv.setSeccion(String.valueOf(cbxCuartoCiclo.getSelectedItem()));
            Boolean guardado = Controlador.crearEstudianteIV(estudianteiv);
            if (guardado)
            {
               JOptionPane.showMessageDialog(null, "Estudiante de IV Ciclo guardado con éxito"); 
               dispose();
            }else 
            {
              JOptionPane.showMessageDialog(null, "Error al guardar estudiante",
                        "Atención", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarEstudiante1ActionPerformed

    private void btnSalirEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirEstudianteActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirEstudianteActionPerformed

    private void btnActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEstActionPerformed
        btnUpdateEstudiante.setVisible(true);
        txtNombreEstudiante.setEnabled(true);
        txtNombreEstudiante.setEditable(true);
        txtNombreEstudiante.setVisible(true);
        
        txtApellidoEstudiante.setEnabled(true);
        txtSegundoApellidoEstudiante.setEnabled(true);
        txtCedulaEstudiante.setEnabled(true);
        txtFechaNacimiento.setEnabled(true);
        if (rdbPrimaria.isSelected())
        {
            rdbPrimaria.setEnabled(true);
            cbxPrimaria.setEnabled(true);
        }
        else if (rdbTercerCiclo.isSelected())
        {
            rdbTercerCiclo.setEnabled(true);
            cbxTercerCiclo.setEnabled(true);
        }
        else
        {
            rdbCuartoCiclo.setEnabled(true);
            cbxCuartoCiclo.setEnabled(true);
            cbxEspecialidad.setEnabled(true);
        }
        btnActualizarEst.setVisible(false);
        
    }//GEN-LAST:event_btnActualizarEstActionPerformed

    private void btnUpdateEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEstudianteActionPerformed
        if(rdbPrimaria.isSelected())
        {
           Estudiante estudiante = Controlador.obtenerEstudiante(estudianteID);
           estudiante.setNombre(txtNombreEstudiante.getText());
           estudiante.setPrimerApellido(txtApellidoEstudiante.getText());
           estudiante.setSegundoApellido(txtSegundoApellidoEstudiante.getText());
           estudiante.setIdentificacion(txtCedulaEstudiante.getText());
           estudiante.setFechaNacimiento(txtFechaNacimiento.getText());
           estudiante.setSeccion(String.valueOf(cbxPrimaria.getSelectedItem()));
           estudiante.setNivel("Primaria");
            //estudiante.setIdEncargado();
            Boolean guardado = Controlador.updateEstudiante(estudiante);
            if (guardado)
            {
               JOptionPane.showMessageDialog(null, "Estudiante actualizado"); 
               dispose();
            }else 
            {
              JOptionPane.showMessageDialog(null, "Error al actualizar estudiante",
                        "Atención", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_btnUpdateEstudianteActionPerformed
    public String encargadoID;
    public String estudianteID;
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
            java.util.logging.Logger.getLogger(EstudianteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudianteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudianteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudianteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudianteWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarEst;
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnGuardarEstudiante1;
    private javax.swing.JButton btnSalirEstudiante;
    public javax.swing.JButton btnUpdateEstudiante;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cbxCuartoCiclo;
    public javax.swing.JComboBox<String> cbxEspecialidad;
    public javax.swing.JComboBox<String> cbxPrimaria;
    public javax.swing.JComboBox<String> cbxTercerCiclo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel lblEspecialidad;
    public javax.swing.JLabel lblSeccion;
    public javax.swing.JRadioButton rdbCuartoCiclo;
    public javax.swing.JRadioButton rdbPrimaria;
    public javax.swing.JRadioButton rdbTercerCiclo;
    public javax.swing.JTextField txtApellidoEstudiante;
    public javax.swing.JTextField txtCedulaEstudiante;
    public javax.swing.JTextField txtFechaNacimiento;
    public javax.swing.JTextField txtNombreEstudiante;
    public javax.swing.JTextField txtSegundoApellidoEstudiante;
    // End of variables declaration//GEN-END:variables
}
