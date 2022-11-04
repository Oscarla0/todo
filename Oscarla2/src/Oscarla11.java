import java.util.ArrayList;
import java.util.Scanner;
public class Oscarla11 {
public static void main(String[] args) {
	Scanner pregunta = new Scanner(System.in);
	//DECLARACIÓN DE VARIABLES:
	String nombre; //PARA LEER LA PALABRA
	int chivatocinco=1;//PARA SALIR DEL BUCLE si no son 5 letras
	int chivatoletras=0;//PARA SALIR DEL BUCLE si no son solo letras
	int a;// para el for
	 
	// DO .. WHILE para pedir la palabra hasta que tenga 5 letras
	do {
		System.out.println("Escriba una palabra de 5 letras");
		nombre = pregunta.nextLine();

		if (nombre.length()==5) {
			chivatocinco=0; 
			 
			for ( a=1; a<=5; a++) {
		 
				if ((nombre.charAt(a-1) >= 65 && nombre.charAt(a-1)<= 90) || (nombre.charAt(a-1) >= 97 && nombre.charAt(a-1) <= 122))  {
					chivatoletras=0;
						
				} else {
					chivatoletras=1;
					System.out.println("El carácter "+ nombre.charAt(a-1)+" no es una letra. Escribe solo letras");
				}
		    }
		}
		else {
			chivatocinco=1; // Se pone a 0 para indicar que no son 5 
			System.out.println("Anda, escribe bien 5 letras, ni más ni menos");
		}
	} while (chivatocinco!=0 || chivatoletras!=0);
	
	System.out.println("Palabra correcta: " + nombre);


	
}
}