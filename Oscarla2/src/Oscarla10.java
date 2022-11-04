import java.util.ArrayList;
import java.util.Scanner;
public class Oscarla10 {
public static void main(String[] args) {
	Scanner cambio = new Scanner(System.in);
	ArrayList<String> user=new ArrayList<String>();
	user.add("Rober");
	user.add("Juan");
	user.add("Wang");
	ArrayList<String> password=new ArrayList<String>();
	password.add("2222");
	password.add("3333");
	password.add("4444");
	int count1 = 0;
	int count2 = 0;
	int Ok = 0;
	do {
		System.out.println("Introduzca el usuario");
		String nombre=cambio.nextLine();
		if(user.contains(nombre)) { // con esto comprobamos si el usuario existe (Nos da igual la posición). Si existe, pedimos el password:
			System.out.println("Introduzca la contraseña");
			String contraseña= cambio.nextLine();
			//COMPROBAMOS SI LA CONTRASEÑA Y EL USUARIO SON CORRECTOS MEDIANTE LA POSICIÓN
			if(contraseña.equals(password.get(user.indexOf(nombre)))) { //comprobamos que el usuario tiene la contraseña introducida
				Ok=1;
			System.out.println("Dentro "+nombre);
			}
			else {
				count2++;
				System.out.println("Contraseña incorrecta");
			}
			
		}
		else {
			 count1++;
			 System.out.println("Usuario incorrecto");
			 if (count1+count2==3) {
					System.out.println("kaputt");
				}
				
		}
	}while(count1+count2<3 & Ok==0);
	
}
}