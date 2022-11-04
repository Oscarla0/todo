package herencia;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Personas {
   private String dni;
   private String nombre;
   private String apellido;
   private String fechaNacimiento; // https://www.w3schools.com/java/tryjava.asp?filename=demo_date_localdate  y la teoría en https://www.w3schools.com/java/java_date.asp 
   private String ciudad;
   private String pais;
   private int edad;
   
   
   public Personas (String nombre, String apellido , int edad ,String ciudad, String dni,String fechaNacimiento,String pais) {
	   this.nombre= nombre;
	   this.apellido= apellido;
	   this.edad = edad;
	   this.ciudad= ciudad;
	   this.dni = dni ;
	   this.fechaNacimiento= fechaNacimiento;
	   this.pais = pais;
	   
   }
   public String getNombre () {
	   return nombre;
   }
   public String getApellido () {
	   return apellido;
   }
   public int getEdad () {
	   return edad;
   }
   public String getFechaNacimiento () {
	   return fechaNacimiento;
   }
   public String getCiudad () {
	   return ciudad;
   }
   public String getDni () {
	   return dni;
   }
   public String getPais () {
	   return pais;
   }

   	   
}
