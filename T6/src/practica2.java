

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.xmlgraphics.util.MimeConstants;

public class practica2 {
	public static void main(String[] args) {
		System.out.println("inicio actividad resuleta 6.2");
		String sArchivoXml = "actividades\\xsl\\actividad623.xsl";
		String sPDFSalida = "actividades\\output\\actividad623.png";
		try {
			generarPdf(sArchivoXml,sPDFSalida);
		}catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("error al convertir el archivo");
		}
		System.out.println("Fin actividad Resuelta");	
	}
	private static void generarPdf(String xmlEntrada , String archivoSalida) throws TransformerConfigurationException, 
		FileNotFoundException , FOPException , TransformerException , IOException {
		
		StreamSource xmlSource = new StreamSource(new File(xmlEntrada));
		FopFactory fopFactory =FopFactory.newInstance(new File(".").toURI());
		FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
		OutputStream out;
		
		out = new FileOutputStream(archivoSalida);
		Fop fop = fopFactory.newFop(MimeConstants.MIME_PNG, foUserAgent,out);
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		Result res = new SAXResult(fop.getDefaultHandler());
		transformer.transform(xmlSource, res);
		out.close();
		System.out.println("PDF generado correctamente en la carpeta output");
		
	}
}