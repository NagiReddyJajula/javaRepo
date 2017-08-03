package com.app;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/rest")
//@Component
public class Testing {

	@GET
	@Path("/hello")
	@Produces("application/json")
	public String m1(){
		return "Hello";
	}
}
