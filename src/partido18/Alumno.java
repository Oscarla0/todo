package partido18;

import java.util.Scanner;

public class Alumno {
public static void main(String[] args) {
	//Datos
	Scanner leer = new Scanner(System.in);
	int alumnos;
	int modulos;
	int evaluaciones = 0;
	String nombre;
	String modulo;
	double nota;
	double acomulador = 0;
	double notasm1 = 0;
	double notasm2 = 0;
	double notasm3 = 0;
	double notasm4 = 0;
	double notasm11 = 0;
	double notasm22 = 0;
	double notasm33 = 0;
	double notasm44 = 0;
	double mediaalumno1 = 0;
	double mediaalumno2 = 0;
	//Array nombres
	String nombres []= new String [5];
	//Introducir datos *nombre*
 for (alumnos=1; alumnos<=2; alumnos++){
	 System.out.println("Dime el nombre del Alumno");
	 nombre = leer.next();
	 nombres [alumnos-1]=nombre;
	 //introducir datos *modulo*
	 for (modulos=1; modulos<=4; modulos++){
		 System.out.println("Dime el módulo "+modulos);
		 modulo = leer.next();
		 acomulador=0;
		 //introducir datos *nota*
		 for (evaluaciones=1; evaluaciones<4; evaluaciones++){
			 System.out.println("Dime la nota de la evaluación "+evaluaciones+" del alumno "+nombre+" en el módulo "+modulo);
			 nota = leer.nextDouble();
			 //total
			 acomulador=acomulador+nota;
			 
		 }
		 //if alumno 1
		 if (alumnos==1) {
			 //media
		 if (modulos==1) {
			 notasm1 = acomulador;
		 }
		 else if (modulos==2) {
			 notasm2 = acomulador;
		 }
		 else if (modulos==3) {
			 notasm3 = acomulador;
		 }
		 else {
			 notasm4 = acomulador;
		 }
		 }//else alumno 2
		 else {
			 //media
			 if (modulos==1) {
				 notasm11 = acomulador;
			 }
			 else if (modulos==2) {
				 notasm22 = acomulador;
			 }
			 else if (modulos==3) {
				 notasm33 = acomulador;
			 }
			 else {
				 notasm44 = acomulador;
			 }
		 }
	 }
	 //media alumno1
	 if (alumnos == 1) {
		 mediaalumno1 = (notasm1+notasm2+notasm3+notasm4)/12;
		 
	 }//media alumno2
	 else {
		 mediaalumno2 = (notasm11+notasm22+notasm33+notasm44)/12;
	 }
 }
 // nota del alumno 1 , su media y la media de modelos
 System.out.println("La media del "+nombres [alumnos-3]+" es "+ mediaalumno1);
 System.out.println("La media del módulo 1 es "+ notasm1/3);
 System.out.println("La media del módulo 2 es "+ notasm2/3);
 System.out.println("La media del módulo 3 es "+ notasm3/3);
 System.out.println("La media del módulo 4 es "+ notasm4/3);
//nota del alumno 2 , su media y la media de modelos
 System.out.println("La media del "+nombres [alumnos-2]+" es "+ mediaalumno2);
 System.out.println("La media del módulo 1 es "+ notasm11/3);
 System.out.println("La media del módulo 2 es "+ notasm22/3);
 System.out.println("La media del módulo 3 es "+ notasm33/3);
 System.out.println("La media del módulo 4 es "+ notasm44/3);

}
}