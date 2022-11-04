package com.bbdd;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Actividad4 {
	
	private static 	String sConsulta="Select matricula , modelo ,marca FROM vehiculos;";
	
	public static void main (String[]args) {
		listaVehiculos();
	}

	private static void listaVehiculos() {
		try {
			ConexionBBDD miConexion = new ConexionBBDD();
			miConexion.conectar();
			//Lanzamos la consulta
			ResultSet rsResultado = miConexion.ejecutarSentencia(sConsulta);
			if (rsResultado != null) {
				String matricula, modelo, marca;
				//Si hay cesultado cecuperames los datos (como un FETCH de un CURSOR)
				System.out.println("matricula \t modelo \t marca") ;
				while(rsResultado.next())
				{
					matricula = rsResultado.getString ("matricula");
					modelo = rsResultado.getString("modelo");
					marca= rsResultado.getString("marca");
					System.out.println(matricula +"\t" + modelo+"\t" + marca);
				}
			}
					else
					System.out.println("La consulta no devuelve resultados");
					miConexion.desconectar();
			}
					catch (SQLException sqlex) {
						System.out.println("Error: "+sqlex.getMessage());

					}
					
		}
}

