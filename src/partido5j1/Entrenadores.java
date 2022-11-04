// CLASE ENTRENADORES
package partido5j1;

public class Entrenadores extends Personas {
	
	String equipo;
	
	public Entrenadores(String nombre, double peso, double altura, double imc, String equipo) {
		super(nombre, peso, altura, imc);
		this.equipo = equipo;
	}

	public void estado() {
		if (imc() < 18.5) {
			System.out.println("Bajo peso");
		}
		else if (imc() >= 18.5 && imc() < 24.9) {
			System.out.println("Peso normal");
		}
		else if (imc() >= 25.0 && imc() < 29.9) {
			System.out.println("Preobesidad o sobrepeso");
		}
		else if (imc() >= 30.0 && imc() < 34.9) {
			System.out.println("Obesidad clase I");
		}
		else if (imc() >= 35.0 && imc() < 39.9) {
			System.out.println("Obesidad clase II");
		}
		else if (imc() >= 40 ) {
			System.out.println("Obesidad clase III");
		}
	}
	public void ImprimirDatos() {
		System.out.println("Nombre "+nombre);
		System.out.println("Peso "+peso);
		System.out.println("Peso "+altura);
		System.out.println("Indice de masa corporal "+imc);
		System.out.println("Equipo "+equipo);
	}
}
