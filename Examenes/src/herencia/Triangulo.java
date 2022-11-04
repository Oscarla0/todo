package herencia;

public class Triangulo extends Exfiguras {


  
  public Triangulo 
  (String tipoFigura,int perimetro,int posicionY,int posicionX) 
  {
	  super(tipoFigura,perimetro,posicionX,posicionY);

  }
  enum tipoFigura
  {
      Triangulo,Rectangulo;
  }
   
  public class Test
  {
      // El método
      public static void main(String[] args)
      {
          tipoFigura c1 = tipoFigura.Triangulo;
          System.out.println(c1);
          tipoFigura c2 =tipoFigura.Rectangulo;
      }
  }
  
  public void Triangulo() {
	  System.out.println("La posición del objeto de Triangulo es:"+"("+getPosicionX()+","+getPosicionY()+")");


  }
  public void Rectangulo() {
	  System.out.println("La posición del objeto de Rectangulo es:"+"("+getPosicionX()+","+getPosicionY()+")");


  }

}