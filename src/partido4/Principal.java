package partido4;

import java.util.Scanner;

public class Principal {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			Jugadores[] jugador = new Jugadores [25];
			// DECLARAMOS VARIABLES
			Scanner nombres = new Scanner (System.in);
			System.out.println("Introduzca tu nombre");
			String nombre =nombres.next();
			double peso;
			double altura;
			double imc;

			

			// GENERAMOS JUGADORES
			 int i=1;
				// DE ESTA FORMA GENERAMOS DATOS ALEATORIOS

				// PEDIMOS EL PESO Y LA ALTURA DEL JUGADOR POR TECLADO
				System.out.println("Introduzca el peso del jugador");
				peso = entrada.nextDouble();
				System.out.println("Introduzca la altura del jugador");
				altura = entrada.nextDouble();
				// LOS DATOS DE IMC Y COMENTARIOS LO DEJAMOS VACIOS
				imc = 0;

				jugador[i]= new Jugadores(nombre, peso, altura, imc);
				// COMO COMENTARIOS PONEMOS EL ESTADO DEL JUGADOR
				imc = jugador[i].imc();
			
			
			//IMPRIMIMOS LOS DATOS DE JUGADORES

				jugador[i].ImprimirDatos();
				jugador[i].estado();
				System.out.println(" ");
			
			entrada.close();
		}
	}

