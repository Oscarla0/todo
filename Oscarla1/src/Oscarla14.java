import java.util.Scanner;



public class Oscarla14 {
public static void main(String[] args) {

Scanner entrada=new Scanner(System.in);
int contador = 1;
int np = 0;
int nota = 1;
int acumulador = 0 ;
float total = 0;
int redondeo = 0;
int aprobados = 0;
int suspensos = 0;

for ( nota = 1; nota <= 4; nota++) {
do {
System.out.println("INTRODUZCA LA NOTA" +nota+ " " );
np = entrada.nextInt();
contador = contador + 1;
}
while(np < 0 || np > 10);
acumulador = acumulador + np ;
if (np<5) {
suspensos ++;
}
else {
aprobados++;
}
   }  

total = acumulador / 4 ;
System.out.println("NOTA MEDIA CON DECIMALES ES "+ total);

redondeo = (int) (total + 0.5);
System.out.println("NOTA MEDIA "+ redondeo);

System.out.println("TIENE "+aprobados+" APROBADAS Y "+suspensos+" SUSPENSAS");

}
}