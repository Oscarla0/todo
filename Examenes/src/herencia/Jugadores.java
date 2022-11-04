package herencia;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class Jugadores  extends Triangulo {
  private  int dorsal;
  private  int equipo;;
  private  int posicion;
  private  int comentarios;

  
  public Jugadores 
  (String tipoFigura,int perimetro,int posicionY,int posicionX) 
  {
	  super(tipoFigura,perimetro,posicionX,posicionY);
	  this.dorsal=dorsal;
	  this.equipo=equipo;
	  this.posicion=posicion;
	  this.comentarios=comentarios;
  }
  
  
  public void mostrarDatos() {
	  System.out.println("La posición del objeto de "+GetTipoFigura()+" es:"+"("+getPosicionX()+","+getPosicionY()+")");


  }

}

