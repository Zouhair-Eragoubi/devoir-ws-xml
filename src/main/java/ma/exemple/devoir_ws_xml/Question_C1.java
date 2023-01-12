package ma.exemple.devoir_ws_xml;

import jakarta.xml.ws.Endpoint;
import ma.exemple.devoir_ws_xml.classes.ReleveWs;

public class Question_C1 {

	public static void main(String[] args) {
		
		Endpoint.publish("http://0.0.0.0:9191/", new ReleveWs());
		System.out.println("le webService est bien deploye");

	}

}
