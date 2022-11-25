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

import java.util.ArrayList;

/**
 * Interface que se utiliza para estandarizar los metodoos para los
 * repositorios de datos
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public interface CRUD {
    // Listar todos los objectos
    ArrayList<Object> listar(String filtro);
    // Crear un objecto
    void crear(Object object);
    // Devolver un objeto por el nombre
    Object obtenerPorNombre(String nombre);
    // Devolver un objeto por el id
    Object obtenerPorId(String id);
    // Actualizar un objeto
    void actualizar(Object object);
    // Borrar un objeto
    void borrar(String id);
}
