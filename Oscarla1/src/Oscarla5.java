import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Oscarla5 {

	public static void main(String args[]) throws IOException {
		Scanner cambio = new Scanner(System.in);//Scanner
		System.out.println("Como te llamas?" );
		String nombre=cambio.next();//Nombre
		System.out.println("Cuantos años tienes?" );
		double ano = cambio.nextDouble();//Años que tenemos
		System.out.println("Cuantos Shibas quieres que hoy en dia valgan?" );
		int shiv = cambio.nextInt();
		System.out.print (" Hola "+ nombre);
		System.out.println( "tienes "+ ano +" años y quieres que el Shiva valga "+shiv+" euros" );
		
		LocalDateTime myDateObj = LocalDateTime.now();  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EEEE");  
	    String formattedDate = myDateObj.format(myFormatObj); 
	    DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("HH:mm");  
	    String formattedDate2 = myDateObj.format(myFormatObj2);
	    System.out.print(" Hoy es " + formattedDate);  
	     System.out.print(" y son las "+ formattedDate2);
		
	}


}

