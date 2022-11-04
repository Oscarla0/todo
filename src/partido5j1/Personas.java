// CLASE PERSONAS
package partido5j1;

public abstract class Personas {
	// DECLARAMOS LAS VARIABLES DE PERSONAS
		
		String nombre;
		double peso;
		double altura;
		double imc;
	
		public Personas(String nombre, double peso, double altura, double imc) {
			super();
			this.nombre = nombre;
			this.peso = peso;
			this.altura = altura;
			this.imc = imc();
		}

		public String getNombre() {
			return nombre;
		}

		public double getPeso() {
			return peso;
		}

		public double getAltura() {
			return altura;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		// METODO PARA CREAR EL ESTADO
		public abstract void estado ();
		
		// METODO PARA CALCULAR EL IMC
		public double imc() {
			imc = peso / (altura * altura);
			return imc;
		}
}
