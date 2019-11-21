package com.roasted.ejb;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class YARNRestClient {
	String CLUSTER = "C10H16";
	String HOSTNAME = "192.168.3.132";
	
	public YARNRestClient (String hostname, String cluster) {
		this.HOSTNAME = hostname;
		this.CLUSTER = cluster;
	}
	
	public String ambari_plain_client (String url) throws Exception {
		  String json =  null;  
		  String URL_JMX_BASIC = url;
		  
		  HttpClient client = HttpClientBuilder.create().build();
		  HttpResponse response = client.execute(new HttpGet(URL_JMX_BASIC));
		  HttpEntity entity = response.getEntity();
		  System.out.println(response.getStatusLine());
		  Header[] headers = response.getAllHeaders();

		  for (int i = 0; i < headers.length; i++) {
			  System.out.println(headers[i]);
		  }
		  if (entity != null) {
			 json =     EntityUtils.toString(entity);
		  } 
		  System.out.println("----------------------------------------");
		
		return json ;
	}

}
