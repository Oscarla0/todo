package Examen;

import java.io.FileWriter;
//este al clase vehiculo
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class vehiculo {
	private String matricula;
	private String modelo;
	private String color;
	private String fechaDeCompra;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(String fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

    public abstract void Aniadirfinal (); 
  //metodo abstracto que aniade un objeto coche al final del fichero
    public abstract void Nuevalinea (String matricula, String modelo, String color, String fechaDeCompra); 
}