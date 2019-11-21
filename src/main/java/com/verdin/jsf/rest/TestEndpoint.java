package com.verdin.jsf.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.Enumeration;
import java.util.Properties;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/test")
public class TestEndpoint {
	

	@GET
	@Produces("text/plain")
	public Response doGet() {
		
		String resp = "Failed";
	
		try {
			
			
			printprop();
			 
			
			resp = "Ok";
			
		
		} catch (Exception e) {
	    	e.printStackTrace();
	    	
	    }
		
		
		return Response.ok("Hello, got response "+ resp).build();
	}
	
	void printprop() {
		Properties p = System.getProperties();
		
		Enumeration<Object> keys = p.keys();
		
		while (keys.hasMoreElements()) {
		    String key = (String)keys.nextElement();
		    String value = (String)p.get(key);
		    System.out.println(key + ": " + value);
		}
	}
}
