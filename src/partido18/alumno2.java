package partido18;

import java.util.Scanner;

public class alumno2 {
		 public static void main(String[] args) {
			 Scanner entrada = new Scanner(System.in);
			 String alumnos ="";
			 String datos="";
			 double evaluacion=0;
			 int nota = 0 ,eval=0 ;
			 double asig = 0;
			 String fi = "";
			 int nota1 =0,nota4 =0,nota3 =0,nota2 =0;
			 int i;
			 int j;
			 int k=0;
			 for(i = 1 ; i<=2 ; i ++) {
				 System.out.println("Introduce el nombre ");
				 alumnos = entrada.next();
				 datos = alumnos + " ";
				 for (j = 1 ; j<=3 ; j ++) {
					/* System.out.println("Introduce la nota de la "+ j +"evaluacion");
					 nota = entrada.nextInt();*/
					 datos = datos+ " " +"evalucaion " + j+"º";
					 for (k = 1 ; k<=4 ; k ++) {
						 System.out.println("Introduce la nota de la "+ j +" Evaluacion "+ k +" asinatura");
						 eval = entrada.nextInt();
						 datos = datos+ " asignatura "+k+"ª " + eval ;
						 nota = nota+eval;
						 if(k ==1) {
							 nota1 = nota1+eval; 
						 }
						 else if(k ==2) {
							 nota2 = nota2+eval;
						 }
						 else if(k ==3) {
							 nota3 = nota3+eval;
						 }
						 else if(k ==4) {
							 nota4 = nota4+eval;
						 }
						 
						 /*do {
							 System.out.println("Introduce la nota de la "+ j +" asignatura");
						 
							 eval = entrada.nextInt();
							 if(eval < 0 || eval >10) {
								 System.out.println("incorrecto ");
								 chiv=0;
							 }
							 else {
								 datos = "\n"+datos+ " " + eval ;
								 chiv =1;
							 }
						 
					 }while(chiv ==1);	*/
				 }
					 evaluacion = nota/4;
					 datos = datos+" media " + evaluacion+"\n";
					 evaluacion = 0;
					 nota =0;
					 //fi = datos + "\n";
				 }
				 asig = nota1/3;
				 datos = datos + asig +" media Asig 1 ";
				 asig = 0;
				 asig = nota2/3;
				 datos = datos + asig +" media Asig 2 ";
				 asig = 0;
				 asig = nota3/3;
				 datos = datos + asig +" media Asig 3 ";
				 asig = 0;
				 asig = nota4/3;
				 datos = datos + asig +" media Asig 4 ";
				 asig = 0;
				 fi =fi + datos ;
			 }
			 //evaluacion = nota/3;
			 //fi = datos + "\n";
			 
			 
		 System.out.println(fi);
		 }
		 
		 }

