package practica3;


public class Principal {


	public static void main(String[] args) {

		Jugadores[] jugador = new Jugadores [25];

		// DECLARAMOS VARIABLES

		int ano;

		int dorsal;

		// DECLARAMOS ARRAYS LISTS PARA GENERAR AUTOMATICAMENTE LOS JUGADORES

		String[] nombres= {"Cristiano", "Messi", "Dybala", "Vinicius", "Ansufati", "Neuer", "Pablo", "Alvaro", "Asiel"};

		String [] apellidos= {"Gomez", "Guerrero", "Cardenas","Jimenez", "Cardona", "Cardoso", "Martinez", "Carillo", "Iglesias"};

		String [] ciudades= {"Paris", "Barcelona", "Madrid","Buenos aires", "Berlin", "Praga", "Roma", "Budapest", "Atenas"};

		String [] paises= {"España", "Francia", "Alemania","Inglaterra", "Rusia", "Italia", "Portugal", "Argentina", "Colombia"};

		String [] posiciones = {"Portero", "Central", "Lateral", "Medio centro", "Extremo", "Delantero" };

		String [] equipos = {"PSG", "Barcelona", "Madrid", "Manchester United", "Sevilla", "Bayer" };

		

		// GENERAR JUGADORES ALEATORIOS

		for (int i = 1; i <= 5; i++) {

			ano = (int) (Math.random()*(2000-1970)+1970);

			dorsal = (int) (Math.random()*99+1);

			jugador[i]= new Jugadores
					(null, nombres[(int)(Math.floor(Math.random()*
							((nombres.length-1)-0+1)+0))],
							apellidos[(int)(Math.floor(Math.random()*
									((apellidos.length-1)-0+1)+0))], ano, ciudades
							[(int)(Math.floor(Math.random()*((ciudades.length-1)-0+1)+0))],
							paises[(int)(Math.floor(Math.random()*((paises.length-1)-0+1)+0))], 
							dorsal, equipos[(int)(Math.floor(Math.random()*((equipos.length-1)-0+1)+0))],
							posiciones[(int)(Math.floor(Math.random()*((posiciones.length-1)-0+1)+0))], null);

			

		}

		

		//IMPRIMIMOS LOS DATOS DE JUGADORES

		for (int i = 1; i<=5; i++) {

			System.out.println(jugador[i].toString());

			jugador[i].edad();

		}

	}

}