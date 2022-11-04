import java.util.Date;
import java.util.Scanner;
public class Jugadores2 {
String dni;
String nombre;
String apellido;
String fechanac;
String ciudad;
String pais;
String correo;
int telefono;
String login;
String password;
int dorsal;
String equipo;
String posicion;
String p1;
String p2;
public static void main (String[]args){
		Jugadores2 jugador1= new Jugadores2();
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce el dni del jugador");
		jugador1.dni=leer.next();
		System.out.println("introduce el nombre del jugador");
		jugador1.nombre=leer.next();
		System.out.println("introduce el apellido del jugador");
		jugador1.apellido=leer.next();
		System.out.println("introduce la fechanac del jugador");
		jugador1.fechanac=leer.next();
		System.out.println("introduce la ciudad del jugador");
		jugador1.ciudad=leer.next();
		System.out.println("introduce el pais del jugador");
		jugador1.pais=leer.next();
		System.out.println("introduce el correo del jugador");
		jugador1.correo=leer.next();
		System.out.println("introduce telefono del jugador");
		jugador1.telefono = leer.nextInt();
		System.out.println("introduce el Login");
		jugador1.login=leer.next();
		System.out.println("introduce el Password");
		jugador1.password=leer.next();
		System.out.println("introduce el dorsal del jugador");
		jugador1.dorsal=leer.nextInt();
		System.out.println("introduce el equipo del jugador");
		jugador1.equipo=leer.next();
		System.out.println("introduce la posicion del jugador");
		jugador1.posicion=leer.next();
		
		jugador1.CambiarPassword();
 
}
public String ConsultarPassword() {
	return dni;
}
	public void CambiarPassword()
{
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduzca el dni del jugador que quieras eliminar:");
		String passwordviejo=leer.next();
				if(passwordviejo.equals(ConsultarPassword())) //mirar que la contraseña sea la que tiene que ser https://www.w3schools.com/java/ref_string_equals.asp 
				{	do {
					System.out.println("Estas seguro de que querras eliminarlo? (Yes)(No)");
				 p1= leer.next();
					System.out.println("Introduzca otra vez .(Yes)(No)");
			     p2= leer.next();
				}while(p1==p2 && p1!=p2 );
				}
				if (p1.equals(p2)) {
				
				System.out.println("La cuenta del jugador es eliminada correctamente.");
				
				}
				else 
					if (p1!=p2) {
						System.out.println("La cuenta del jugador no ha sido eliminada correctamente.");
				
				}
}
}

