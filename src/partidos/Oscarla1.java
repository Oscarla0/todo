package partidos;

import java.util.Scanner;

public class Oscarla1 {

	public static void main(String[] args) {
		// DECLARACI�N DE VARIABLES:
		String notasAlumnos1 [][][] = new String [30][7][3];//Array de tres dimensiones que guarda la nota del alumno de las evaluaciones en cada m�dulo.
		// En la celda del m�dulo ponemos un n�mero m�s para meter el nombre del alumno.
		int i; //alumno
		int j; //m�dulo
		int k; //evaluaci�n
		String nota; //nota del alumno
		Scanner lectura = new Scanner (System.in);// Para scanner para leer datos.
		//Bucles anidados para acceder a cada posici�n del array. 1� for para los alumnos, 2� for para el modulo, 3� for para las evaluaciones.
		for (i = 1; i <= 30; i++) { // los 30 alumnos
			for (j = 1; j <= 7; j++) { // los 6 m�dulos
				System.out.println("Cual es el nombre del alumno? :");
				String nombre = lectura.nextLine();
				for (k = 1; k <= 3; k++) { // las 3 evaluaciones

					
					System.out.println("Cual es tu nota en la evaluaci�n " + k +"? : ");
					nota= lectura.nextLine();//INTRODUCIR la nota

					notasAlumnos1[i-1][j-1][k-1]=nota;//GUARDAR en el array la nota
					System.out.println("Las notas de " +nombre+ " , alumno " +i+ ", del m�dulo " +j+" del curso  son " + k+", "+k+", "+k+". Y la media es " + nota); //VISUALIZAR LA NOTA
				}
			}  
		}
	}

}