package partido14;

import javax.swing.JOptionPane;
import java.io.*; 
public class partido {
public static void main(String[] args) throws IOException {
    
  byte opcion=0;


  do{ // EL MENU DE OPCIONES PARA SELECCIONAR CUAL QUEREMOS 
     opcion=Byte.parseByte(JOptionPane.showInputDialog(
     "**MENU PRINCIPAL**\n"
   + "1. CREAR FICHERO\n"
   + "2. BORRAR FICHERO\n"
   + "3. AGREGAR TEXTO AL FICHERO\n"
   + "4. VER UN FICHERO\n"
   + "5. SALIR\n"
   + "ELIJA UNA OPCION "));
      
     switch(opcion){
        case 1: // CASO 1 CREAMOS EL FICHERO 
        BufferedWriter bw=new BufferedWriter(new FileWriter(("src//programacion//fichero_Prueba.txt")));
                     escribeFichero(bw);
                     bw.flush();
           JOptionPane.showMessageDialog(null, "CREANDO FICHERO");
           break;
        case 2: // CASO 2 BORRAMOS EL FICHERO 
        File fichero = new File("src//programacion//fichero_Prueba.txt"); // LE INDICAMOS LA RUTA DEL FICHERO 
           eliminarFichero(fichero); 
           JOptionPane.showMessageDialog(null, " BORRADO CON EXITO");
           break;
        case 3:  // CASO 3 AÑADIMOS TEXTO 
        BufferedWriter bw2=new BufferedWriter(new FileWriter(("src//programacion//fichero_Prueba.txt")));
        escribeFichero(bw2); 
               //Escribimos en el fichero
               bw2.write("Agregando otro poco de texto al fichero que he creado ");
               bw2.newLine();
               bw2.write("Esta es la ultima linea lo siento.");
               bw2.flush();
           
           JOptionPane.showMessageDialog(null, "AÑADIENDO TEXTO");
           break;
        case 4: // CASO 4 VISUALIZAMOS EL ARCHIVO LINEA A LINEA 
        BufferedReader br=new BufferedReader(new FileReader("src//programacion//fichero_Prueba.txt"));
        leeFichero(br); 
           JOptionPane.showMessageDialog(null, "VISUALIZADO FICHERO SELECCIONADO CON EXITO LINEA A LINEA");
           break;
        case 5:
           opcion=5;
           break;
        default:
           JOptionPane.showMessageDialog(null, "Opcion Invalida");
           break;  
     }
     
  }while(opcion!=5);  // OPCION 5 PARA SALIR DE LA EJECUCION  
  System.exit(0);
  // METODOS UTILIZADOS
  }
public static void escribeFichero(BufferedWriter bw) throws IOException{
       //Escribimos en el fichero
       bw.write("Hola soy Victor Alumno de DAM");
       bw.newLine();
       bw.write("Seguimos en el mismo Archivo ");
       bw.flush();
   }
public static void leeFichero(BufferedReader br) throws IOException{
       //Leemos el fichero y lo mostramos por pantalla
       String linea=br.readLine();
       while(linea!=null){
        JOptionPane.showMessageDialog(null, linea);// LEE EL FICHERO LINEA A LINEA 
           linea=br.readLine();        }
   }
public static void eliminarFichero(File fichero) { // ESTA ES UNA CLASE PARA BORRAR EL FICHERO CREADO 

   if (!fichero.exists()) {
    JOptionPane.showMessageDialog(null, "El fichero no existe."); // SI EL FICHERO QUE INDICAMOS NO EXISTIERA NOS SALDRÍA ESTO POR PANTALLA
   } else {
       fichero.delete();
       JOptionPane.showMessageDialog(null, "El fichero fue eliminado."); // SI EL FICHERO QUE INDICAMOS EXISTIERA SE BORRARÍA Y NOS INDICARIA QUE FUE ELIMINADO 
   }

}
}