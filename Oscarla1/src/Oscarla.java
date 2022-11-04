import java.util.Scanner; 
public class Oscarla {
	private static Scanner leer;

	public static void main(String[] args) {
	System.out.println("Hola mundo");
	System.out.println("Ingrese los euros que quieres transformar.");
	leer = new Scanner(System.in);
	int valeud = leer.nextInt();
	System.out.println("Ingrese los Shibas.");
	 double cotizacion = 18181.818 ;
	 double valshib = leer.nextDouble();
	  System.out.println( valshib+" shiba son: " + valshib/cotizacion + " euros.");
	  System.out.println("1 euro son "+ cotizacion + " shibas");
	  System.out.println(valeud + " euros son "+ valeud*cotizacion + " shibas");

	}

}
