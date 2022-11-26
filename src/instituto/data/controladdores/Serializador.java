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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Clase usada para serializar y deserializar datos y guardarlos en el disco duro.
 * @author Erick Castrillo Arroyo <ecastrillo@edu.upolitecnica.cr>
 * 603630082EC
 */
public class Serializador {
    /***
     * Serializa una clase u Objeto y lo guarda en el disco duro
     * @param obj Objeto o Clase a Serializar
     * @param fileName Ubicación del archivo a guardar
     * @throws IOException IOException
     */
    public static void serializar(Object obj, String fileName) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        fos.close();
    }

    /***
     * Deserializa un archivo y lo regresa como un objeto que después se puede castear a una clase concreta
     * @param fileName Ubicación del archivo a guardar
     * @return objeto o clase
     * @throws IOException IOException
     * @throws ClassNotFoundException ClassNotFoundException
     */
    public static Object deserializar(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }
}
