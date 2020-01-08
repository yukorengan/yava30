package com.verzinen.polbeng.ejb;

import com.verzinen.polbeng.model.TEZSummary;
import com.verzinen.polbeng.model.UserBean;
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
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;

@Named
@ApplicationScoped
public class StateEJB implements Serializable {
	static final long serialVersionUID = 142234599l;

	TEZSummary tezSummary;

	public void startState(String service) {
		 try {
				JSONObject input = new JSONObject();
				JSONObject state = new JSONObject();
				state.put("state", "STARTED");
				input.put("ServiceInfo", state);

				URL url = new URL("http://35.239.124.198:8080/api/v1/clusters/POLBENG/services/" + service);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("PUT");
				conn.setDoOutput(true);
				String encoded = Base64.getEncoder().encodeToString(("admin:admin").getBytes(StandardCharsets.UTF_8));
				conn.setRequestProperty("Authorization", "Basic "+encoded);
				conn.setRequestProperty("X-Requested-By", "admin");

				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
				out.write(input.toString());
				out.close();

				System.out.println("INPUT JSON : " + input.toString());
				System.out.println("INPUT JSON : " + conn.getResponseCode());

				try(BufferedReader br = new BufferedReader(
						new InputStreamReader(conn.getInputStream(), "utf-8"))) {
					StringBuilder response = new StringBuilder();
					String responseLine = null;
					while ((responseLine = br.readLine()) != null) {
						response.append(responseLine.trim());
					}
					System.out.println(response.toString());
				}
				 	conn.disconnect();
			 		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Berhasil dijalankan, cek background ops pada ambari."));
		    }
		    catch (Exception e) {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Info", "Operasi Gagal : " + e.getMessage()));
		    }
	}

	public void stopState(String service) {
		 try {
				JSONObject input = new JSONObject();
				JSONObject state = new JSONObject();
				state.put("state", "INSTALLED");
				input.put("ServiceInfo", state);

				URL url = new URL("http://35.239.124.198:8080/api/v1/clusters/POLBENG/services/" + service);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("PUT");
				conn.setDoOutput(true);
				String encoded = Base64.getEncoder().encodeToString(("admin:admin").getBytes(StandardCharsets.UTF_8));
				conn.setRequestProperty("Authorization", "Basic "+encoded);
				conn.setRequestProperty("X-Requested-By", "admin");

				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
				out.write(input.toString());
				out.close();

				System.out.println("INPUT JSON : " + input.toString());
				System.out.println("INPUT JSON : " + conn.getResponseCode());

				try(BufferedReader br = new BufferedReader(
						new InputStreamReader(conn.getInputStream(), "utf-8"))) {
					StringBuilder response = new StringBuilder();
					String responseLine = null;
					while ((responseLine = br.readLine()) != null) {
						response.append(responseLine.trim());
					}
					System.out.println(response.toString());
				}
				 conn.disconnect();
				 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Berhasil diberhentikan, cek background ops pada ambari."));
		    }
		    catch (Exception e) {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Info", "Operasi Gagal : " + e.getMessage()));
		    }
	}


	public String readData(String service) {
		// create our mysql database connection
		tezSummary = new TEZSummary();
		String json = null;

		try {
			String url = "http://35.239.124.198:8080/api/v1/clusters/POLBENG/services/"+ service +"?fields=ServiceInfo/state";

			HttpHost targetHost = new HttpHost("35.239.124.198" , 8080, "http");
			CredentialsProvider credsProvider = new BasicCredentialsProvider();
			credsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("admin", "admin"));

			AuthCache authCache = new BasicAuthCache();
			authCache.put(targetHost, new BasicScheme());

			// Add AuthCache to the execution context
			final HttpClientContext context = HttpClientContext.create();
			context.setCredentialsProvider(credsProvider);
			context.setAuthCache(authCache);

			HttpClient client = HttpClientBuilder.create().build();

			HttpResponse response = client.execute(new HttpGet(url), context);

			HttpEntity entity = response.getEntity();

			System.out.println(response.getStatusLine());


			Header[] headers = response.getAllHeaders();

			for (int i = 0; i < headers.length; i++) {
				System.out.println(headers[i]);
			}

			if (entity != null) {
				json =     EntityUtils.toString(entity);
			}

			JSONObject obj = new JSONObject(json);
			tezSummary.setState(obj.getJSONObject("ServiceInfo").getString("state"));
	    }
	    catch (Exception e) {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }

		return tezSummary.getState();
	}

	public TEZSummary getState() {
		return tezSummary;
	}

	public void setState(TEZSummary tezSummary) {
		this.tezSummary = tezSummary;
	}

}
