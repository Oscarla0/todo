
package partido5;
/*
 * Adjunta el código de la clase abstracta Personas con:
*- un método llamado imc que calcule   el Indice de Masa Corporal: peso (kg) / estatura (m)*estatura()
*-  un método abstracto llamado estado que nos diga, en función del peso (en kilogramos) y la altura (en metros), nuestro estado.
 */

//CLASE ABSTRACTA LA CUAL NO SE PUEDEN CREAR OBJETOS
public abstract class Youtubers {
	private String titulo;
	private String autor;
	private String fecha;
	private String duracion ;
	private String resumen;
	private String URL ;
	
//CONSTRUCTOR DE PERSONA QUE HEREDARAN LOS HIJOS
public Youtubers(String ISBN,String titulo ,String autor,String pagina,String fecha,
		String periodico,String titular,String resumen, String URL, String duracion) {
	super();
	this.titulo=titulo;
	this.fecha=fecha;
	this.autor =autor;
	this.duracion=duracion;
	this.resumen=resumen;
	this.URL=URL;
	}
public String getTitulo () {
	return titulo;
}
public String getFecha () {
	return fecha;
}
public String getAutor () {
	return autor;
}

public String getURL () {
	return URL;
}

public String getResumen () {
	return resumen;
}
public String getDuracion () {
	return duracion;
}


 
}
