package com.ies.baroja;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class actividad3 {
	public static void main(String[]args)throws SAXException, IOException, TransformerConfigurationException, TransformerException{
		String ruta_leer="src\\ejemploXML\\actividad3.xml\\";
		try {
			 File fileFile = new File(ruta_leer);
			 DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newInstance();
			 DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
			 Document document = documentBuilder.parse(fileFile);
			 
			 Utilidades.imprimirXml(document);
			 Utilidades.guardarDocument(document,"src\\ejemloXML\\actividad3.xml\\");
			 
			 
			
		}
		catch(ParserConfigurationException | IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

	

}