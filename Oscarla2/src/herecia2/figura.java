package herecia2;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


// Variables
public class figura {
   private int area;
   private int perimetro;
   private String tipo;

   
// Variables
   public figura (int radio, int posicion_de_centro, String tipo, int area ,int perimetro) {
	   this.tipo= tipo;
	   this.area= area;
	   this.perimetro = perimetro;
	   
   }
   public String getTipo () {
	   return tipo;
   }
   public int getArea () {
	   return area;
   }
   public int getPerimetro () {
	   return perimetro;
   }

   	   
}
