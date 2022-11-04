import java.util.Scanner;

public class Oscarla7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cambio = new Scanner(System.in);//Scanner
		System.out.println("Dime la nota del partido1 de la evaluacion 1");
		double partido1 = cambio.nextDouble();
		System.out.println("Dime la nota del examen de la evaluacion 1");
		double examen1 = cambio.nextDouble();
		System.out.println("Dime la nota del partido2 de la evaluacion 1");
		double partido2 = cambio.nextDouble();
		System.out.println("Dime la nota del exame2 de la evaluacion 1");
		double examen2 = cambio.nextDouble();
		System.out.println("Dime la nota del partido3 de la evaluacion 1");
		double partido3 = cambio.nextDouble();
		System.out.println("Dime la nota del examen3 de la evaluacion 1");
		double examen3 = cambio.nextDouble();
		double nota1 = examen1+partido1;
		System.out.println("La nota 1ev es de "+nota1);
		double nota2 =examen2+partido2;
		System.out.println("La nota 2ev es de "+nota2);
		double nota3 =examen3+partido3;
		System.out.println("La nota 3ev es de "+nota3);
		double notafinal =(nota1+nota2+nota3)/3;
		int notafinalentera= (int)notafinal;
		System.out.println("La nota final es de "+notafinalentera);
		
	}

}