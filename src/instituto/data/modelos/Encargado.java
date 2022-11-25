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

/**
 * Clase usada para representar el usuario al que se le registro
 * para que pueda iniciar sesion (tutor)
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public class Encargado extends Usuario {

    // TODO: Definir bien la clase basado en los tipos de acceso
    
    // Constructor incluyendo los atributos heredados de la clase Persona
    // y la clase Usuario
    public Encargado(
            String correoElectronico, 
            String direccion, 
            TipoUsuario tipoUsuario, 
            String telefono, 
            String clave, 
            String identificacion, 
            String nombre, 
            String primerApellido, 
            String segundoApellido) {
        super(tipoUsuario, 
                telefono, 
                clave, 
                identificacion, 
                nombre, 
                primerApellido, 
                segundoApellido);
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    // Constructor incluyendo los atributos heredados de la clase Usuario
    public Encargado(
            String correoElectronico, 
            String direccion, 
            TipoUsuario tipoUsuario, 
            String telefono, 
            String clave) {
        super(tipoUsuario, telefono, clave);
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    // Constructor 
    public Encargado(String correoElectronico, String direccion) {
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }
    private String correoElectronico;
    private String direccion;
    private Boolean puedeIniciarSesion;
}
