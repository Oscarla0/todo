import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Oscarla9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cambio = new Scanner(System.in);//Scanner
		double ne;
		double np;
			  //INTRODUCIR LOS DATOS.
		do {
			System.out.println("Introduzca la nota de los partidos");
			np=cambio.nextDouble();
		}while (np<0 | np>4);//Repetir hasta tener estos datos.
		do {
			System.out.println("Introduzca la nota de los examenes");
			ne=cambio.nextDouble();
		}while (ne<0 | ne>6);
		
		int Notafinal=(int)(ne+np);//La suma de las notas transformandolos en int
		
		System.out.println("Tu nota media es de "+Notafinal);//El resultado
	}
}
