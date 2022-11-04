package com.ies.baroja;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class Actividad2 {

	public static void main(String[] args) {
		try {

		
		DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
		Document document = documentBuilder.newDocument();
		Element elementAnime = document.createElement("Anime");
		Element elementTitulo = document.createElement("titulo");
		Attr attributeDisponible =document.createAttribute("disponibleSource");
		attributeDisponible.setValue("true");
		Text textTitulo =document.createTextNode("Pokemon");
		elementTitulo.appendChild(textTitulo);
		elementAnime.appendChild(elementTitulo);
		elementAnime.setAttribute("disponibleDigital", "true");
		elementAnime.setAttributeNode(attributeDisponible);
		document.appendChild(elementAnime);


		//vamos a imprimir 
		imprimirXml(document);
		
		
		}
		catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		}
		catch (TransformerConfigurationException e2) {
			e2.printStackTrace();
			
		}
		catch (TransformerException e3) {
			e3.printStackTrace();
		}
	}

	//imprimirXml(Document document2print)
	private static void imprimirXml(Document document2print) 
			throws TransformerConfigurationException , TransformerException  {
		DOMSource domSource= new DOMSource(document2print);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.transform(domSource,result);
		System.out.println("XML de Oscar es : n  "+writer.toString());
		
		

		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


