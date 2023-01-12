package ma.exemple.devoir_ws_xml.classes;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
	
	@XmlAttribute
	private String RIB;
	private Date dateReleve;
	private double solde;
	private Operations operations;
	
	
	
	public Releve() {
	}

	public Releve(String rIB, Date dateReleve, double solde) {
		RIB = rIB;
		this.dateReleve = dateReleve;
		this.solde = solde;
	}

	public String getRIB() {
		return RIB;
	}

	public void setRIB(String rIB) {
		RIB = rIB;
	}

	public Date getDateReleve() {
		return dateReleve;
	}

	public void setDateReleve(Date dateReleve) {
		this.dateReleve = dateReleve;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Operations getOperations() {
		return operations;
	}

	public void setOperations(Operations operations) {
		this.operations = operations;
	}

	@Override
	public String toString() {
		String releve = "";
		releve += "Releve \n\t RIB=" + this.RIB + "\n\t dateReleve=" + this.dateReleve + "\n\t solde=" + this.solde +"\n\t ";
		releve +=  this.operations.toString();
		for (Operation operation : this.operations.getOperations()) {
			releve += operation.toString();
			releve += "\n\t";

		}
		return releve;
	}
	
	
	
	
	
	
	

}
