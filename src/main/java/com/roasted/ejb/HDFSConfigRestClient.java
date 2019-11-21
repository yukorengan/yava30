package com.roasted.ejb;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;



public class HDFSConfigRestClient {
	String DEFAULT_USER = "admin";
	String DEFAULT_PASS = "admin";
	String DEFAULT_SERVICE =  "HDFS";
	String CLUSTER = "C10H16";// "C10H16";
	String HOSTNAME = "192.168.3.132";
	
	public HDFSConfigRestClient(String hostname, String cluster) {
		this.HOSTNAME = hostname;
		this.CLUSTER = cluster;
	}
	
	public String hdfs_config_rest_client (String service_name) throws Exception{
		
		String json = null;
		
		if (null == service_name || service_name.isEmpty() || "".equalsIgnoreCase(service_name))
			  service_name = DEFAULT_SERVICE;
		
		String hostname = HOSTNAME;
		String cluster = CLUSTER;
		
		String URL_BASED_AUTH = "http://"+ hostname +":8080/api/v1/clusters/"+ cluster +"/configurations/service_config_versions/?service_name=HDFS";
		
		HttpHost targetHost = new HttpHost(hostname, 8080, "http");
		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		
		credsProvider.setCredentials(AuthScope.ANY, 
				  new UsernamePasswordCredentials(DEFAULT_USER, DEFAULT_PASS));
		
		  AuthCache authCache = new BasicAuthCache();
		  authCache.put(targetHost, new BasicScheme());
		  
		  // Add AuthCache to the execution context
		  final HttpClientContext context = HttpClientContext.create();
		  context.setCredentialsProvider(credsProvider);
		  context.setAuthCache(authCache);

		  HttpClient client = HttpClientBuilder.create().build();

		  HttpResponse response = client.execute(new HttpGet(URL_BASED_AUTH), context);
		  
		  int statusCode = response.getStatusLine().getStatusCode();
		  
		  System.out.println("----------------------------------------");

		  System.out.println("-- response code -- = "+ statusCode);


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
		
		
		return json;
		
	}
	
	
	

}
