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
 *
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public class Usuario extends Persona {

    // Constructor que acepta los atributos de la clase padre y ejecuta el
    // constructor padre
    public Usuario(
            TipoUsuario tipoUsuario, 
            String telefono, 
            String clave, 
            String identificacion, 
            String nombre, 
            String primerApellido, 
            String segundoApellido) {
        super(identificacion, nombre, primerApellido, segundoApellido);
        this.tipoUsuario = tipoUsuario;
        this.telefono = telefono;
        this.clave = clave;
    }

    // Constructor que solo acepta los atributos de esta clase
    public Usuario(TipoUsuario tipoUsuario, String telefono, String clave) {
        this.tipoUsuario = tipoUsuario;
        this.telefono = telefono;
        this.clave = clave;
    }
    
    // Costructor en blanco
    public Usuario(){}
    
    private TipoUsuario tipoUsuario;
    private String telefono;
    private String clave;
    
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
