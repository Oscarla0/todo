package herenciaExamen;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class Rectangulo extends Extriangulo {
  private  int base;
  private  int altura;

  //Constructor
  public Rectangulo 
  (int lado,int altura,int base,int lado2,int lado3)
  {
	  super(lado,altura,base,lado2,lado3);
	  this.base=base;
	  this.altura=altura;
  }
  
  // Mostrar datos
  public void AreaTrianguloRectangulo() {
	  int area=(getBase()*getAltura())/2;
	  System.out.println("Area del triangulo Rectangulo es :"+area);

  }
  public void PerimetroTrianguloRectangulo() {
	  int perimetro=(getLado1()+getLado2()+getLado3());
	  System.out.println("Perimetro del triangulo Rectangulo es:"+perimetro);

  }
}

