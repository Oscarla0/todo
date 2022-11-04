// CLASE PERSONAS PRINCIPAL
package partido5j1;
import java.util.Scanner;

import javax.sound.sampled.BooleanControl;

public class PersonasPrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner afirmacion = new Scanner(System.in);
		Jugadores[] jugador = new Jugadores [25];
		// DECLARAMOS VARIABLES
		
		String nombre;
		double peso;
		double altura;
		double imc;
		int dorsal;
		String equipo;
		String posicion;
		String comentarios;
		boolean kapput;
		// DECLARAMOS ARRAYS LISTS PARA GENERAR AUTOMATICAMENTE LOS JUGADORES

	
		String[] nombres= {"Cristiano", "Messi", "Dybala", "Vinicius", "Ansufati", "Neuer", "Pablo", "Alvaro", "Asiel"};
		String [] equipos = {"PSG", "Barcelona", "Madrid", "Manchester United", "Sevilla", "Bayer" };
		String [] posiciones = {"Portero", "Central", "Lateral", "Medio centro", "Extremo", "Delantero" };
		
		// GENERAMOS JUGADORES
		do {
			
			System.out.println("Quieres crear un jugador? Si/No");
			String afirmacions = afirmacion.next();
			if (afirmacions.equalsIgnoreCase("Si")) {
			int i = 1;
			// DE ESTA FORMA GENERAMOS DATOS ALEATORIOS
			nombre =  nombres[(int)(Math.floor(Math.random()*((nombres.length-1)-0+1)+0))];
			posicion =  posiciones[(int)(Math.floor(Math.random()*((posiciones.length-1)-0+1)+0))];
			equipo =  equipos[(int)(Math.floor(Math.random()*((equipos.length-1)-0+1)+0))];
			// PEDIMOS EL PESO Y LA ALTURA DEL JUGADOR POR TECLADO
			System.out.println("Introduzca el peso del jugador");
			peso = entrada.nextDouble();
			System.out.println("Introduzca la altura del jugador");
			altura = entrada.nextDouble();
			// LOS DATOS DE IMC Y COMENTARIOS LO DEJAMOS VACIOS
			imc = 0;
			comentarios = null;
			dorsal = (int) (Math.random()*99+1);
			jugador[i]= new Jugadores(nombre, peso, altura, imc, dorsal, equipo, posicion, comentarios);
			// COMO COMENTARIOS PONEMOS EL ESTADO DEL JUGADOR
			imc = jugador[i].imc();
			i++;
			}
			else if(afirmacions.equalsIgnoreCase("No")) {
			kapput = true;
			}
			kapput = true;
		}while(kapput==true);
		/*
jugador[0]= new Jugadores(“Luis”, 85, 1.74, imc, 12, “PSG”, “gamer”, “comentarios”);
jugador[1]= new Jugadores(“Sebas”, 65, 1.74, imc, 12, “PSG”, “gamer”, “comentarios”);
jugador[2]= new Jugadores(“Jane”, 105, 1.74, imc, 12, “PSG”, “gamer”, “comentarios”);

*/
		//IMPRIMIMOS LOS DATOS DE JUGADORES
		for (int i = 1; i<=5; i++) {
			jugador[i].ImprimirDatos();
			jugador[i].estado();
			System.out.println(" ");
			System.out.println("SIGUIENTE JUGADOR");
		}
		entrada.close();
	}
}
