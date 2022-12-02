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

package instituto.data.modelos;

import java.util.Date;

/**
 * Clase usada para repsentar a un Estudiante
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public class Estudiante extends Persona {

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(String idEncargado) {
        this.idEncargado = idEncargado;
    }

    // Constructor incluyendo los atributos heredados de la clase Persona
    public Estudiante(
            String fechaNacimiento,
            String nivel,
            String seccion, 
            String idEncargado, 
            String identificacion, 
            String nombre, 
            String primerApellido, 
            String segundoApellido) {
        super(identificacion, nombre, primerApellido, segundoApellido);
        this.fechaNacimiento = fechaNacimiento;
        this.nivel = nivel;
        this.seccion = seccion;
        this.idEncargado = idEncargado;
    }

    // Constructor incluyendo los atributos solo de esta clase
    public Estudiante(
            String fechaNacimiento,
            String nivel,
            String seccion, 
            String idEncargado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nivel = nivel;
        this.seccion = seccion;
        this.idEncargado = idEncargado;
    }
    
    // Constructor vacio
    public Estudiante(){}
    
    private String fechaNacimiento;
    private String nivel;
    private String seccion;
    private String idEncargado;
}
