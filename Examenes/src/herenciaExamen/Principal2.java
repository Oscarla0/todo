package herenciaExamen;

public class Principal2 {
	public static void main (String [] args) {
		//Circulo de area
		TrianguloIsosceles IsoscelesArea = new TrianguloIsosceles(1,3,3,2,1);
		IsoscelesArea.AreaTrianguloIsosceles();
		
		TrianguloIsosceles IsoscelesPerimetro = new TrianguloIsosceles(3,4,2,2,6);
		IsoscelesPerimetro.PerimetroTrianguloIsosceles();
		
		Rectangulo AreaR = new Rectangulo(7,3,5,5,3);
		AreaR.AreaTrianguloRectangulo();
		
		Rectangulo PerimetroR = new Rectangulo(1,8,3,3,5);
		PerimetroR.PerimetroTrianguloRectangulo();
		
		Escaleno AreaE = new Escaleno(6,4,9,9,2);
		AreaE.AreaTrianguloEscaleno();
		
		Escaleno PerimetroE = new Escaleno(6,8,0,3,9);
		PerimetroE.PerimetroTrianguloEscaleno();
		
		Equilatero AreaQ = new Equilatero(6,4,4,4,1);
		AreaQ.AreaTrianguloEquilatero();
		
		Equilatero PerimetroQ = new Equilatero(7,2,9,3,8);
		PerimetroQ.PerimetroTrianguloEquilatero();
		
		{
		}  
		
		{
		}
	}
}
