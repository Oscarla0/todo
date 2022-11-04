// CLASE PERSONAS
package partido15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public abstract class P1 {
	// DECLARAMOS LAS VARIABLES DE PERSONAS

	public static void main (String[]arg) {
		String numero[] =new String[3];
		boolean correcto = false;
		int i;
		String num1;
		String numero1;
		for(i=1;i>=3;i++) {
		do{
		num1 = JOptionPane.showInputDialog("Dime la letra ");
		} while (!num1.matches("[B-DF-HJ-NP-TV-Z]*") );

		        numero1 =num1;

				// PATRON QUE DEBE SEGUIR EL NOMBRE
				
		        Pattern pat = Pattern.compile("^[0-9]{4}+[B-DF-HJ-NP-TV-Z]{3}");
				// TE COMPRUEBA QUE EL NOMBRE SIGA EL PATRON

				Matcher mat = pat.matcher("[B-DF-HJ-NP-TV-Z]*");

				// IF ELSE PARA SALIR DEL DO DEL NOMBRE

				if (num1.matches("[B-DF-HJ-NP-TV-Z]*") ) {

					numero[i-1]=numero1;
					correcto  = true;

				}

				else {

					System.out.println("Solo puede ser numeros.");
					correcto = false;
				}

				// SALIDA: IMPRIME LOS NOMBRES DEL ARRAY POR VENTANA 
				JOptionPane.showMessageDialog(null, numero[i - 1]);


		}

	}
}
