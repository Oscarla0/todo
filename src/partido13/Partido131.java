package partido13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class Partido131 {
public static void eliminarFichero(File fichero) {
	// si el archivo txt no existe
    if (!fichero.exists()) {
    	//entonces
        System.out.println("El fichero no existe.");
        // si el archivo existe
    } else {
    	//eliminamos ese archivo
        fichero.delete();
        System.out.println("El fichero fue eliminado.");
    }

}

public static void main(String[] args) {
	//La ubicacion del archivo para eliminarlo
    File fichero = new File("src/partido13/filename.txt");
    eliminarFichero(fichero);

}}