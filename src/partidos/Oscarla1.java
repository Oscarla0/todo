package partidos;

import java.util.Scanner;

public class Oscarla1 {

	public static void main(String[] args) {
		// DECLARACIÓN DE VARIABLES:
		String notasAlumnos1 [][][] = new String [30][7][3];//Array de tres dimensiones que guarda la nota del alumno de las evaluaciones en cada módulo.
		// En la celda del módulo ponemos un número más para meter el nombre del alumno.
		int i; //alumno
		int j; //módulo
		int k; //evaluación
		String nota; //nota del alumno
		Scanner lectura = new Scanner (System.in);// Para scanner para leer datos.
		//Bucles anidados para acceder a cada posición del array. 1º for para los alumnos, 2º for para el modulo, 3º for para las evaluaciones.
		for (i = 1; i <= 30; i++) { // los 30 alumnos
			for (j = 1; j <= 7; j++) { // los 6 módulos
				System.out.println("Cual es el nombre del alumno? :");
				String nombre = lectura.nextLine();
				for (k = 1; k <= 3; k++) { // las 3 evaluaciones

					
					System.out.println("Cual es tu nota en la evaluación " + k +"? : ");
					nota= lectura.nextLine();//INTRODUCIR la nota

					notasAlumnos1[i-1][j-1][k-1]=nota;//GUARDAR en el array la nota
					System.out.println("Las notas de " +nombre+ " , alumno " +i+ ", del módulo " +j+" del curso  son " + k+", "+k+", "+k+". Y la media es " + nota); //VISUALIZAR LA NOTA
				}
			}  
		}
	}

}