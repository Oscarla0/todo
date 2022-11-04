import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Oscarla13 {

	public static void main(String[] args) {
		int index = 4;
		for (int i = 1; i <= index ; i++) {
			for (int j = 1; j <= index - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i + 2 - 1.5; k++) {
				System.out.print("<");
			}
			    System.out.println("");  
		}
		for (int i = 4; i <= 1 ; i--) {
			for (int j = 1; j <= index -i ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i + 1 - 2; k++) {
				System.out.print("<");
			}
			    System.out.println("");  
		}
	}
	
}