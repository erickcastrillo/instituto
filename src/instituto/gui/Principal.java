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
import instituto.data.modelos.Estudiante;
import instituto.data.modelos.EstudianteIV;
import instituto.data.modelos.Usuario;
import instituto.data.repositorios.PersonasRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    
    
    DefaultTableModel modelo = new DefaultTableModel();
    public Principal() {
        
        
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

        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrincipal = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnListarEstudiante = new javax.swing.JMenuItem();
        mnListarEncargados = new javax.swing.JMenuItem();
        mnListarPrimaria = new javax.swing.JMenuItem();
        mnListarTercerCiclo = new javax.swing.JMenuItem();
        mnListarIV = new javax.swing.JMenuItem();
        mnListarAdministrativos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnAgregarEstudiante = new javax.swing.JMenuItem();
        mnRegistrarEncargado = new javax.swing.JMenuItem();
        mnAdministrativos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mnSeccion1A = new javax.swing.JMenuItem();
        mnSeccion2A = new javax.swing.JMenuItem();
        mnSeccion3A = new javax.swing.JMenuItem();
        mnSeccion4A = new javax.swing.JMenuItem();
        mnSeccion5A = new javax.swing.JMenuItem();
        mnSeccion6A = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnSeccion7A = new javax.swing.JMenuItem();
        mnSeccion8A = new javax.swing.JMenuItem();
        mnSeccion9A = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnSeccion10A = new javax.swing.JMenuItem();
        mnSeccion11A = new javax.swing.JMenuItem();
        mnSeccion12A = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnSecretariado = new javax.swing.JMenuItem();
        mnMecanica = new javax.swing.JMenuItem();

        jMenuItem8.setText("jMenuItem8");

        jMenuItem19.setText("jMenuItem19");

        jMenuItem22.setText("jMenuItem22");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblPrincipal.setName("tblPrincipal"); // NOI18N
        tblPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPrincipal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 500, 148));

        jMenu1.setText("Mantenimiento");

        mnListarEstudiante.setText("Estudiantes");
        mnListarEstudiante.setName("mnListarEstudiante"); // NOI18N
        mnListarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarEstudianteActionPerformed(evt);
            }
        });
        jMenu1.add(mnListarEstudiante);

        mnListarEncargados.setText("Encargados");
        mnListarEncargados.setName("mnListarEncargados"); // NOI18N
        mnListarEncargados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarEncargadosActionPerformed(evt);
            }
        });
        jMenu1.add(mnListarEncargados);

        mnListarPrimaria.setText("Primaria");
        mnListarPrimaria.setName("mnListarPrimaria"); // NOI18N
        mnListarPrimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarPrimariaActionPerformed(evt);
            }
        });
        jMenu1.add(mnListarPrimaria);

        mnListarTercerCiclo.setText("Tercer Ciclo");
        mnListarTercerCiclo.setName("mnListarTercerCiclo"); // NOI18N
        jMenu1.add(mnListarTercerCiclo);

        mnListarIV.setText("Cuarto Ciclo");
        mnListarIV.setName("mnListarIV"); // NOI18N
        jMenu1.add(mnListarIV);

        mnListarAdministrativos.setText("Administrativos");
        mnListarAdministrativos.setName("mnlistarAdministrativos"); // NOI18N
        mnListarAdministrativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarAdministrativosActionPerformed(evt);
            }
        });
        jMenu1.add(mnListarAdministrativos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registro");

        mnAgregarEstudiante.setText("Estudiantes");
        mnAgregarEstudiante.setName("mnAgregarEstudiante"); // NOI18N
        mnAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregarEstudianteActionPerformed(evt);
            }
        });
        jMenu2.add(mnAgregarEstudiante);

        mnRegistrarEncargado.setText("Encargados");
        mnRegistrarEncargado.setName("mnRegistrarEncargado"); // NOI18N
        mnRegistrarEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegistrarEncargadoActionPerformed(evt);
            }
        });
        jMenu2.add(mnRegistrarEncargado);

        mnAdministrativos.setText("Administrativos");
        mnAdministrativos.setName("mnAdministrativos"); // NOI18N
        mnAdministrativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAdministrativosActionPerformed(evt);
            }
        });
        jMenu2.add(mnAdministrativos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Secciones");

        jMenu4.setText("Secciones de Primaria");

        mnSeccion1A.setText("Sección 1-A");
        mnSeccion1A.setName("mnSeccion1A"); // NOI18N
        mnSeccion1A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSeccion1AMouseClicked(evt);
            }
        });
        mnSeccion1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion1AActionPerformed(evt);
            }
        });
        jMenu4.add(mnSeccion1A);

        mnSeccion2A.setText("Sección 2-A");
        mnSeccion2A.setName("mnSeccion2A"); // NOI18N
        mnSeccion2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion2AActionPerformed(evt);
            }
        });
        jMenu4.add(mnSeccion2A);

        mnSeccion3A.setText("Sección 3-A");
        mnSeccion3A.setName("mnSeccion3A"); // NOI18N
        mnSeccion3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion3AActionPerformed(evt);
            }
        });
        jMenu4.add(mnSeccion3A);

        mnSeccion4A.setText("Sección 4-A");
        mnSeccion4A.setName("mnSeccion4A"); // NOI18N
        mnSeccion4A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion4AActionPerformed(evt);
            }
        });
        jMenu4.add(mnSeccion4A);

        mnSeccion5A.setText("Sección 5-A");
        mnSeccion5A.setName("mnSeccion5A"); // NOI18N
        mnSeccion5A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion5AActionPerformed(evt);
            }
        });
        jMenu4.add(mnSeccion5A);

        mnSeccion6A.setText("Sección 6-A");
        mnSeccion6A.setName("mnSeccion6A"); // NOI18N
        mnSeccion6A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion6AActionPerformed(evt);
            }
        });
        jMenu4.add(mnSeccion6A);

        jMenu3.add(jMenu4);

        jMenu5.setText("Secciones de Tercer Ciclo");

        mnSeccion7A.setText("Sección 7-A");
        mnSeccion7A.setName("mnSeccion7A"); // NOI18N
        mnSeccion7A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion7AActionPerformed(evt);
            }
        });
        jMenu5.add(mnSeccion7A);

        mnSeccion8A.setText("Sección 8-A");
        mnSeccion8A.setName("mnSeccion8A"); // NOI18N
        mnSeccion8A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion8AActionPerformed(evt);
            }
        });
        jMenu5.add(mnSeccion8A);

        mnSeccion9A.setText("Sección 9-A");
        mnSeccion9A.setName("mnSeccion9A"); // NOI18N
        mnSeccion9A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion9AActionPerformed(evt);
            }
        });
        jMenu5.add(mnSeccion9A);

        jMenu3.add(jMenu5);

        jMenu7.setText("Secciones de Cuarto Ciclo");

        mnSeccion10A.setText("Sección 10-A");
        mnSeccion10A.setInheritsPopupMenu(true);
        mnSeccion10A.setName("mnSeccion10A"); // NOI18N
        mnSeccion10A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion10AActionPerformed(evt);
            }
        });
        jMenu7.add(mnSeccion10A);

        mnSeccion11A.setText("Sección 11-A");
        mnSeccion11A.setName("mnSeccion11A"); // NOI18N
        mnSeccion11A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion11AActionPerformed(evt);
            }
        });
        jMenu7.add(mnSeccion11A);

        mnSeccion12A.setText("Sección 12-A");
        mnSeccion12A.setName("mnSeccion12A"); // NOI18N
        mnSeccion12A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSeccion12AActionPerformed(evt);
            }
        });
        jMenu7.add(mnSeccion12A);

        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Especialidades");

        mnSecretariado.setText("Secretariado");
        mnSecretariado.setName("mnSecretariado"); // NOI18N
        mnSecretariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSecretariadoActionPerformed(evt);
            }
        });
        jMenu6.add(mnSecretariado);

        mnMecanica.setText("Mecanica");
        mnMecanica.setName("mnMecanica"); // NOI18N
        jMenu6.add(mnMecanica);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnAdministrativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAdministrativosActionPerformed
        AdministrativoWindow ventana = new AdministrativoWindow();
        ventana.setVisible(true);
        
    }//GEN-LAST:event_mnAdministrativosActionPerformed

    private void mnRegistrarEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegistrarEncargadoActionPerformed
        EncargadoWindow ventana = new EncargadoWindow();
        ventana.setVisible(true);
        
    }//GEN-LAST:event_mnRegistrarEncargadoActionPerformed

    private void mnAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregarEstudianteActionPerformed
        EstudianteWindow ventana = new EstudianteWindow();
        ventana.setVisible(true);
    }//GEN-LAST:event_mnAgregarEstudianteActionPerformed

    private void mnListarEncargadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarEncargadosActionPerformed
        actualizarTablaEncargado();
    }//GEN-LAST:event_mnListarEncargadosActionPerformed

    private void mnSecretariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSecretariadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnSecretariadoActionPerformed
    
    
    private void actualizarTablaEstudiante(List<Estudiante> listadeestudiantes){
        modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nivel");
        modelo.addColumn("Sección");
        Object[] fila = new Object[6];
        
            for (Estudiante estudiante : listadeestudiantes)
            {
                fila[0] = "Estudiante";
                fila[1] = estudiante.getId();
                fila[2] = estudiante.getNombre();
                fila[3] = estudiante.getPrimerApellido();
                fila[4] = estudiante.getNivel();
                fila[5] = estudiante.getSeccion();
                modelo.addRow(fila);
            }
        tblPrincipal.setModel(modelo);
    }
    private void actualizarTablaEncargado()
    {
        modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Acceso");
        Object[] fila = new Object[6];
        ArrayList<Encargado> listadeencargados = Controlador.listarEncargados();
        for (Encargado encargado : listadeencargados)
            {
                fila[0] = "Encargado";
                fila[1] = encargado.getId();
                fila[2] = encargado.getNombre();
                fila[3] = encargado.getPrimerApellido();
                fila[4] = encargado.getTelefono();
                fila[5] = encargado.getAcceso();
                modelo.addRow(fila);
            }
        tblPrincipal.setModel(modelo);
    }
    private void actualizarTablaEstudiantePrimaria()
    {
        modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nivel");
        modelo.addColumn("Sección");
        Object[] fila = new Object[6];
        ArrayList<Estudiante> listadeestudiantes = Controlador.listarEstudiantes();
            for (Estudiante estudiante : listadeestudiantes)
            {
                fila[0] = "Estudiante";
                fila[1] = estudiante.getId();
                fila[2] = estudiante.getNombre();
                fila[3] = estudiante.getPrimerApellido();
                fila[4] = estudiante.getNivel();
                fila[5] = estudiante.getSeccion();
                modelo.addRow(fila);
            }
        tblPrincipal.setModel(modelo);
    }
    private void actualizarTablaEstudianteTercerCiclo()
    {
        modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nivel");
        modelo.addColumn("Sección");
        Object[] fila = new Object[5];
        ArrayList<Estudiante> listadeestudiantes = Controlador.listarEstudiantes();
            for (Estudiante estudiante : listadeestudiantes)
            {
                fila[0] = "Estudiante";
                fila[1] = estudiante.getNombre();
                fila[2] = estudiante.getPrimerApellido();
                fila[3] = estudiante.getNivel();
                fila[4] = estudiante.getSeccion();
                modelo.addRow(fila);
            }
        tblPrincipal.setModel(modelo);
    }
    
    private void actualizarTablaEstudianteIV()
    {
        modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nivel");
        modelo.addColumn("Sección");
        modelo.addColumn("Especialidad");
        Object[] fila = new Object[7];
        ArrayList<EstudianteIV> listadeestudiantes = Controlador.listarEstudiantesIV();
            for (EstudianteIV estudianteiv : listadeestudiantes)
            {
                fila[0] = "Estudiante IV";
                fila[1] = estudianteiv.getId();
                fila[2] = estudianteiv.getNombre();
                fila[3] = estudianteiv.getPrimerApellido();
                fila[4] = estudianteiv.getNivel();
                fila[5] = estudianteiv.getSeccion();
                fila[6] = estudianteiv.getEspecialidad();
                modelo.addRow(fila);
            }
        tblPrincipal.setModel(modelo);
    }
    
    private void actualizarTablaAdministrativos()
    {
        modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Rol");
        Object[] fila = new Object[6];
        ArrayList<Usuario> listadeadministrativos = Controlador.listarUsuarios();
        for (Usuario usuario : listadeadministrativos)
            {
                fila[0] = "Administrativo";
                fila[1] = usuario.getId();
                fila[2] = usuario.getNombre();
                fila[3] = usuario.getPrimerApellido();
                fila[4] = usuario.getTelefono();
                fila[5] = usuario.getTipoUsuario();
                modelo.addRow(fila);
            }
        tblPrincipal.setModel(modelo);
    }
    
    private void mnListarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarEstudianteActionPerformed

        ArrayList<Estudiante> listadeestudiantes = Controlador.listarEstudiantes();
        actualizarTablaEstudiante(listadeestudiantes);
    }//GEN-LAST:event_mnListarEstudianteActionPerformed
    
    private void mnListarAdministrativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarAdministrativosActionPerformed
        actualizarTablaAdministrativos();
    }//GEN-LAST:event_mnListarAdministrativosActionPerformed
    
    private void tblPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrincipalMouseClicked
                
        int selectedRow =tblPrincipal.getSelectedRow();
        String tipo = tblPrincipal.getValueAt(selectedRow, 0).toString();
        //Estudiante estudiante = Controlador.obtenerEstudiante(id);
        //Encargado engarcado = Controlador.obtenerEncargado(id);
        //EstudianteIV estudianteiv= Controlador.obtenerEstudianteIV(id);
        //Usuario usuario = Controlador.obtenerUsuario(id);
        if(tipo == "Estudiante")
        {
            String id = tblPrincipal.getValueAt(selectedRow, 1).toString();
            Estudiante estudiante = Controlador.obtenerEstudiante(id);
            EstudianteWindow ventana = new EstudianteWindow();
            ventana.setVisible(true);
            ventana.txtNombreEstudiante.setText(estudiante.getNombre());
            ventana.txtApellidoEstudiante.setText(estudiante.getPrimerApellido());
            ventana.txtSegundoApellidoEstudiante.setText(estudiante.getSegundoApellido());
            ventana.txtCedulaEstudiante.setText(estudiante.getIdentificacion());
            ventana.txtFechaNacimiento.setText(estudiante.getFechaNacimiento());
            
            if (estudiante.getNivel()=="Primaria")
            {
                ventana.rdbPrimaria.setSelected(true);
                ventana.cbxPrimaria.setSelectedItem(estudiante.getSeccion());
                ventana.lblSeccion.setVisible(true);
                ventana.cbxPrimaria.setVisible(true);
            }else if (estudiante.getNivel()=="Tercer Ciclo")
            {
                ventana.rdbTercerCiclo.setSelected(true);
                ventana.cbxTercerCiclo.setSelectedItem(estudiante.getSeccion());
                ventana.lblSeccion.setVisible(true);
                ventana.cbxTercerCiclo.setVisible(true);
            }  
        }
        else if (tipo == "Encargado")
        {
            String id = tblPrincipal.getValueAt(selectedRow, 1).toString();
            Encargado encargado = Controlador.obtenerEncargado(id);
            EncargadoWindow ventana = new EncargadoWindow();
            ventana.setVisible(true);
            ventana.txtNombreEncargado.setText(encargado.getNombre());
            ventana.txtApellidoEncargado.setText(encargado.getPrimerApellido());
            ventana.txtSegundoApellidoEncargado.setText(encargado.getSegundoApellido());
            ventana.txtCedulaEncargado.setText(encargado.getIdentificacion());
            ventana.txtCelularEncargado.setText(encargado.getTelefono());
            ventana.txtClave.setText(encargado.getClave());
            ventana.txtDireccionEncargado.setText(encargado.getDireccion());
            ventana.txtCorreoEncargado.setText(encargado.getCorreoElectronico());
        }
        else if(tipo=="Estudiante IV")
        {
            String id = tblPrincipal.getValueAt(selectedRow, 1).toString();
            EstudianteIV estudianteiv = Controlador.obtenerEstudianteIV(id);
            EstudianteWindow ventana = new EstudianteWindow();
            ventana.setVisible(true);
            ventana.txtNombreEstudiante.setText(estudianteiv.getNombre());
            ventana.txtApellidoEstudiante.setText(estudianteiv.getPrimerApellido());
            ventana.txtSegundoApellidoEstudiante.setText(estudianteiv.getSegundoApellido());
            ventana.txtCedulaEstudiante.setText(estudianteiv.getIdentificacion());
            ventana.txtFechaNacimiento.setText(estudianteiv.getFechaNacimiento());
            ventana.rdbCuartoCiclo.setSelected(true);
            ventana.cbxCuartoCiclo.setSelectedItem(estudianteiv.getSeccion());
            ventana.lblSeccion.setVisible(true);
            ventana.cbxCuartoCiclo.setVisible(true);
        }
        else if (tipo=="Administrativo")
        {
            String id = tblPrincipal.getValueAt(selectedRow, 1).toString();
            Usuario usuario = Controlador.obtenerUsuario(id);
            AdministrativoWindow ventana = new AdministrativoWindow();
            ventana.setVisible(true);
            ventana.txtNombreAdministrativo.setText(usuario.getNombre());
            ventana.txtPrimerApellidoAdministrativo.setText(usuario.getPrimerApellido());
            ventana.txtSegundoApellidoAdministrativo.setText(usuario.getSegundoApellido());
            ventana.txtCedulaAdministrativo.setText(usuario.getIdentificacion());
            ventana.txtTelefonoAdministrativo.setText(usuario.getTelefono());
            ventana.cbxRolAdministrativo.setSelectedItem(usuario.getTipoUsuario());
            ventana.txtClaveAdministrativo.setText(usuario.getClave());
            
        }
    }//GEN-LAST:event_tblPrincipalMouseClicked
    private void listarSeccion1A()
    {
        
    }
    private void mnSeccion1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion1AActionPerformed

        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("1-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion1AActionPerformed
    private void listarSeccion2A()
    {
        
    }
    private void mnSeccion2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion2AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("2-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion2AActionPerformed
    private void listarSeccion3A()
    {
        
    }
    private void mnSeccion3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion3AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("3-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion3AActionPerformed
    private void listarSeccion4A()
    {
        
    }
    private void mnSeccion4AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion4AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("4-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion4AActionPerformed
    private void listarSeccion5A()
    {
        
    }
    private void mnSeccion5AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion5AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("5-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion5AActionPerformed
    private void listarSeccion6A()
    {
        
    }
    private void mnSeccion6AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion6AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("6-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion6AActionPerformed
    private void listarSeccion7A()
    {
        
    }
    private void mnSeccion7AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion7AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("7-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion7AActionPerformed
    private void listarSeccion8A()
    {
        
    }
    private void mnSeccion8AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion8AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("8-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion8AActionPerformed
    private void listarSeccion9A()
    {
        
    }
    private void mnSeccion9AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion9AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("9-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion9AActionPerformed
    private void listarSeccion10A()
    {
        
    }
    private void mnSeccion10AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion10AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("10-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion10AActionPerformed
    private void listarSeccion11A()
    {
        
    }
    private void mnSeccion11AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion11AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("11-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion11AActionPerformed
    private void listarSeccion12A()
    {
        
    }
    private void mnSeccion12AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSeccion12AActionPerformed
        List<Estudiante> estudiantes = Controlador.filtrarEstudiantesSeccion("12-A");
        this.actualizarTablaEstudiante(estudiantes);
    }//GEN-LAST:event_mnSeccion12AActionPerformed
    
    private void mnListarPrimariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarPrimariaActionPerformed
        
    }//GEN-LAST:event_mnListarPrimariaActionPerformed

    private void mnSeccion1AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSeccion1AMouseClicked

    }//GEN-LAST:event_mnSeccion1AMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnAdministrativos;
    private javax.swing.JMenuItem mnAgregarEstudiante;
    private javax.swing.JMenuItem mnListarAdministrativos;
    private javax.swing.JMenuItem mnListarEncargados;
    private javax.swing.JMenuItem mnListarEstudiante;
    private javax.swing.JMenuItem mnListarIV;
    private javax.swing.JMenuItem mnListarPrimaria;
    private javax.swing.JMenuItem mnListarTercerCiclo;
    private javax.swing.JMenuItem mnMecanica;
    private javax.swing.JMenuItem mnRegistrarEncargado;
    private javax.swing.JMenuItem mnSeccion10A;
    private javax.swing.JMenuItem mnSeccion11A;
    private javax.swing.JMenuItem mnSeccion12A;
    private javax.swing.JMenuItem mnSeccion1A;
    private javax.swing.JMenuItem mnSeccion2A;
    private javax.swing.JMenuItem mnSeccion3A;
    private javax.swing.JMenuItem mnSeccion4A;
    private javax.swing.JMenuItem mnSeccion5A;
    private javax.swing.JMenuItem mnSeccion6A;
    private javax.swing.JMenuItem mnSeccion7A;
    private javax.swing.JMenuItem mnSeccion8A;
    private javax.swing.JMenuItem mnSeccion9A;
    private javax.swing.JMenuItem mnSecretariado;
    public javax.swing.JTable tblPrincipal;
    // End of variables declaration//GEN-END:variables
}
