package partido17;

import java.io.File;
import java.util.Scanner;

public class Partido12 {

public static void main(String[] args) {

// Fichero del que queremos leer
File fichero = new File("src//partido17//lolo.txt");// LE INDICAMOS LA RUTA DEL FICHERO QUE CREAMOS PREVIAMENTE Y QUEREMOS QUE LEA
Scanner s = null;

try {
// Leemos el contenido del fichero
System.out.println("... Leemos el contenido del fichero ...");
s = new Scanner(fichero);

// Leemos linea a linea el fichero
while (s.hasNextLine()) {
String linea = s.nextLine(); // Guardamos la linea en un String
System.out.println(linea);      // Imprimimos la linea
}

} catch (Exception ex) {
System.out.println("Mensaje: " + ex.getMessage());
} finally {
// Cerramos el fichero tanto si la lectura ha sido correcta o no
try {
if (s != null)
s.close();
} catch (Exception ex2) {
System.out.println("Mensaje 2: " + ex2.getMessage());
}
}
}
}