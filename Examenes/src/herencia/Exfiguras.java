
package herencia;


public class Exfiguras {
   private String tipoFigura;
   private int perimetro;
   private int posicionX;
   private int posicionY;

   
   public Exfiguras (String tipoFigura,int perimetro,int posicionY,int posicionX) {
	   this.perimetro= perimetro;
	   this.posicionX= posicionX;
	   this.posicionY = posicionY ;
	   this.tipoFigura=tipoFigura;
	   
   
   }
   public String GetTipoFigura () {
	   return tipoFigura;
   }
   public int getPerimetro () {
	   return perimetro;
   }
   public int getPosicionY () {
	   return posicionY;
   }

   public int getPosicionX () {
	   return posicionX;
   }
   	   
}



