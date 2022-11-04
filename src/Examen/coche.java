package Examen;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class coche extends vehiculo {
	
	
	private FileWriter f ; // Preparamos un buffer de escritor para modificar el archivo


	@Override
	public void Aniadirfinal() {

		try {
			f = new FileWriter("src//Examen//Examen.txt"); // Preparamos un buffer de escritor para modificar el archivo
		} catch (IOException e) {
			e.printStackTrace(); // si falla al abrir el archivo, salta error
		}
		Scanner reader = new Scanner (System.in); // Preparamos un scanner que reciba los inputs del usuario
		String nombre = reader.nextLine();
		try {
			f.write(nombre+" ");		// Sobreescribimos el fichero adjuntando el nombre recibida de la entrada estandar
			f.close();                  // Y a continuacion cerramos el fichero en cuestion
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Nuevalinea(String matricula, String modelo, String color, String fechaDeCompra) {
		try {
			f = new FileWriter("src//Examen//Examen.txt"); // Preparamos un buffer de escritor para modificar el archivo
		} catch (IOException e) {
			e.printStackTrace(); // si falla al abrir el archivo, salta error
		}
		try {
			f.write("/n");  //Salto de linea
			f.write(matricula+", "+modelo+", "+color+", "+fechaDeCompra); // Escribimos los objetos del coche en cuestion
			f.close();      // Cerramos el fichero
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}