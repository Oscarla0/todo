// CLASE PERSONAS
package partido9;

import javax.swing.JOptionPane;

public abstract class dos {
	// DECLARAMOS LAS VARIABLES DE PERSONAS
	public static void main (String[]arg) {
		String num1;
		String num2;
		double resultado;
		Double numero1;
		Double numero2;
		String resultada;
		do {
			num1=JOptionPane.showInputDialog("Introduce un numero");
			if(num1.matches("[0-9]*")){
				JOptionPane.showMessageDialog(null,"numero introducido correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null,"numero introducido incorrectamente");
			}
		}
		while (!num1.matches("[0-9]*") );
		numero1 = Double.parseDouble(num1);

		do {
			num2 = JOptionPane.showInputDialog("Introduce otro numero");
			if(num2.matches("[0-9]*")){
				JOptionPane.showMessageDialog(null,"numero introducido correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null,"numero introducido incorrectamente");
			}
		}
		while (!num2.matches("[0-9]*") );
		numero2 = Double.parseDouble(num2);
		
		resultado=numero1/numero2;
		JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
	}


}