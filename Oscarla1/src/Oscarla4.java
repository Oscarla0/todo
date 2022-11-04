import java.io.*;
import java.util.Scanner;
public class Oscarla4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		Scanner bufentrada = new Scanner(System.in);
		double a;
		double alto;
		double l;
		double largo;
		String loqueseveenunalinea;
		String n;
		System.out.println("¿Qué NOMBRE quieres en los bordes de tu rectángulo personalizado? ");
		n = bufEntrada.readLine();
		System.out.println("¿Qué LARGO quieres en los bordes de tu rectángulo personalizado?");
		l = bufentrada.nextDouble();
		System.out.println("¿Qué ALTO quieres en los bordes de tu rectángulo personalizado?");
		a = bufentrada.nextDouble();
		alto = 0;
		while (alto<a) {
			loqueseveenunalinea = "";
			largo = 0;
			while (largo<l) {
				loqueseveenunalinea = loqueseveenunalinea+n+" ";
				largo = largo+1;
			}
			System.out.println(loqueseveenunalinea);
			alto = alto+1;
		}
	}


}

