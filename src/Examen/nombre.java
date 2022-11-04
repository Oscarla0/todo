package Examen;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class nombre {
	String yo_nombre;
	String yo_apellido;
	
	public  void ej2() {
		int error = 0; // Contador de errores, no puede haber mas de 3
		yo_nombre = "Oscar"; 
		char[] yo_nombreAux = yo_nombre.toCharArray(); // para contar el numero de letras de mi nombre
		yo_apellido = "Wang";
		char[] yo_apellidoAux = yo_apellido.toCharArray();  // para contar el numero de letras de mi apellido
		char[] nombreAux;
		boolean correcto = true;
		Scanner reader = new Scanner (System.in); // Preparamos un scanner que reciba los inputs del usuario
		System.out.println("Introduzca el nombre");
		String nombre = reader.nextLine();
		nombreAux = nombre.toCharArray();
		if(nombreAux.length > yo_nombreAux.length) { // Si el nombre introducido tiene mas letras que el mio, lo volvemos a introducir hasta que sea correcto
			correcto = false;
			while(correcto ==false && error!=3) {
				error++;
				correcto =true;
				System.out.println("¡Error! Introduce el apellido bien, el apellido tiene que tener igual o menos caracteres que mi apellido:");
				nombre = reader.nextLine();
				nombreAux = nombre.toCharArray();
				if(nombreAux.length > yo_nombreAux.length)
					correcto = false;
				
			}
		}
		for(char c : nombreAux) {
			if(Character.isDigit(c)) {
				correcto = false;
			}
				
		}
		while (correcto ==false && error!=3) {// Si el nombre contiene digitos, lo volveremos a introducir hasta que sea correcto
			error++;
			System.out.println("ERROR! No puede haber digitos en el nombre");
			System.out.println("Introduzca de nuevo el nombre");
			nombre = reader.nextLine();
			nombreAux = nombre.toCharArray();
			correcto = true;
			for(char c : nombreAux) {
				if(Character.isDigit(c)) {
					correcto = false;
				}
					
			}
		}
		System.out.println("Introduzca el apellido");
		String apellido = reader.nextLine();
		
		if(error <3) {
			
			if(yo_nombre.compareTo(nombre) < 0)	// El nombre introducido va despues del mio
				System.out.println("La persona introducida va DESPUES que yo en un listado alfabetico");
			else if(yo_nombre.compareTo(nombre) == 0) { // Es el mismo nombre, procedemos a comparar el apellido
				if(yo_apellido.compareTo(apellido) < 0)	// El apellido introducido va despues del mio
					System.out.println("La persona introducida va DESPUES que yo en un listado alfabetico");
				else if(yo_apellido.compareTo(apellido) == 0 ) // Se ha introducido la misma persona
					System.out.println("Se ha introducido la misma persona");
				else{	// El apellido introducido va antes del mio
					System.out.println("La persona introducida va ANTES que yo en un listado alfabetico");
				}
			}
			else {	// El nombre introducido va antes del mio
				System.out.println("La persona introducida va ANTES que yo en un listado alfabetico");
			}
		}
		else {
			System.out.println("Han habido demasiados intentos fallidos");
		}
			
	}
}