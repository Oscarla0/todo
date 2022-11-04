package herenciaExamen3;

public class TrianguloR extends ExtrianguloRectangulo {


  
  public TrianguloR
  (int lado,int altura,int base,int lado2,int lado3)
  {
	  super(lado,altura,base,lado2,lado3);
	  
  }

  
  public void AreaTrianguloR() {
	  
	  int area=(getBase()*getAltura())/2;
	  System.out.println("Area del triangulo Isosceles es :"+area);

  }
  public void PerimetroTrianguloR() {
	  int perimetro=(getLado1()+getLado2()+getLado3());
	  System.out.println("Perimetro del triangulo Isosceles es:"+perimetro);

  }
  public void HipTrianguloRectangulo() {
	  
	  int raiz =(getBase()^2+getAltura()^2);
	  double hipotenusa = Math.sqrt(raiz);
	  System.out.println("Hipotenusa del triangulo Rectangulo es :"+hipotenusa);
  }
  

}