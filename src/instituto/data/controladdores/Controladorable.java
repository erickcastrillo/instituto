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

package instituto.data.controladdores;

import instituto.data.modelos.Encargado;
import instituto.data.modelos.Estudiante;
import instituto.data.modelos.EstudianteIV;
import instituto.data.modelos.Usuario;

import java.util.ArrayList;

/**
 * Interfaz usada como contrato para todos los controladores que se necesiten
 * para interactuar con la GUI
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public interface Controladorable {
    // Encargado
    ArrayList<Encargado> listarEncargados();
    // Get
    Encargado obtenerEncargado(String id);
    // Create
    void crearEncargado(Encargado encargado);
    // Update
    Boolean updateEncargado(Encargado encargado);
    // Delete
    Boolean borrarEncargado(Encargado encargado);

    // Estudiante
    // List
    ArrayList<Estudiante> listarEstudiantes();
    // Get
    Estudiante obtenerEstudiante(String id);
    // Create
    void crearEstudiante(Estudiante estudiante);
    // Update
    Boolean updateEstudiante(Estudiante estudiante);
    // Delete
    Boolean borrarEstudiante(Estudiante estudiante);

    // Estudiante IV ciclo
    ArrayList<EstudianteIV> listarEstudiantesIV();
    // Get
    EstudianteIV obtenerEstudianteIV(String id);
    // Create
    void crearEstudianteIV(EstudianteIV estudiante);
    // Update
    Boolean updateEstudianteIV(EstudianteIV estudiante);
    // Delete
    Boolean borrarEstudianteIV(EstudianteIV estudiante);

    // Usuario
    ArrayList<Usuario> listarUsuarios();
    // Get
    Usuario obtenerUsuario(String id);
    // Create
    void crearUsuario(Usuario usuario);
    // Update
    Boolean updateUsuario(Usuario usuario);
    // Delete
    Boolean borrarUsuario(Usuario usuario);

    // Data
    Boolean cargarData();
    Boolean guardarData();
}
