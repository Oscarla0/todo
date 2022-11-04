//IMPORTAMOS LA UTILIDAD DE SCANNER
import java.util.Scanner; 

public class Oscarla2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner entrada=new Scanner(System.in); // SE DECLARA LA VARIABLE ENTRADA COMO VARIABLE DE SCANNER        		
		double valor;		
		int euro;	
		
		System.out.println("Introduce el valor actual de SHIBA a convertir");		
		valor=entrada.nextDouble(); //INDICAMOS QUE LA VARIABLE SE SUSTITUYE POR EL VALOR QUE INTRODUCIMOS POR TECLADO
		System.out.println("Introduce la cantidad de euros a convertir");		
		euro=entrada.nextInt(); //INDICAMOS QUE LA VARIABLE SE SUSTITUYE POR EL VALOR QUE INTRODUCIMOS POR TECLADO		
		
		//REALIZAMOS LAS OPERACIONES		
		double conversion = (1 / valor);		
		double euros = (euro / valor);		
		
		//IMPRIMIMOS POR PANTALLA    		
		System.out.println("1 SHIBA son " +String.format("%.6f", +valor)+"€");		
		System.out.println("1 EURO son "+String.format("%.3f", +conversion)+ " SHIBAS");		
		System.out.println(+euro+" EUROS son "+String.format("%.1f", +euros)+ " SHIBAS");		
		
		//CERRAMOS LA VARIABLE DE SCANNER    		
		entrada.close();
	}
}