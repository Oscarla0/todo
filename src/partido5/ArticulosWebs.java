
package partido5;
/*
 * Adjunta el código de la clase abstracta Personas con:
*- un método llamado imc que calcule   el Indice de Masa Corporal: peso (kg) / estatura (m)*estatura()
*-  un método abstracto llamado estado que nos diga, en función del peso (en kilogramos) y la altura (en metros), nuestro estado.
 */

//CLASE ABSTRACTA LA CUAL NO SE PUEDEN CREAR OBJETOS
public abstract class ArticulosWebs {
	private String titular;
	private String autor;
	private String fecha;
	private String periodico;
	private String pagina ;
	private String resumen;
	private String URL ;
	
//CONSTRUCTOR DE PERSONA QUE HEREDARAN LOS HIJOS
public ArticulosWebs(String ISBN,String titulo ,String autor,String pagina,String fecha,
		String periodico,String titular,String resumen,String URL) {
	super();
	this.titular=titular;
	this.fecha=fecha;
	this.autor =autor;
	this.periodico=periodico;
	this.pagina=pagina;
	this.resumen=resumen;
	this.URL=URL;
	}
public String getTitular () {
	return titular;
}
public String getFecha () {
	return fecha;
}
public String getAutor () {
	return autor;
}
public String getPeriodico () {
	return periodico;
}
public String getPagina () {
	return pagina;
}

public String getResumen () {
	return resumen;
}
public String getURL () {
	return URL;
}
 
}
