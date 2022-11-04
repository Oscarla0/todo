package actividades;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.xmlgraphics.util.MimeConstants;

public class Actividad623 {
	public static void main(String[] args) {
		try {
			File xsltFile = new File("asd\\actividades\\actividad623.xsl");
			StreamSource xmlSource = new StreamSource(new File("asd\\actividades\\actividad623.xml"));
			FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
			FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
			OutputStream out;
			
			out = new FileOutputStream("asd\\output\\pract1.pdf");
			Fop fop=fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);
			TransformerFactory factory = TransformerFactory.newInstance();
			Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));
			Result res = new SAXResult(fop.getDefaultHandler());
			transformer.transform(xmlSource, res);
			out.close();
			System.out.println("PDF generado correctamente en la carperta output");	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}