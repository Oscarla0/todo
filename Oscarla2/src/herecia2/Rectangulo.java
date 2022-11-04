package herecia2;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class Rectangulo extends figura {
  private  int base;
  private  int altura;

  //Constructor
  public Rectangulo 
  (int base,int altura,String tipo, int area ,int perimetro) 
  {
	  super(base,altura,tipo,area,perimetro);
	  this.base=base;
	  this.altura=altura;
  }
  
  // Mostrar datos
  public void MetodoCalcularAreaRectangulo() {
	  System.out.println("Tipo :"+getTipo());
	  System.out.println("Area del rectangulo  es :"+(base*altura));
  }
  public void MetodoCalcularPerimetroRectangulo() {
	  System.out.println("Tipo :"+getTipo());
	  System.out.println("Perimetro del rectangulo es :"+2*(base+altura));
  }
}

