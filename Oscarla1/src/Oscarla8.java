import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Oscarla8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cambio = new Scanner(System.in);//Scanner
			  
			  //ENTRADA: NO HAY ENTRADA DE DATOS. SOLO EL VALOR DE LA X
			    int x = 5;
			  
			 // ACCIONES: COMPROBAR QUE LA NOTA ES >=0 Y <=4  
			       if (x>=0 & x<=4 ){
			       	
			       
			 // SALIDA: SI la nota de los partidos es entre 0 y 4, ¡NOTA CORRECTA!

			      System.out.println(x + " ES  ¡NOTA CORRECTA!");
			              
			       } 
			      
			       else {
			    	   System.out.println("No ha entrado al If , Probablemente sea un x<=0 Y x>=4" );
			       }
			  }
			}
