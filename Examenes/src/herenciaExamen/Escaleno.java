package herenciaExamen;


public class Escaleno extends Extriangulo {


  
  public Escaleno
  (int lado,int altura,int base,int lado2,int lado3)
  {
	  super(lado,altura,base,lado2,lado3);

  }

  
  public void AreaTrianguloEscaleno() {
	  int area=(getBase()*getAltura())/2;
	  System.out.println("Area del triangulo Escaleno es  :"+area);

  }
  public void PerimetroTrianguloEscaleno() {
	  int perimetro=(getLado1()+getLado2()+getLado3());
	  System.out.println("Perimetro del triangulo Escaleno es:"+perimetro);

  }

  

}