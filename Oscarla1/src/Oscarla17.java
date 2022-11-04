/* Bingo de 1 a 10 y que saque 7 números no repetidos */

public class Oscarla17 {
  public static void main(String[] args) {

//DECLARACIÓN DE VARIABLES: Cada nº
int siguiente; // es el número que sale del random
int j, i; // j para el for para sacar 7 números del bingo. i para comprobar los repetidos
int bingo []= new int [10]; // array de hasta 10 nºs
int chivato;
System.out.println("INICIO DEL SORTEO:");
System.out.println("--------------");


//ACCIÓN 1 : Generar los números sin repetidos
for(j=1; j<=7; j++) {
do {
chivato=0;
siguiente= (int)(Math.random()*10+1);
//ACCIÓN 2: comprobar si hay números repetidos
for(i=1; i<=j; i++) {
if (siguiente==bingo[i-1]){
chivato=1;//me chivo de que son iguales
i=j;// dejo de buscar más repes
System.out.println("ESTOS FUERON REPES:  "+ siguiente);
}
}
}while (chivato==1); 
bingo [j-1]=siguiente;
}

//ACCIÓN 3: visualizar los números
for(j=1; j<=7; j++) {
System.out.println("El siguiente nº es "+bingo [j-1]);
}


System.out.println("--------------");
System.out.println("FIN DEL SORTEO.");

  }
}