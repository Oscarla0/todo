// CLASE PERSONAS
package partido10;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public abstract class Partido10 {
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
						

					}

					else {

						System.out.println("Recuerde que el nombre solo puede llevar letras, introduzcalo de nuevo: ");
						correcto = false;
					}

					// SALIDA: IMPRIME LOS NOMBRES DEL ARRAY POR VENTANA 
					JOptionPane.showMessageDialog(null, nombre[i - 1]);

				}while(!correcto);

		}
		Set <String> conjunto = Set.of(nombre) ;
		TreeSet <String> nombres= new TreeSet<>(conjunto);
		String primero = nombres.first();
		String ultimo = nombres.last();
		System.out.println("Primer nombre:" + primero);
		System.out.println("Segundo nombre:" + nombres.higher(primero));
		System.out.println("Tercer nombre:" + ultimo);
	

	}
}