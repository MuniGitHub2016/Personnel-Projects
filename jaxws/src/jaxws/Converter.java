package jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Converter {
	
	@WebMethod
	public double celsiusTofarenheit(double celsius) {
		return (9.0/5.0)*celsius + 32;
	}
	@WebMethod
	public double farenheitTocelsius(double farenheit) {
		return (5.0/9.0)*(farenheit - 32);
	}

}
