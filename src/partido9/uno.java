// CLASE PERSONAS
package partido9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public abstract class uno {
	// DECLARAMOS LAS VARIABLES DE PERSONAS

	public static void main (String[]arg) {
		double numero[] =new double[2];
		boolean correcto = false;
		int i;
		String num1;
		Double numero1;
		for(i=1;i>=2;i++) {
		do{
		num1 = JOptionPane.showInputDialog("Dime el numero 1");
		} while (!num1.matches("[0-9]*") );

		        numero1 = Double.parseDouble(num1);

				// PATRON QUE DEBE SEGUIR EL NOMBRE
				
				Pattern pat = Pattern.compile("[0-9]*");
				// TE COMPRUEBA QUE EL NOMBRE SIGA EL PATRON

				Matcher mat = pat.matcher("[0-9]*");

				// IF ELSE PARA SALIR DEL DO DEL NOMBRE

				if (num1.matches("[0-9]*") ) {

					numero[i-1]=numero1;
					correcto  = true;

				}

				else {

					System.out.println("Solo puede ser numeros.");
					correcto = false;
				}

				// SALIDA: IMPRIME LOS NOMBRES DEL ARRAY POR VENTANA 
				JOptionPane.showMessageDialog(null, numero[i - 1]/numero[i]);


		}

	}
}
