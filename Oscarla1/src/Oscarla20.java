/* Bingo de 1 a 10 y que saque 7 números no repetidos */

public class Oscarla20 {
  public static void main(String[] args) {

//DECLARACIÓN DE VARIABLES: Cada nº
int siguiente; // es el número que sale del random
int j, i; // j para el for para sacar 7 números del bingo. i para comprobar los repetidos
int cartones [] []= new int [22][15]; // array de hasta 10 nºs
int chivato;
int k;
for (k=1 ; k<=22 ; k++) {
System.out.println(k+" INICIO DEL SORTEO:");
System.out.println("--------------");


//ACCIÓN 1 : Generar los números sin repetidos
for(j=1; j<=15; j++) {
do {
chivato=0;
siguiente= (int)(Math.random()*90+1);
//ACCIÓN 2: comprobar si hay números repetidos
for(i=1; i<=j; i++) {
	if (siguiente== cartones [k-1][i-1]){ // COMPARALO EL VALOR DE siguiente CON EL VALOR DE UNA CELDA DEL ARRAY cartones
chivato=1;//me chivo de que son iguales
i=j;// dejo de buscar más repes

}
}
}while (chivato==1); 
  cartones [k-1] [j-1]=siguiente;
}

//ACCIÓN 3: visualizar los números
for(j=1; j<=15; j++) {
System.out.print(" "+cartones [k-1][j-1]);
}
System.out.println("--------------");
System.out.println("FIN DEL SORTEO.");
}
  }
}