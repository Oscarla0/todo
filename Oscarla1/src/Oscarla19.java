/* Sacar los cartones para un Bingo de 1 a 90 y que saque 15 números no repetidos */

public class Oscarla19 {
  public static void main(String[] args) {

//DECLARACIÓN DE VARIABLES: Cada nº
int siguiente; // es el número que sale del random
int j, i; // j para el for para sacar 7 números del bingo. i para comprobar los repetidos
int bingo []= new int [15]; // array de hasta 15 nºs
int chivato;
System.out.println("Tu cartón:");
System.out.println("--------------");


//ACCIÓN 1 : Generar los números sin repetidos
for(j=1; j<=15; j++) {
do {
chivato=0;
siguiente= (int)(Math.random()*90+1);
//ACCIÓN 2: comprobar si hay números repetidos
for(i=1; i<=j; i++) {
if (siguiente==bingo[i-1]){
chivato=1;//me chivo de que son iguales
i=j;// dejo de buscar más repes
}
}
}while (chivato==1);
bingo [j-1]=siguiente;//No es repe y lo guardo en el array bingo
System.out.print(" "+bingo [j-1]); //visualizo el numero que acabo de guardar
}

System.out.println("--------------");
System.out.println("FIN DE TU CARTON.");

}
}
