
package partido17;
import java.io.FileWriter;
public class LetraFichero {

public static void main(String[] args) {

String[] lineas = { "1", "2", "3", "4"};

/* FORMA 1 DE ESCRITURA */
FileWriter fichero = null;
try {

fichero = new FileWriter("src//partido17//lolo.txt");//LE ESPECIFICAMOS LA RUTA DONDE QUEREMOS QUE GUARDE EL FICHERO QUE VA A CREAR

// Escribimos linea a linea en el fichero
for (String linea : lineas) {
/*1*/ fichero.write(  "\n" +"Tú no puedes volver atrás" );
/*2*/ fichero.write( "\n" + "porque la vida ya te empuja");
/*3*/ fichero.write( "\n" + "como un aullido interminable.");
/*4*/ fichero.write( "\n" + " imagina, nunca a un amigo abandonaremos. ");

fichero.close(); // CIERRA EL FICHERO
}
} catch (Exception ex) {
System.out.println("Mensaje de la excepción: " + ex.getMessage());
}
}
}
