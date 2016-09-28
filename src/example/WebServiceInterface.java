package example;

import javax.jws.WebService;

@WebService
public interface WebServiceInterface {
//Your own function signature goes here
public String greet(String clientName);
public String convertCurrency(String original, String target, double money);

}
