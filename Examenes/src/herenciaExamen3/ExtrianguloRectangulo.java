
package herenciaExamen3;


public class ExtrianguloRectangulo {
   private String tipoFigura;
   private int perimetro;
   private int posicionX;
   private int posicionY;
   private  int base;
   private  int altura;
   private  int lado;
   private  int lado2;
   private  int lado3;
   
   public ExtrianguloRectangulo (int lado,int altura,int base,int lado2,int lado3) {
	   this.base= base;
	   this.altura= altura;
	   this.lado = lado ;
	   this.lado2=lado2;
	   this.lado3 = lado3 ;

	   
   
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
   public int getAltura () {
	   return altura ;
   }
   public int getBase () {
	   return base ;
   }
   public int getLado1 () {
	   return lado;
   }
   public int getLado2 () {
	   return lado2;
   }
   public int getLado3 () {
	   return lado3;
   }
   	   
}



