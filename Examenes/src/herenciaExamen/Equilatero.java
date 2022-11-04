package herenciaExamen;


public class Equilatero extends Extriangulo {


  
  public Equilatero
  (int lado,int altura,int base,int lado2,int lado3)
  {
	  super(lado,altura,base,lado2,lado3);

  }

  
  public void AreaTrianguloEquilatero() {
	  int area=(getBase()*getAltura())/2;
	  System.out.println("Area del triangulo Equilatero es :"+area);

  }
  public void PerimetroTrianguloEquilatero() {
	  int perimetro=(getLado1()+getLado2()+getLado3());
	  System.out.println("Perimetro del triangulo Equilatero es:"+perimetro);

  }

  

}