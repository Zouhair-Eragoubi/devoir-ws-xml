package ma.exemple.devoir_ws_xml;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import ma.exemple.devoir_ws_xml.classes.Releve;

public class Question_B4 {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext j = JAXBContext.newInstance(Releve.class);
		Unmarshaller unmarshaller = j.createUnmarshaller();
		Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
		
		System.out.println(releve.toString());

	}

}
