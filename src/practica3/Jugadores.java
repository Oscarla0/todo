package practica3;


public class Jugadores extends Persona {

	int dorsal;

	String equipo;
	String posicion;

	String comentarios;


	public Jugadores(String dni, String nombre, String apellido, int anoNacimiento, String ciudad, String pais,

			int dorsal, String equipo, String posicion, String comentarios) {
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
	@Override
	public String toString() {
		return "Jugadores [dorsal=" + dorsal + ", equipo=" + equipo + ", posicion=" + posicion + ", comentarios="
				+ comentarios + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", anoNacimiento="
				+ anoNacimiento + ", ciudad=" + ciudad + ", pais=" + pais + "]";
	}

}