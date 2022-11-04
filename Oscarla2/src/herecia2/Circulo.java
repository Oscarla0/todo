package herecia2;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class Circulo extends figura {
  private  int radio;
  private  int posicion_de_centro;

  //Constructor
  public Circulo
  (int radio,int posicion_de_centro,String tipo, int area ,int perimetro) 
  {
	  super(radio,posicion_de_centro,tipo,area,perimetro);
	  this.radio=radio;
	  this.posicion_de_centro=posicion_de_centro;
  }
  
  // Mostrar datos
  public void MetodoCalcularAreaCirculo() {
	  System.out.println("Tipo :"+getTipo());
	  System.out.println("Area del circulo es :"+3.14*(radio^2));
	  
  }
  public void MetodoCalcularPerimetroCirculo() {
	  System.out.println("Tipo :"+getTipo());
	  System.out.println("Perimetro del circulo es :"+2*3.14*(radio));
  }
}

