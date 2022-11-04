import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Examen2 {

public static void main(String[] args) {

// FOR PARA LAS FILAS O LINEAS (USAR LA VARIABLE "i"):
	   int aux;
	    int [] a = new int [10];
	    for (int i=0;i<a.length;i++){
	        a[i]=(int)(Math.random()*5);
	    }
	    for (int i=0;i<a.length;i++){
	        for (int j=0;j<a.length;){
	            if (a[i]==a[j] && i!=j){
	                a[j]=(int)(Math.random()*5);
	            }else{
	                j++;
	            }
	        }
	    }
	    for (int i=0;i<a.length;i++){
	        for (int j=i+1;j<a.length;j++){
	            if (a[i]>a[j]){
	                aux=a[i];
	                a[i]=a[j];
	                a[j]=aux;
	            }
	        }
	    }
	    for (int i=0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
}
}