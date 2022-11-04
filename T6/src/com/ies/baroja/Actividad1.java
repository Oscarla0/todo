package com.ies.baroja;

import org.w3c.dom.*;
public class Actividad1 {
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Document document = Utilidades.procesarArchivo("src\\ejemploXML\\Actividad1.xml") ;
		Element nodoRaiz =document.getDocumentElement () ;
		NodeList listapais = nodoRaiz. getChildNodes();
		for (int i=0;i< listapais.getLength();i++) {
		Node paisActual= listapais.item(i) ;
		if(paisActual.getNodeType()==Node.ELEMENT_NODE)
		{
		Element elementpais = (Element) paisActual;
		boolean haypais =
		Boolean.parseBoolean(elementpais.getAttribute("sitio"));
		if(haypais){
		System.out.println(elementpais.getElementsByTagName("titulo").item(0).getTextContent());
		}
}
		}
	}
}
