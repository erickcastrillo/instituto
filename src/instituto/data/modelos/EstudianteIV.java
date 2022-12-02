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
 * Clase que representa a un estudiante de IV ciclo
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public class EstudianteIV extends Estudiante {

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Constructor incluyendo los atributos heredados de la clase Persona
    public EstudianteIV(
            String especialidad,
            String fechaNacimiento,
            String nivel,
            String seccion, 
            String idEncargado, 
            String identificacion, 
            String nombre, 
            String primerApellido, 
            String segundoApellido) {
        super(
                fechaNacimiento, 
                nivel, 
                seccion, 
                idEncargado, 
                identificacion, 
                nombre, 
                primerApellido, 
                segundoApellido);
        this.especialidad = especialidad;
    }

    // Constructor incluyendo los atributos heredados de la clase Estudiante
    public EstudianteIV(
            String especialidad,
            String fechaNacimiento,
            String nivel,
            String seccion, 
            String idEncargado) {
        super(fechaNacimiento, nivel, seccion, idEncargado);
        this.especialidad = especialidad;
    }

    // Constructor incluyendo los atributos solo de esta clase
    public EstudianteIV(String especialidad) {
        this.especialidad = especialidad;
    }
    
    // Constructor vacio
    public EstudianteIV(){}
    
    private String especialidad;
}
