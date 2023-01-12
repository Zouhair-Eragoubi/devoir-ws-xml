package ma.exemple.devoir_ws_xml;

import java.io.File;
import java.util.Date;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import ma.exemple.devoir_ws_xml.classes.Operation;
import ma.exemple.devoir_ws_xml.classes.Operations;
import ma.exemple.devoir_ws_xml.classes.Releve;
import ma.exemple.devoir_ws_xml.classes.TypeOperation;

public class Question_B3 
{
    public static void main( String[] args ) throws JAXBException
    {
    	JAXBContext j = JAXBContext.newInstance(Releve.class);
    	
        Releve releve = new Releve("011112222333344445555666", new Date(), 200000.0);
		
		Operations operations = new Operations(new Date(),new Date());

		Operation op1 = new Operation(TypeOperation.CREDIT, new Date(), 9000.0, "Vers Espèce");
		Operation op2 = new Operation(TypeOperation.DEBIT , new Date(), 3400.0, "Chèque Guichet");
		Operation op3 = new Operation(TypeOperation.DEBIT , new Date(), 120.0,  "Prélèvement Assurence");
		Operation op4 = new Operation(TypeOperation.CREDIT, new Date(), 70000.0, "Virement");
		
		operations.addOperation(op1);
		operations.addOperation(op2);
		operations.addOperation(op3);
		operations.addOperation(op4);
		
		releve.setOperations(operations);
		
		Marshaller marshaller = j.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(releve, new File("releve.xml"));

		
		
    }
}
