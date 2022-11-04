package com.ies.baroja;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Practica4 {
	
	public static void main(String[] args) {
		//1-leer el archivo xml
		Document miDoc = Utilidades.procesarArchivo("scr\\ejemplosxml\\practica4.xml");
		
		//2-dado el document pintar las etiquetas nombre
		imprimirEtiquetaNombre(miDoc);
		
	}
	public static void imprimirEtiquetaNombre(Document doc2print) {
		//1-obtener nodo raiz (listaempleados)
		Element nodoRaiz = doc2print.getDocumentElement();		
		
		//2-Obtener la lista de empleados (NodeList)
		NodeList listaEmpleados = nodoRaiz.getElementsByTagName("empleado");
	
		//3-con un for recorrer la lista de empleados
		for (int i=0; i<listaEmpleados.getLength(); i++) {

			//4-Obtenemos el elemento <empleado>
			Element elementEmpleadoActual = (Element) listaEmpleados.item(i);
			
			//5-ahora de empleado obtenemos el nombre
			String sNombre = elementEmpleadoActual.getElementsByTagName("nombre").item(0).getTextContent();
			
			//6-lo mostramos por consola
			System.out.println("-"+sNombre);
						
		}
	} 
		

	//-Obtenemos el elemente sempleado

	//-aboca de cpleada ebtenemos el porce 1/4-10 mostcemos por consola
	}
	
