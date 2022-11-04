// CLASE PERSONAS
package partido6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public abstract class Nombre {
	// DECLARAMOS LAS VARIABLES DE PERSONAS
	
		public static void main (String[]arg) {
			String nombre[] =new String[3];
			boolean correcto = false;
			int chivato = 0;
			int i;
			for (i = 1; i <=3; i++) {
				do {

					String nombre_guardar = JOptionPane.showInputDialog("Diga su nombre por favor");

					// PATRON QUE DEBE SEGUIR EL NOMBRE

					Pattern pat = Pattern.compile("[a-zA-ZñÑáéíóúÁÉÍÓÚ\s+]{2,50}");

					// TE COMPRUEBA QUE EL NOMBRE SIGA EL PATRON

					Matcher mat = pat.matcher(nombre_guardar);

					// IF ELSE PARA SALIR DEL DO DEL NOMBRE

					if (mat.matches()) {

						nombre[i-1]=nombre_guardar;
						correcto  = true;
						chivato=1;

					}

					 else {

						System.out.println("Recuerde que el nombre solo puede llevar letras, introduzcalo de nuevo: ");
						 correcto = false;
			}
				
				// SALIDA: IMPRIME LOS NOMBRES DEL ARRAY POR VENTANA 
					JOptionPane.showMessageDialog(null, nombre[i - 1]);

			}while(!correcto);
				
				
		}
			for (i = 1; i <=3; i++) {
				System.out.println(nombre[i-1]);
			}
		}
}
