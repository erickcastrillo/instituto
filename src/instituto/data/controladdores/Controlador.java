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

import java.util.ArrayList;

/**
 *
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public class Controlador implements Controladorable {
    private final PersonasRepositorio repositorio = new PersonasRepositorio();
    public Controlador() {
        this.cargarData();
    }

    /**
     * @return
     */
    @Override
    public static ArrayList<Encargado> listarEncargados() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Encargado obtenerEncargado(String id) {
        return null;
    }

    /**
     * @param encargado
     */
    @Override
    public void crearEncargado(Encargado encargado) {

    }

    /**
     * @param encargado
     * @return
     */
    @Override
    public Boolean updateEncargado(Encargado encargado) {
        return null;
    }

    /**
     * @param encargado
     * @return
     */
    @Override
    public Boolean borrarEncargado(Encargado encargado) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public ArrayList<Estudiante> listarEstudiantes() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Estudiante obtenerEstudiante(String id) {
        return null;
    }

    /**
     * @param estudiante
     */
    @Override
    public void crearEstudiante(Estudiante estudiante) {

    }

    /**
     * @param estudiante
     * @return
     */
    @Override
    public Boolean updateEstudiante(Estudiante estudiante) {
        return null;
    }

    /**
     * @param estudiante
     * @return
     */
    @Override
    public Boolean borrarEstudiante(Estudiante estudiante) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public ArrayList<EstudianteIV> listarEstudiantesIV() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public EstudianteIV obtenerEstudianteIV(String id) {
        return null;
    }

    /**
     * @param estudiante
     */
    @Override
    public void crearEstudianteIV(EstudianteIV estudiante) {

    }

    /**
     * @param estudiante
     * @return
     */
    @Override
    public Boolean updateEstudianteIV(EstudianteIV estudiante) {
        return null;
    }

    /**
     * @param estudiante
     * @return
     */
    @Override
    public Boolean borrarEstudianteIV(EstudianteIV estudiante) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public ArrayList<Usuario> listarUsuarios() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Usuario obtenerUsuario(String id) {
        return null;
    }

    /**
     * @param usuario
     */
    @Override
    public void crearUsuario(Usuario usuario) {

    }

    /**
     * @param usuario
     * @return
     */
    @Override
    public Boolean updateUsuario(Usuario usuario) {
        return null;
    }

    /**
     * @param usuario
     * @return
     */
    @Override
    public Boolean borrarUsuario(Usuario usuario) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Boolean cargarData() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Boolean guardarData() {
        return null;
    }
}
