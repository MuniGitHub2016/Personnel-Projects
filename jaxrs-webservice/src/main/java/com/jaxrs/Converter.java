/**
 * 
 */
package com.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author laxmi
 *
 */

@Path("/Converter")
public class Converter {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/celsiusTofarenheit")
	public String celsiusTofarenheit(@QueryParam("celsius") double c) {
		return String.valueOf((9.0 / 5.0) * c + 32);

	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/farenheitTocelsius")
	public String farenheitTocelsius(@QueryParam("farenheit") double f) {
		return String.valueOf((5.0 / 9.0) * (f - 32));
	}
}
