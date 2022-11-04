package herencia;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class Jugadores extends Personas {
  private  int dorsal;
  private  String equipo;;
  private  String posicion;
  private  String comentarios;

  
  public Jugadores 
  (String equipo,int dorsal,String posicion,String comentarios,String nombre,
   String apellido , int edad ,String ciudad, String dni,String fechaNacimiento,String pais) 
  {
	  super(nombre,apellido,edad,ciudad,dni,fechaNacimiento,pais);
	  this.dorsal=dorsal;
	  this.equipo=equipo;
	  this.posicion=posicion;
	  this.comentarios=comentarios;
  }
  
  
  public void mostrarDatos() {
	  System.out.println("Nombre: "+getNombre());
	  System.out.println("Apellido: "+getApellido());
	  System.out.println("Edad: "+getEdad());
	  System.out.println("Equipo: "+equipo);
	  System.out.println("Dorsal: "+dorsal);
  }

}

