package com.ies.baroja;

import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class Practica51 {

	
	public static void imprimirXml(Document document2print) 
			throws TransformerConfigurationException , TransformerException  {
		DOMSource domSource= new DOMSource(document2print);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.transform(domSource,result);
		System.out.println("XML de Oscar a String /n "+writer.toString());
	}
		public static Document procesarArchivo(String nombreArchivo){
			DocumentBuilderFactory fabrica;
			DocumentBuilder constructor;
			Document documentoXML=null;
			File fichero=new File(nombreArchivo);
			fabrica= DocumentBuilderFactory.newInstance();
			System.out.println("Procesando "+nombreArchivo);
			try {
				constructor=
						fabrica.newDocumentBuilder();
				documentoXML=constructor.parse(fichero);					
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return documentoXML;
		}

		

		
	}
	
	
	
	
	
	

