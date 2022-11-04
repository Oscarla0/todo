package partidos;
 
import java.util.Scanner;
 
public class Oscarla2 {
 
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner pregunta = new Scanner(System.in);
Scanner nombre = new Scanner(System.in);
// ARRAY 2 CLASES, 30 ALUMNOS, 6 MODULOS Y 3 ASIGNATURAS(DE TAMAÑO 4 POR QUE LA POSICION 0000 PERTENECE A UN NOMBRE
String notas[][][][] = new String[2][30][6][4];
// STRING QUE GUARDA LO ESCRITO POR EL USUARIO
String respuesta;
// INT PARA NOTAS
int j;
// INT PARA MODULOS
int k;
// INT PARA ALUMNOS
int i;
// INT PARA CLASES
int n;
// INT PARA SALIR DEL BUCLE DO WHILE
int chiv;
// INT QUE TE CALCULA LA MEDIA
int media;
// FOR QUE RECORRE LAS CLASES
for (n = 1; n <= 2; n++) {
System.out.println("Clase: " + n);
// FOR QUE RECORRE LOS ALUMNOS
for (i = 1; i <= 3; i++) {
// FOR QUE RECORRE LOS MÓDULOS
k = 1;
j = 1;
System.out.println("Diga el nombre de alumno: ");
respuesta = nombre.nextLine();
notas[n - 1][i - 1][k - 1][j - 1] = respuesta; // 0000 0100
System.out.println("Alumno " + notas[n - 1][i - 1][k - 1][j - 1]);
// FOR QUE RECORRE LOS MÓDULOS
for (k = 1; k <= 6; k++) {
// FOR QUE RECORRE LOS SIMESTRES
for (j = 1; j <= 3; j++) {
chiv = 0;
// DO QUE COMPRUEBA QUE LA NOTA ES CORRECTA
do {
System.out.println(
"Diga la nota del alumno, en el módulo " + k + " en el trimestre " + j + ": ");
respuesta = pregunta.next();
// IF QUE TE COMPRUEBA QUE DICHA NOTA ES CORRECTA
if (respuesta.equalsIgnoreCase("C") || respuesta.equals("1") || respuesta.equals("2")
|| respuesta.equals("3") || respuesta.equals("4") || respuesta.equals("5")
|| respuesta.equals("6") || respuesta.equals("7") || respuesta.equals("8")
|| respuesta.equals("9") || respuesta.equals("10")) {
chiv = 1;
// IF PARA QUE SI METE UNA C SE LE PONGA UN 5
if (respuesta.equalsIgnoreCase("C")) {
System.out.println("Ha pasado por convalidada");
notas[n - 1][i - 1][k - 1][j] = respuesta; // 0001
j = 2;
notas[n - 1][i - 1][k - 1][j] = respuesta;// 0002
j = 3;
notas[n - 1][i - 1][k - 1][j] = respuesta;// 0003
}
// GUARDA LAS NOTAS SOLO
else {
System.out.println("Ha pasado por la nota");
notas[n - 1][i - 1][k - 1][j] = respuesta;
}
}
// PARA DECIR QUE EL CARACTER ES ERRONEO
else {
System.out.println("El caracter incluido es erroneo, por favor introduzcalo otra vez");
}
} while (chiv != 1);
}
}
}
}
// PINTA LA ARRAY
for (n = 1; n <= 2; n++) {
for (i = 1; i <= 30; i++) {
for (k = 1; k <= 6; k++) {
// IF QUE TE HACE LOS CALCULOS SI HA GUARDADO CONVALIDADA EN VEZ DE NOTA
if (notas[n - 1][i - 1][k - 1][1].equalsIgnoreCase("C")
|| notas[n - 1][i - 1][k - 1][2].equalsIgnoreCase("C")
|| notas[n - 1][i - 1][k - 1][3].equalsIgnoreCase("C")) {
media = (Integer
.parseInt(notas[n - 1][i - 1][k - 1][1].replace(notas[n - 1][i - 1][k - 1][1], "5"))
+ Integer.parseInt(
notas[n - 1][i - 1][k - 1][2].replace(notas[n - 1][i - 1][k - 1][2], "5"))
+ Integer.parseInt(
notas[n - 1][i - 1][k - 1][3].replace(notas[n - 1][i - 1][k - 1][3], "5")))
/ 3;
System.out.print("Las notas de " + notas[n - 1][i - 1][0][0] + ", alumno " + i + " del módulo "
+ k + " del curso " + n + " son: " + notas[n - 1][i - 1][k - 1][1] + ", "
+ notas[n - 1][i - 1][k - 1][2] + ", " + notas[n - 1][i - 1][k - 1][3] + "."
+ " Y la media es un " + media + "\n");
// CALCULOS EN EL CASO QUE LO GUARDADO SEA UN NUMERO
} else {
media = (Integer.parseInt(notas[n - 1][i - 1][k - 1][1])
+ Integer.parseInt(notas[n - 1][i - 1][k - 1][2])
+ Integer.parseInt(notas[n - 1][i - 1][k - 1][3])) / 3;
System.out.print("Las notas de " + notas[n - 1][i - 1][0][0] + ", alumno " + i + " del módulo "
+ k + "del curso " + n + " son: " + notas[n - 1][i - 1][k - 1][1] + ", "
+ notas[n - 1][i - 1][k - 1][2] + ", " + notas[n - 1][i - 1][k - 1][3] + "."
+ " Y la media es un " + media + "\n");
}
}
}
}
}
}
