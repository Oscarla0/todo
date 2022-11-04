
package partido5;
/*
 * Adjunta el c�digo de la clase abstracta Personas con:
*- un m�todo llamado imc que calcule   el Indice de Masa Corporal: peso (kg) / estatura (m)*estatura()
*-  un m�todo abstracto llamado estado que nos diga, en funci�n del peso (en kilogramos) y la altura (en metros), nuestro estado.
 */

//CLASE ABSTRACTA LA CUAL NO SE PUEDEN CREAR OBJETOS
public abstract class Libros {
	private String ISBN;
	private String titulo;
	private String autor;
	private String a�o;
	private String editorial;
	private String edicion;
	private String fecha_prestamo;
	private String fecha_devolucion;
	private String prestado;
	private String resumen;

	
//CONSTRUCTOR DE PERSONA QUE HEREDARAN LOS HIJOS
public Libros(String ISBN,String titulo ,String autor,String a�o,String editorial,String edicion,
		String fecha_prestamo,String fecha_devolucio,String prestado,String resumen) {
	super();
	this.ISBN = ISBN;
	this.titulo=titulo;
	this.autor =autor;
	this.a�o=a�o;
	this.editorial=editorial;
	this.edicion=edicion;
	this.fecha_prestamo=fecha_prestamo;
	this.fecha_devolucion=fecha_devolucio;
	this.prestado=prestado;
	this.resumen=resumen;
	}
public String getISBN () {
	return ISBN;
}
public String getTitulo () {
	return titulo;
}
public String getAutor () {
	return autor;
}
public String getA�o () {
	return a�o;
}
public String getEditorial () {
	return editorial;
}
public String getEdicion() {
	return edicion;
}
public String getFecha_prestamo () {
	return fecha_prestamo;
}
public String getFecha_devolucion () {
	return fecha_devolucion;
}
public String getPrestado () {
	return prestado;
}
public String getResumen () {
	return resumen;
}

 
}
