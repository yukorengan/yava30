package com.verzinen.telyu.ejb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//import org.jboss.logging.Logger;

public class TelyuFileClient {
	
//	static Logger logger = Logger.getLogger(UGMRestClient.class);
	String DEFAULT_JSON_FILE = "/app/devel/prime/json/DATANODE.json";
	
	public TelyuFileClient(String file_name) {
		this.DEFAULT_JSON_FILE = file_name;
	}
	

     public String textFileReader (String file_name) throws Exception {
		
		
		  String json =  null;  
		 
		  try
		    { 
		     // lines = Files.readAllLines(Paths.get(DEFAULT_JSON_FILE), StandardCharsets.UTF_8);
			  byte[] json2 = Files.readAllBytes(Paths.get(DEFAULT_JSON_FILE));
			  json = new String(json2);
		    } 
		  
		    catch (IOException e) 
		    { 
		      e.printStackTrace(); 
		    } 
		
		
		return json ;
	}

	
}
