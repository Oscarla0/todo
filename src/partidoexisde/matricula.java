// CLASE PERSONAS
package partidoexisde;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class matricula {
	// DECLARAMOS LAS VARIABLES DE PERSONAS

	public static void main (String[]arg) {
		/*El método compare(char x, char y) de la clase de caracteres devuelve
		un valor 0 si x==y
		un valor menor que 0 si x<y.
		un valor mayor que 0 si x>y.
		*/
		String matricula;
		int chiv;
		int chiv2;
		int i;
		String matriculas;
		for (i=1;i>=3;i++) {
		do {
		chiv = 0;
		System.out.println("Diga la matricula");
		Scanner scString = new Scanner(System.in) ;
		//METODO PARA PASAR A MAYUSCULA LAS LETRAS DE LA MATRICULA
		matricula = scString.nextLine().toUpperCase();
		// PATRON QUE DEBE SEGUIR EL NUMERO
		Pattern pat = Pattern.compile("^[0-9]{4}+[B-DF-HJ-NP-TV-Z]{3}");
		Matcher mat = pat.matcher(matricula);
		// TODOS ESTOS IF Y IF ELSE NOS SIRVE PARA QUE NO PUEDA SER LA MATRICULA MAS DE
		// 7878LWR
		if (mat.matches()) {
		if (Character.compare(matricula.charAt(4), 'L') < 0) {
		chiv = 1;
		System.out.println("Matricula correcta");
		} else if ((Character.compare(matricula.charAt(4), 'L') == 0)
		&& ((Character.compare(matricula.charAt(5), 'W') < 0))) {
		chiv = 1;
		System.out.println("Matricula correcta");
		} else if ((Character.compare(matricula.charAt(4), 'L') == 0)
		&& (Character.compare(matricula.charAt(5), 'W') == 0)
		&& (Character.compare(matricula.charAt(6), 'R') < 0)) {
		chiv = 1;
		System.out.println("Matricula correcta");
		} else if ((Character.compare(matricula.charAt(4), 'L') == 0)
		&& (Character.compare(matricula.charAt(5), 'W') == 0)
		&& (Character.compare(matricula.charAt(6), 'R') == 0)) {
		if (Character.compare(matricula.charAt(0), '7') < 0) {
		chiv = 1;
		System.out.println("Matricula correcta");
		} else if ((Character.compare(matricula.charAt(0), '5') == 0)
		&& ((Character.compare(matricula.charAt(1), '8') < 0))) {
		chiv = 1;
		System.out.println("Matricula correcta");
		} else if ((Character.compare(matricula.charAt(0), '5') == 0)
		&& (Character.compare(matricula.charAt(1), '8') == 0)
		&& (Character.compare(matricula.charAt(2), '7') < 0)) {
		chiv = 1;
		System.out.println("Matricula correcta");
		} else if ((Character.compare(matricula.charAt(0), '5') == 0)
		&& (Character.compare(matricula.charAt(1), '8') == 0)
		&& (Character.compare(matricula.charAt(2), '7') == 0)
		&& (Character.compare(matricula.charAt(2), '8') <= 0)) {
		chiv = 1;
		System.out.println("Matricula correcta");
		} else {
		System.out.println("Matricula incorrecta");
		}
		} else {
		System.out.println("Matricula incorrecta");
		}
		} else {
		System.out.println("Matricula incorrecta");
		}
		} while (chiv != 1);
		
	}
		
	}
	}
