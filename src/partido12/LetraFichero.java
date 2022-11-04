
package partido12;
import java.io.FileWriter;
public class LetraFichero {

public static void main(String[] args) {

String[] lineas = { "1", "2", "3", "4", "5", "6", "7", "8","9"};

/* FORMA 1 DE ESCRITURA */
FileWriter fichero = null;
try {

fichero = new FileWriter("src//partido12//rober.txt");//LE ESPECIFICAMOS LA RUTA DONDE QUEREMOS QUE GUARDE EL FICHERO QUE VA A CREAR

// Escribimos linea a linea en el fichero
for (String linea : lineas) {
/*1*/ fichero.write(  "\n" +"Volando, volando, siempre arriba (Siempre arriba) " );
/*2*/ fichero.write( "\n" + " imagina, tú y yo, lucharemos los dos.");
/*3*/ fichero.write( "\n" + " Volando, volando, siempre arriba (Siempre arriba)");
/*4*/ fichero.write( "\n" + " imagina, nunca a un amigo abandonaremos. ");
/*5*/ fichero.write( "\n" + " Juntos podremos romper un iceberg. ");
/*6*/ fichero.write( "\n" + " Unamos nuestras manos,");
/*7*/ fichero.write( "\n" + " combatamos al mal que nos persigue.");
/*8*/ fichero.write( "\n" + " Luz, fuego, destrucción,");
/*9*/ fichero.write( "\n" + " el mundo puede ser una ruina,");


fichero.close(); // CIERRA EL FICHERO
}
} catch (Exception ex) {
System.out.println("Mensaje de la excepción: " + ex.getMessage());
}
}
}
