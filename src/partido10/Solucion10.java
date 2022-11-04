

package partido10;

/*
-PARTIDO 10-
Adjunta el cÛdigo de una estructura de datos que pida 3 nombres.
El programa no admite nombres iguales. 
Mostrar todos los nombres ordenados alfabÈticamente.
*/


import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

import java.util.Set;
import java.util.SortedSet;

public class Solucion10 {
	public static void main(String[] args) {
		//Escogemos "TreeMap" porque: No son Elementos Clave-Valor, No se pueden repetir e
		//Importa el orden y ese orden depende del Elemento (alfabÈtico)
		
		//DECLARACI”N DE VARIABLES Y ESTRUCTURAS DE DATOS
		SortedSet<String> listaNombres = new TreeSet<>();

		int i;//Control del bucle for (3 usuarios)
		String nombre ; //Guardar nombre
		boolean chivato = false; //Control del do..while

		Matcher mat; //Control de pattern
		Pattern pat = Pattern.compile("[a-zA-ZÒ—·ÈÌÛ˙¡…Õ”⁄\s+]{1,50}"); //Pattern para solo TEXTO
		
		//ACCI”N: BUCLE QUE PREGUNTE 3 NOMBRES
		for(i=1; i<=3; i++) {
			//ACCI”N: BUCLE QUE SE REPITE CUANDO EL NOMBRE EST… MAL ESCRITO O YA EXISTA
			do {
				//ENTRADA Y SALIDA: PREGUNTA EL NOMBRE AL USUARIO Y SE GUARDA
				nombre = JOptionPane.showInputDialog("Inserte un nombre:");
				mat = pat.matcher(nombre); //Guarda el nombre para que cumpla un patrÛn
				
				//ACCI”N: SI EL NOMBRE CUMPLE EL PATR”N SIGUE SINO SE VUELVE A PEDIR EL NOMBRE
				if (mat.matches()) {
					//ACCI”N: SI EL NOMBRE EST¡ EN LA LISTA SE AGREGA, SINO REPITE
					if(!(listaNombres.contains(nombre))) {
						//ACCI”N Y SALIDA: INSERTA AL NOMBRE AL TREESET Y SE INDICA AL USUARIO
						listaNombres.add(nombre);
						JOptionPane.showMessageDialog(null, "-Nombre agregado correctamente-");
						chivato = false; // Salir
					}else {
						//SALIDA: SE DICE QUE EST¡ MAL Y REPITE EL BUCLE
						JOptionPane.showMessageDialog(null, "-Ese nombre ya existe, prueba OTRO NOMBRE-");
						chivato = true; // Repetir
					}			
				} else {
					// ACCI”N Y SALIDA: AL SER INCORRECTO REPITE EL BUCLE Y MUESTRA UN MENSAJE POR
					// VENTANA
					JOptionPane.showMessageDialog(null, "-Ese nombre no es v·lido, prueba otra vez (SOLO CON LETRAS)-");
					chivato = true; // Repetir
				}
			}while(chivato == true);	
		}
		 
		//SALIDA: MOSTRAMOS LOS NOMBRES, COMO ES UN TREESET, YA LOS SACA ORDENADOS

		JOptionPane.showMessageDialog(null, "Los nombres son: "+listaNombres);

	}
} 
