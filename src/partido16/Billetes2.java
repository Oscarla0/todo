package partido16;


import java.util.Scanner;

public class Billetes2 {
public static void main(String[] args) {
	Scanner leer = new Scanner (System.in);
	int chivato = 0;
	int dinero;
	int contador = 0;
	do {
		System.out.println("Introduce el dinero a recoger");
		dinero=leer.nextInt();
		if(dinero%5==0) {
			chivato=1;
		}else {
			chivato=0;
			System.out.println("El dinero debe ser multiplo de 5");
		}
	}while(chivato==0);
	do {
		if(dinero>=500){
			dinero=dinero-500;
			contador++;
		}
	}while(dinero>=500);
	System.out.println("De 500 = "+contador);
	contador = 0;
	do {
		if(dinero>=200){
			dinero=dinero-200;
			contador++;
		}
	}while(dinero>=200);
	System.out.println("De 200 = "+contador);
	contador = 0;
	do {
		if(dinero>=100){
			dinero=dinero-100;
			contador++;
		}
	}while(dinero>=100);
	System.out.println("De 100 = "+contador);
	contador = 0;
	do {
		if(dinero>=50){
			dinero=dinero-50;
			contador++;
		}
	}while(dinero>=50);
	System.out.println("De 50 = "+contador);
	contador = 0;
	do {
		if(dinero>=20){
			dinero=dinero-20;
			contador++;
		}
	}while(dinero>=20);
	System.out.println("De 20 = "+contador);
	contador = 0;
	do {
		if(dinero>=10){
			dinero=dinero-10;
			contador++;
		}
	}while(dinero>=10);
	System.out.println("De 10 = "+contador);
	contador = 0;
	do {
		if(dinero>=5){
			dinero=dinero-500;
			contador++;
		}
	}while(dinero>=5);
	System.out.println("De 5 = "+contador);
	
}
}
