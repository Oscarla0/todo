// CLASE JUGADORES
package partido5j1;

public class Jugadores extends Personas {
	int dorsal;
	String equipo;	String posicion;
	String comentarios;


	public Jugadores(String nombre, double peso, double altura, double imc, int dorsal, String equipo, String posicion,
			String comentarios) {
		super(nombre, peso, altura, imc);
		this.dorsal = dorsal;
		this.equipo = equipo;
		this.posicion = posicion;
		this.comentarios = comentarios;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

	public String getPosicion() {
		return posicion;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	public void estado() {
		if (imc() < 18) {
			System.out.println("Bajo peso");
		}
		else if (imc() >= 18 && imc() < 22) {
			System.out.println("Peso normal");
		}
		else if (imc() >= 22 && imc() < 25) {
			System.out.println("Sobrepeso");
		}
	}

	public void ImprimirDatos() {
		System.out.println("Nombre "+nombre);
		System.out.println("Peso "+peso);
		System.out.println("Altura "+altura);
		System.out.println("Indice de masa corporal "+imc);
		System.out.println("Dorsal "+dorsal);
		System.out.println("Equipo "+equipo);
		System.out.println("Posicion "+posicion);
	}
}
