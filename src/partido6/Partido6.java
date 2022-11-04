package partido6;

import javax.swing.JOptionPane;

public class Partido6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; // VARIABLE BUCLE FOR
		int f; // VARIABLE BUCLE FOR
		boolean correcto = false;
		int nombre; // VARIABLE CONTADOR POSICIONES DEL NOMBRE
		
		// DECLARACION DE ARRAY NOMBRES 
		String nombres[]=new String [3];
		// BUCLE PARA SOLICITAR LOS TRES NOMBRES
		for (i = 1 ; i <= 3 ; i++) {
			// CON ESTE BUCLE REPETIMOS EL NOMBRE HASTA QUE SEA CORRECTO
			do {
				// CODIGO PARA MOSTRAR INPUT DIALOG EN PANTALLA
				nombres[i-1] = JOptionPane.showInputDialog("Introduce tu nombre:");
				nombre = nombres[i-1].length();
				for (f = 1; f <= nombre; f++) {
					if ((nombres[i-1].charAt(f-1) >= 65 && nombres[i-1].charAt(f-1) <= 90) || (nombres[i-1].charAt(f-1) >= 97 && nombres[i-1].charAt(f-1) <= 122)|| (nombres[i-1].charAt(f-1) == 'ñ' || nombres[i-1].charAt(f-1) == 'Ñ' || nombres[i-1].charAt(f-1) == 32 )) {
						correcto = true;
					}
					else {
						JOptionPane.showMessageDialog(null,"El nombre "+nombres[i-1].toUpperCase()+" introducido no es correcto, repítelo");
						correcto = false;
						f = nombre + 1;
					}
				}
			} while (!correcto);
		}
		
		for (i=1 ; i<=3 ; i++) {
			JOptionPane.showMessageDialog(null, "¡Bienvenido " +nombres[i-1]+ "!");
		}	
	}
}