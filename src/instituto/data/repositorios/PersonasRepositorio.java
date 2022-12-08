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

import java.util.*;
import java.util.stream.Collectors;


/**
 *
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public class PersonasRepositorio implements CRUD {

    // Creating a new ArrayList of Personas.
    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    
    /**
     * Returning the list of Personas.
     * @param filtro Used to determine what kind of class to return
     * @return ArrayList
     */
    @Override
    public ArrayList<Persona> listar(String filtro) {
        return switch (filtro) {
            case "Encargado" -> (ArrayList<Persona>) listaPersonas.stream()
                    .filter(persona -> persona instanceof Encargado)
                    .collect(Collectors.toList());
            case "Estudiante" -> (ArrayList<Persona>) listaPersonas.stream()
                    .filter(persona -> persona instanceof Estudiante)
                    .collect(Collectors.toList());
            case "EstudianteIV" -> (ArrayList<Persona>) listaPersonas.stream()
                    .filter(persona -> persona instanceof EstudianteIV)
                    .collect(Collectors.toList());
            case "Usuario" -> (ArrayList<Persona>) listaPersonas.stream()
                    .filter(persona -> persona instanceof Usuario)
                    .collect(Collectors.toList());
            default -> this.listaPersonas;
        };
    }

    @Override
    public ArrayList<Encargado> listarEncargados() {
        ArrayList<Encargado> encargados = new ArrayList<>();
        for(Persona persona : this.listaPersonas){
            if(persona instanceof Encargado encargado){
                encargados.add(encargado);
            }
        }
        return encargados;
    }

    @Override
    public ArrayList<Estudiante> listarEstudiantes() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        for(Persona persona : this.listaPersonas){
            if(persona instanceof Estudiante estudiante){
                estudiantes.add(estudiante);
            }
        }
        return estudiantes;
    }
    @Override
    public List<Estudiante> filtrarEstudiantesSeccion(String Seccion){
        return this.listaPersonas
                .stream()
                .filter(persona->persona instanceof Estudiante && ((Estudiante)persona).getSeccion().equalsIgnoreCase(Seccion))
                .map(per -> (Estudiante)per)
                .collect(Collectors.toList());
    }
    
    
    @Override
    public List<Estudiante> filtrarEstudiantesNivel(String Nivel){
        return this.listaPersonas
                .stream()
                .filter(persona->persona instanceof Estudiante && ((Estudiante)persona)
                        .getNivel().equalsIgnoreCase(Nivel))
                .map(per -> (Estudiante)per)
                .collect(Collectors.toList());
    }
    
    public List<EstudianteIV> filtrarEstudiantesNivelIV(String Nivel){
        return this.listaPersonas
                .stream()
                .filter(persona->persona instanceof Estudiante && ((Estudiante)persona)
                        .getNivel().equalsIgnoreCase(Nivel))
                .map(per -> (EstudianteIV)per)
                .collect(Collectors.toList());
    }
    public List<EstudianteIV> filtrarPorEspecialidad (String Especialidad){
        return this.listaPersonas
                .stream()
                .filter(persona->persona instanceof EstudianteIV && ((EstudianteIV)persona)
                        .getEspecialidad().equalsIgnoreCase(Especialidad))
                .map(per -> (EstudianteIV)per)
                .collect(Collectors.toList());
    }

    @Override
    public List<EstudianteIV> listarEstudiantesIV() {
        List<EstudianteIV> estudiantesIV = new ArrayList<>();
        for(Persona persona : this.listaPersonas){
            if(persona instanceof EstudianteIV estudianteIV){
                estudiantesIV.add(estudianteIV);
            }
        }
        return estudiantesIV;
    }

    @Override
    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        for(Persona persona : this.listaPersonas){
            if(persona instanceof Usuario usuario){
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }

    /**
     * Adding a new Persona to the list of Personas.
     * @param persona Persona class to add
     * @return Boolean
     */
    @Override
    public Boolean agregar(Persona persona) {
        Persona p = this.listaPersonas.stream()
                .filter(x -> Objects.equals(x.getIdentificacion(), persona.getIdentificacion()))
                .findFirst()
                .orElse(null);
        if (p == null) {
            return this.listaPersonas.add(persona);
        } else {
            return false;
        }

    }

    /**
     * Returning the first Persona that matches the name.
     * @param nombre nombre of the Persona to return
     * @return Persona
     */
    @Override
    public Persona obtenerPorNombre(String nombre) {
        return this.listaPersonas.stream()
                .filter(persona -> Objects.equals(persona.getNombre(), nombre))
                .findFirst()
                .orElse(null);
    }

    /**
     * Returning the first Persona that matches the id.
     * @param id id of the Persona to return
     * @return Persona
     */
    @Override
    public Persona obtenerPorId(String id) {
        return this.listaPersonas.stream()
                .filter(persona -> Objects.equals(persona.getId(), id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Updating a Persona in the list of Personas.
     * @param persona Persona class
     * @return Boolean
     */
    @Override
    public Boolean actualizar(Persona persona) {
        Persona p = this.obtenerPorId(persona.getId());
        int index = this.listaPersonas.indexOf(p);
        try {
            this.listaPersonas.add(index, persona);
            return true;
        } catch (IndexOutOfBoundsException e){
            return false;
        }
    }

    /**
     * Removing the first Persona that matches the id.
     * @param persona Persona class
     * @return Boolean
     */
    @Override
    public Boolean borrar(Persona persona) {
        return this.listaPersonas.removeIf(p -> Objects.equals(persona.getId(), p.getId()));
    }
    
    /**
     * Returns a list of Estudiantes from a given Encargado Id
     * @param encargadoId
     * @return 
     */
    public ArrayList<Estudiante> estudiantesPorEncargado(String encargadoId){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        for(Persona persona : this.listaPersonas){
            if(persona instanceof Estudiante || persona instanceof EstudianteIV){
                Estudiante estudiante = (Estudiante) persona;
                if (estudiante.getIdEncargado() == null ? encargadoId == null : estudiante.getIdEncargado().equals(encargadoId)) {
                    estudiantes.add(estudiante);
                }
            }
        }
        return estudiantes;
    }

    /**
     * @return
     */
    @Override
    public Boolean cargarDatos() {
        Object datos = Serializador.deserializar("database.dat");
        if(datos != null){
            this.listaPersonas = (ArrayList<Persona>) datos;
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return
     */
    @Override
    public Boolean guardarDatos() {
        return Serializador.serializar(this.listaPersonas, "database.dat");
    }
    
}
