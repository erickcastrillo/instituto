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
import instituto.data.repositorios.PersonasRepositorio;
import instituto.data.repositorios.Serializador;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public class Controlador {
    private static final PersonasRepositorio repositorio = new PersonasRepositorio();
    public Controlador() {
        cargarData();
    }

    /**
     * Regresa la lista de encargados.
     * @return lista de encargados
     */
    public static ArrayList<Encargado> listarEncargados() {
        return repositorio.listarEncargados();
    }

    /**
     * Regresa una instancia de la clase Encargado usando el, id proporcionando.
     * @param id a buscar
     * @return encargado o null el no se puede encontrar usando el id o no se
     * puede castear a Encargado
     */
    public static Encargado obtenerEncargado(String id) {
        try {
            return (Encargado) repositorio.obtenerPorId(id);
        } catch (ClassCastException e) {
            return null;
        }
    }

    /**
     * Crea o agrega un objeto de la clase Encargado el repositorio
     * @param encargado a agregar
     * @return true si se agrego correctamente sino false
     */
    public static Boolean crearEncargado(Encargado encargado) {
        return repositorio.agregar(encargado);
    }

    /**
     * Toma un objeto de la clase encargado y lo actualiza en el
     * repositorio
     * @param encargado a actualizar
     * @return true si se actualizo correctamente sino false
     */
    public static Boolean updateEncargado(Encargado encargado) {
        return repositorio.actualizar(encargado);
    }

    /**
     * Toma un objeto de la clase Encargado y lo borra del repositorio
     * @param encargado a borrar
     * @return true si se borro correctamente sino false
     */
    public static Boolean borrarEncargado(Encargado encargado) {
        return repositorio.borrar(encargado);
    }

    /**
     * Regresa una lista de objetos de clase Estudiante
     * @return lista de clases Estudiante
     */
    public static ArrayList<Estudiante> listarEstudiantes() {
        return repositorio.listarEstudiantes();
    }

    /**
     * Regresa una instancia de la clase Estudiante usando el, id proporcionando.
     * @param id a buscar
     * @return encargado o null el no se puede encontrar usando el id o no se
     * puede castear a Estudiante
     */
    public static Estudiante obtenerEstudiante(String id) {
        try {
            return (Estudiante) repositorio.obtenerPorId(id);
        } catch (ClassCastException e) {
            return null;
        }
    }

    /**
     * Crea o agrega un objeto de la clase Estudiante el repositorio
     * @param estudiante a agregar
     * @return true si se agrego correctamente sino false
     */
    public static Boolean crearEstudiante(Estudiante estudiante) {
        return repositorio.agregar(estudiante);
    }

    /**
     * Toma un objeto de la clase Estudiante y lo actualiza en el
     * repositorio
     * @param estudiante a actualizar
     * @return true si se actualizo correctamente sino false
     */
    public static Boolean updateEstudiante(Estudiante estudiante) {
        return repositorio.actualizar(estudiante);
    }

    /**
     * Toma un objeto de la clase Estudiante y lo borra del repositorio
     * @param estudiante a borrar
     * @return true si se borro correctamente sino false
     */
    public static Boolean borrarEstudiante(Estudiante estudiante) {
        return repositorio.borrar(estudiante);
    }

    /**
     * Regresa una lista de objetos de clase EstudianteIV
     * @return lista de clases EstudianteIV
     */
    public static List<EstudianteIV> listarEstudiantesIV() {
        return repositorio.listarEstudiantesIV();
    }

    /**
     * Regresa una instancia de la clase EstudianteIV usando el, id proporcionando.
     * @param id a buscar
     * @return encargado o null el no se puede encontrar usando el, id o no se
     * puede castear a Estudiante
     */
    public static EstudianteIV obtenerEstudianteIV(String id) {
        try {
            return (EstudianteIV) repositorio.obtenerPorId(id);
        } catch (ClassCastException e) {
            return null;
        }
    }

    /**
     * Crea o agrega un objeto de la clase EstudianteIV el repositorio
     * @param estudiante a agregar
     * @return true si se agrego correctamente sino false
     */
    public static Boolean crearEstudianteIV(EstudianteIV estudiante) {
        return repositorio.agregar(estudiante);
    }

    /**
     * Toma un objeto de la clase EstudianteIV y lo actualiza en el
     * repositorio
     * @param estudiante a actualizar
     * @return true si se actualizo correctamente sino false
     */
    public static Boolean updateEstudianteIV(EstudianteIV estudiante) {
        return repositorio.actualizar(estudiante);
    }

    /**
     * Toma un objeto de la clase EstudianteIV y lo borra del repositorio
     * @param estudiante a borrar
     * @return true si se borro correctamente sino false
     */
    public static Boolean borrarEstudianteIV(EstudianteIV estudiante) {
        return repositorio.borrar(estudiante);
    }

    /**
     * Regresa una lista de objetos de clase Usuario
     * @return lista de clases Usuario
     */
    public static ArrayList<Usuario> listarUsuarios() {
        return repositorio.listarUsuarios();
    }

    /**
     * Regresa una instancia de la clase Usuario usando el, id proporcionando.
     * @param id a buscar
     * @return encargado o null el no se puede encontrar usando el, id o no se
     * puede castear a Estudiante
     */
    public static Usuario obtenerUsuario(String id) {
        try {
            return (Usuario) repositorio.obtenerPorId(id);
        } catch (ClassCastException e) {
            return null;
        }
    }

    /**
     * Crea o agrega un objeto de la clase Usuario el repositorio
     * @param usuario a agregar
     * @return true si se agrego correctamente sino false
     */
    public static Boolean crearUsuario(Usuario usuario) {
        return repositorio.agregar(usuario);
    }

    /**
     * Toma un objeto de la clase Usuario y lo actualiza en el
     * repositorio
     * @param usuario a actualizar
     * @return true si se actualizo correctamente sino false
     */
    public static Boolean updateUsuario(Usuario usuario) {
        return repositorio.actualizar(usuario);
    }

    /**
     * Toma un objeto de la clase Usuario y lo borra del repositorio
     * @param usuario a borrar
     * @return true si se borro correctamente sino false
     */
    public static Boolean borrarUsuario(Usuario usuario) {
        return repositorio.borrar(usuario);
    }

    /**
     * Carga datos serializados desde el disco duro
     * @return true si la data se cargo o false si no.
     */
    public static Boolean cargarData() {
        PersonasRepositorio repo = (PersonasRepositorio) Serializador.deserializar(
                "PersonasRepositorio.dat"
        );
        return repo == null;   

    }
    
    public static List<Estudiante> filtrarEstudiantesSeccion(String Seccion){
        return repositorio.filtrarEstudiantesSeccion(Seccion);
    }
    public static List<EstudianteIV> filtrarPorEspecialidad(String Especialidad){
        return repositorio.filtrarPorEspecialidad(Especialidad);
    }
    
    public static List<Estudiante> filtrarEstudiantesNivel(String Nivel){
        return repositorio.filtrarEstudiantesNivel(Nivel);
    }
    public static List<EstudianteIV> filtrarEstudiantesNivelIV(String Nivel){
        return repositorio.filtrarEstudiantesNivelIV(Nivel);
    }
    /** 
     * Guarda los datos de un objeto (en este caso el repositorio) en el
     * disco duro
     * @return true si se guardo el objeto y false si no.
     */
    public static Boolean guardarData() {
        try {
            return Serializador.serializar(repositorio, "PersonasRepositorio.dat");
        } catch(NoSuchElementException e){
            return false;
        }
    }
    
    /**
     * Metodo para retornar una lista de encargados que se registraron pero 
     * no tienen acceso
     * @return lista de encargados
     */
    public static ArrayList<Encargado> cargarEncargadosSinAcceso(){
        return repositorio.encargadosPendientesSinAcceso();
    }
}
