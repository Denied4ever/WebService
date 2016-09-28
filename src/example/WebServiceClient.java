package example;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class WebServiceClient {
	
	public static void main(String[] args) throws MalformedURLException{
		
		URL url = new URL("http://localhost:8080/MyWebService/WebServiceInterface?wsdl");
		QName qname = new QName("http://example/", "WebService");
		Service service = Service.create(url,qname);
		WebServiceInterface callWebService = service.getPort(WebServiceInterface.class);
		System.out.println("Serviceoutput:\n"+callWebService.convertCurrency("NZD","AUD",8.00));
		
	}

}
