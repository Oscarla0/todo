import java.util.Date;
import java.util.Scanner;
public class Jugadores {
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
		Jugadores jugador1= new Jugadores();
		jugador1.dni="02098098L";
		jugador1.nombre="Alejandra";
		jugador1.apellido="allahu";
		jugador1.fechanac= "23-08-1995";
		jugador1.ciudad="Leganes";
		jugador1.pais="Zimbawe";
		jugador1.correo="paulito22@gmil.com";
		jugador1.telefono= 911467997;
		jugador1.login="españa";
		jugador1.password="alejandra";
		jugador1.dorsal=23;
		jugador1.equipo="Panatinaikos";
		jugador1.posicion="MCO";
//////////////////////////////
		Jugadores jugador2= new Jugadores();
		jugador2.dni="02022323L";
		jugador2.nombre="oscarla";
		jugador2.apellido="Domingo";
		jugador2.fechanac= "23-08-1395";
		jugador2.ciudad="Malagas";
		jugador2.pais="Zimpapa";
		jugador2.correo="pepillo22@gmil.com";
		jugador2.telefono= 911367997;
		jugador2.login="china";
		jugador2.password="oscarla";
		jugador2.dorsal=23;
		jugador2.equipo="Palos";
		jugador2.posicion="MC";
/////////////////////////		
		Jugadores jugador3= new Jugadores();
		jugador3.dni="023214323L";
		jugador3.nombre="gonzala";
		jugador3.apellido="Dlune";
		jugador3.fechanac= "23-08-2313";
		jugador3.ciudad="Malgas";
		jugador3.pais="masagascar";
		jugador3.correo="pepillo22@gmil.com";
		jugador3.telefono= 911367997;
		jugador3.login="españa";
		jugador3.password="gonzala";
		jugador3.dorsal=99;
		jugador3.equipo="Polimetros";
		jugador3.posicion="MC";
 /////////////////////////

		jugador3.CambiarPassword();
 
}
public String ConsultarPassword() {
	return password;
}
	public void CambiarPassword()
{
		Scanner leer=new Scanner(System.in);
		System.out.println("introduce password: ");
		String passwordviejo=leer.next();
				if(passwordviejo.equals(ConsultarPassword())) //mirar que la contraseña sea la que tiene que ser https://www.w3schools.com/java/ref_string_equals.asp 
				{	do {
					System.out.println("Introduce una nueva contraseña ");
				 p1= leer.next();
					System.out.println("Introduce la nueva contraseña otra vez ");
			     p2= leer.next();
				}while(p1==p2 && p1!=p2 );
				}
				if (p1.equals(p2)) {
				
				System.out.println(" La contraseña ha sido  cambiada correctamenta");
				}
				else 
					if (p1!=p2) {
						System.out.println(" La contraseña nueva introducida es incorrecta");
				
				}
}
}

