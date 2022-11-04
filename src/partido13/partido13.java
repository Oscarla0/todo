package partido13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class partido13 {
    public static void main(String ars[]){
        try {
        	//Damos direccion al crear el archivo
            String ruta = "src/partido13/filename.txt";
            // contenido en el archivo txt
            String contenido = "Oscar es guapo";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
            	//creamos el archivo txt
                file.createNewFile();
            }
            else {
            	//si el archivo no existe
    System.out.println("Ojo cuidao, que el fichero NO EXISTE");
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}