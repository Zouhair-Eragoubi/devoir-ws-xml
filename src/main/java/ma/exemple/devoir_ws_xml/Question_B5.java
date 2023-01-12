package ma.exemple.devoir_ws_xml;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;
import ma.exemple.devoir_ws_xml.classes.Releve;

public class Question_B5 {

	public static void main(String[] args) throws JAXBException, IOException {
		
		JAXBContext j = JAXBContext.newInstance(Releve.class);
		j.generateSchema(new SchemaOutputResolver() {
			
			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
				StreamResult streamResult = new StreamResult(new File("releveSchema.xsd"));
				return streamResult;
			}
		});

	}

}
