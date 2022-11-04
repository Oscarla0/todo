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
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Practica1 {
	private void procesarDocumentAlternativo (Document document) {
		Element nodoRaiz = document.getDocumentElement();
		NodeList listalibros = nodoRaiz.getElementsByTagName("libro");
		for (int i = 0; i < listalibros.getLength();i++) {
		Element elementLibroActual = (Element) listalibros.item(i);
		boolean hayDigital = Boolean.parseBoolean(elementLibroActual.
		getAttribute ("digital") ) ;
		if (hayDigital) System.out.println(elementLibroActual.getElementsByTagName("titulo").
		item(0).getTextContent ());
		}
	}
}

