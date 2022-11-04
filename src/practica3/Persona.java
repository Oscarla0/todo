package practica3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
	// DECLARAMOS LAS VARIABLES DE PERSONAS
		String dni;
		String nombre;
		String apellido;
		int anoNacimiento; 
		String ciudad;
		String pais;
		// CREAMOS EL METODO CONSTRUCTOR DE PERSONAS

		public void Personas(String dni, String nombre, String apellido, int anoNacimiento, String ciudad, String pais) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.anoNacimiento = anoNacimiento;
			this.ciudad = ciudad;
			this.pais = pais;
		}

		// METODO GET

		public String getDni() {
			return dni;
		}

		public String getNombre() {
			return nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public int getFechaNacimiento() {
			return anoNacimiento;
		}

		public String getCiudad() {
			return ciudad;
		}

		public String getPais() {
			return pais;
		}

		//METODO SET

		public void setDni(String dni) {
			this.dni = dni;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public void setFechaNacimiento(int anoNacimiento) {
			this.anoNacimiento = anoNacimiento;
		}

		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}
		//METODO PARA SACAR LA EDAD DE LA PERSONA (FALTA MEJORAR PARA RECIBIR LA FECHA ENTERA DE NACIMIENTO)

		public void edad() {
			//FORMATO DE LA FECHA ACTUAL
			LocalDate myDateObj = LocalDate.now();  
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy");  
			//yyyy para sacar el numero del año actual
			String formattedDate = myDateObj.format(myFormatObj); 
			//Formula casting Juan
			Integer iNum = Integer.valueOf(formattedDate);	
			int anno = iNum.intValue();
			int edad=anno-anoNacimiento;
			System.out.println("El jugador tiene "+edad+ " años.");
		}

}

// CLASE JUGADORES



// CLASE PERSONAS PRINCIPAL

