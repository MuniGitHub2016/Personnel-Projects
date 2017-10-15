package axis2ws;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import axis2ws.ConverterStub.CelsiusTofarenheit;
import axis2ws.ConverterStub.CelsiusTofarenheitResponse;
import axis2ws.ConverterStub.FarenheitTocelsius;
import axis2ws.ConverterStub.FarenheitTocelsiusResponse;

public class ConverterClient {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		
		ConverterStub cs = new ConverterStub();
				double celsius = 30;
				double farenheit = 78;
		
		CelsiusTofarenheit cf= new CelsiusTofarenheit();
		cf.setCelsius(celsius);
		CelsiusTofarenheitResponse res = cs.celsiusTofarenheit(cf);
		System.out.println("Farenheit"+res.get_return());
		
		FarenheitTocelsius fc = new FarenheitTocelsius();
		fc.setFarenheit(farenheit);
		FarenheitTocelsiusResponse res1 = cs.farenheitTocelsius(fc);
		System.out.println("Celsius"+res1.get_return());
		
		
		
		
		
		

	}

}
