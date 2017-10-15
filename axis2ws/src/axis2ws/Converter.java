package axis2ws;

public class Converter {
	
	public double celsiusTofarenheit(double celsius) {
		return (9.0/5.0)*celsius + 32;
	}
	
	public double farenheitTocelsius(double farenheit) {
		return (5.0/9.0)*(farenheit - 32);
	}

}
