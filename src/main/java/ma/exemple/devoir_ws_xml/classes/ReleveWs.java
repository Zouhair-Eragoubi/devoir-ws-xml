package ma.exemple.devoir_ws_xml.classes;

import java.util.Date;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;


@WebService(serviceName  =  "releveWs")
public class ReleveWs {
	
	
	@WebMethod(operationName = "getReleve")
	public Releve getReleve() {
		
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
		
		return releve;
		
	}
	
	@WebMethod(operationName = "getReleveByRib")
	public Releve getReleveByRib(@WebParam(name = "rib") String rib) {
		
		return null;
		
	}

}
