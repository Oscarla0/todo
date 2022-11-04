import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Oscarla12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cambio = new Scanner(System.in);//Scanner
		
		System.out.println("Introduzca la nota de los partidos");
		int np;
		 np = cambio.nextInt();
		switch(np) {
		case 0 : 
			System.out.println("Vaya mierda.");
			break;
		case 1:
			System.out.println("Aceptable,pero puedo ser mejor.");
			break;
		case 3:
			System.out.println("Muy bien.");
			break;
		default:
			System.out.println("introduzca la nota correcta.");
			break;
		}
	}
}
