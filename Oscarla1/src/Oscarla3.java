import java.util.Scanner; 
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Oscarla3 {
	public static void main(String[] args) {		
		String dia;
		String mes;
		int ano;
		String nombre;
		double anos;
		int anacos = 2021;
		Scanner cambio = new Scanner(System.in); 
		System.out.println("¿Como te llamas?");
		nombre = cambio.nextLine();
		System.out.println ("Hola "+ nombre +" que tal! ");
		System.out.println("El dia naciste");		
		dia = cambio.nextLine();
		System.out.println("El mes que naciste");		
		mes = cambio.nextLine();
		System.out.println("El año naciste");		
		anos = cambio.nextDouble();
		System.out.println("Escribe el año que te interese saber cuantos años tendras");		
		ano = cambio.nextInt();
		System.out.print (" Naciste el "+dia);
		System.out.print (" de "+mes+" de "+ano);
		System.out.print (" y en el año "+anos);
		System.out.print (" cumples "+(ano-anos));
		System.out.println("años");
	    LocalDateTime myDateObj = LocalDateTime.now();  
	    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd");  
	    String formattedDate = myDateObj.format(myFormatObj); 
	    
	    DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("MMM");  
	    String formattedDate2 = myDateObj.format(myFormatObj2);
	        
	    System.out.print(" Hoy es " + formattedDate);  
	     System.out.print(" de " + formattedDate2);
	     System.out.print(" de "+ anacos);

						
	}
}