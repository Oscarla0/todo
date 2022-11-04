package herenciaExamen;

public class TrianguloIsosceles extends Extriangulo {


  
  public TrianguloIsosceles 
  (int lado,int altura,int base,int lado2,int lado3)
  {
	  super(lado,altura,base,lado2,lado3);
	  
  }

  
  public void AreaTrianguloIsosceles() {
	  int area=(getBase()*getAltura())/2;
	  System.out.println("Area del triangulo Isosceles es :"+area);

  }
  public void PerimetroTrianguloIsosceles() {
	  int perimetro=(getLado1()+getLado2()+getLado3());
	  System.out.println("Perimetro del triangulo Isosceles es:"+perimetro);

  }

  

}