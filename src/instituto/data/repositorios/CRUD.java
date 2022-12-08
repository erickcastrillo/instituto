/*
 * Copyright (C) 2022 Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
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

package instituto.data.repositorios;

import instituto.data.modelos.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface que se utiliza para estandarizar los métodos para los
 * repositorios de datos
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public interface CRUD {
    // Listar todas las personas
    ArrayList<Persona> listar(String filtro);
    
    // Listar todos los Encargados
    ArrayList<Encargado> listarEncargados();
    
    // Listar todos los Estudiantes
    ArrayList<Estudiante> listarEstudiantes();
    
    //Listar Secciones
    List<Estudiante> filtrarEstudiantesSeccion(String Seccion);
    
    //lisrtar estudiantes por nivel /(prim-o tercer c - o cuarto)
    List<Estudiante> filtrarEstudiantesNivel(String Nivel);
    
    // Listar todos los Estudiantes de IV ciclo
    List<EstudianteIV> listarEstudiantesIV();
    
    List<EstudianteIV> filtrarPorEspecialidad(String Especialidad);
    
    // Listar todos los Usuarios
    ArrayList<Usuario> listarUsuarios();
    // Crear una Persona
    Boolean agregar(Persona persona);
    // Devolver un objeto por el nombre
    Persona obtenerPorNombre(String nombre);
    // Devolver un objeto por el id
    Persona obtenerPorId(String id);
    // Actualizar un objeto
    Boolean actualizar(Persona persona);
    // Borrar un objeto
    Boolean borrar(Persona persona);
    // Cargar datos del disco duro
    Boolean cargarDatos();
    // Guardar datos
    Boolean guardarDatos();
}
