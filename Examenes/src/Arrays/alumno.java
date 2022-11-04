package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class alumno {
	
	public static void main(String[] args) {
		Scanner cambio = new Scanner(System.in);
		int i=0;
		int k=0;
		int j=0;
		int modulo []= new int [2];
		int modulo1;
		String nombre []= new String [4];
		int evaluacion []= new int [3];
		String nombre1;
		int nota;
		for(j=1;j<=4; j++) {
			ArrayList<String> user=new ArrayList<String>();
			System.out.println("Introduzca el nombre del alumno");
			nombre1 = cambio.nextLine();
			nombre1=nombre [j-1];
			 for (k=1 ; k<=3;k++) {
				 int evaluacion1=1;
				 System.out.println("Introduzca la nota del alumno"+evaluacion1);
					evaluacion1++;
				for(i=1 ; i>=2 ; i++) {
					System.out.println("Introduzca los modulos");
					modulo1=cambio.nextInt();
					modulo1=modulo [i-1];
		}
	}
	
}
	
}
}
