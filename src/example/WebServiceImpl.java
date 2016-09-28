package example;
import javax.jws.WebService;
@WebService(
endpointInterface = "example.WebServiceInterface",
	portName = "webservicePort",
	serviceName = "WebService")
public class WebServiceImpl implements WebServiceInterface {

	
	@Override
public String greet(String clientName) {
// TODO Auto-generated method stub
// your own function implementation goes here
		return "Hi," + clientName + ", this is WebService!";
	}


public String convertCurrency(String original, String target, double money){
	double result = money*2;

	return "$"+money+ " " + original + " = $"+result + " " + target;
}	
	
	
	
	
	
}