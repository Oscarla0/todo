import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Oscarla6 {

	public static void main(String args[])  {
		Scanner cambio = new Scanner(System.in);//Scanner
		System.out.println("Introduce la primera fecha dd/MM/yyyy");
		String fecha1=cambio.nextLine();
		DateTimeFormatter convirtiendoenfecha= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha1Date = LocalDate.parse(fecha1, convirtiendoenfecha);
		System.out.println("Introduce la segunda fecha fecha dd/MM/yyyy");
		String fecha2=cambio.nextLine();
		DateTimeFormatter convirtiendoenfecha2= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha2Date = LocalDate.parse(fecha2, convirtiendoenfecha2);
		double diferenciaAños= ChronoUnit.YEARS.between(fecha1Date, fecha2Date);
		double diferenciaMeses= ChronoUnit.MONTHS.between(fecha1Date, fecha2Date);
		long diferenciaDias= ChronoUnit.DAYS.between(fecha1Date, fecha2Date);
		//Años
		System.out.print("Entre la fecha"+fecha1Date);
		System.out.print(",y la fecha"+fecha2Date);
		System.out.print(" hay ");
		System.out.println(diferenciaAños+" años ");
		//Meses
		System.out.print("Entre la fecha"+fecha1Date);
		System.out.print(",y la fecha"+fecha2Date);
		System.out.print(" hay ");
		System.out.println(diferenciaMeses+" meses ");
		//Dias
		System.out.print("Entre la fecha"+fecha1Date);
		System.out.print(",y la fecha"+fecha2Date);
		System.out.print(" hay ");
		System.out.println(diferenciaDias+" dias ");
		
	}


}

