package com.verzinen.polbeng.ejb;

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
import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Named
@ApplicationScoped
public class UserRestEJB implements Serializable {
	static final long serialVersionUID = 142232299l;

	UserBean user;
	List<UserBean> userList;
	
	UserBean updateUser;


	@PostConstruct
	public void init() {
		try {
			user = new UserBean();
			readData();
			user = new UserBean();
			user.setDisplay_name("");
			user.setAdmin(false);
			user.setPassword("");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertData(UserBean user) {
		try
	    {
			JSONObject input = new JSONObject();
			input.put("Users/display_name", user.getDisplay_name());
			input.put("Users/admin", user.getAdmin());
			input.put("Users/password", user.getPassword());

			URL url = new URL("http://192.168.3.132:8080/api/v1/users/" + user.getUser_name());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			String encoded = Base64.getEncoder().encodeToString(("admin:admin").getBytes(StandardCharsets.UTF_8));
			conn.setRequestProperty("Authorization", "Basic "+encoded);
			conn.setRequestProperty("X-Requested-By", "admin");

			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
			out.write(input.toString());
			out.close();

			System.out.println("INPUT JSON : " + input.toString());

			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

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
			user.setUser_name("");
			user.setDisplay_name("");
			user.setAdmin(false);
			user.setPassword("");
			init();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	}

	public void delData(String user_name) {
		 try {
				 URL url = new URL("http://192.168.3.132:8080/api/v1/users/" + user_name);
				 HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				 String encoded = Base64.getEncoder().encodeToString(("admin:admin").getBytes(StandardCharsets.UTF_8));
				 conn.setRequestProperty("Authorization", "Basic "+encoded);
				 conn.setDoOutput(true);
				 conn.setRequestMethod("DELETE");
				 conn.setRequestProperty("Content-Type", "application/json");
				 conn.setRequestProperty("X-Requested-By", "admin");

				 OutputStream os = conn.getOutputStream();
				 os.flush();

				 if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
					 throw new RuntimeException("Failed : HTTP error code : "
							 + conn.getResponseCode());
				 }

				 BufferedReader br = new BufferedReader(new InputStreamReader(
						 (conn.getInputStream())));

				 String output;
				 System.out.println("Output from Server .... \n");
				 while ((output = br.readLine()) != null) {
					 System.out.println(output);
				 }

				 conn.disconnect();
				 init();
		    }
		    catch (Exception e) {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
	}

	public void updateData(String user_name, String display_name, String password, Boolean admin) {
		try {
			JSONObject input = new JSONObject();
			input.put("Users/display_name", display_name);
			input.put("Users/admin", admin);
			input.put("Users/password", password);

			URL url = new URL("http://192.168.3.132:8080/api/v1/users/" + user_name);
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
			init();
	    }
	    catch (Exception e) {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	}

	public void readData() {
		// create our mysql database connection
		userList = new ArrayList<UserBean>();
		String json = null;

		try {
			String url = "http://192.168.3.132:8080/api/v1/users";

			HttpHost targetHost = new HttpHost("192.168.3.132" , 8080, "http");
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

			JSONArray arr = obj.getJSONArray("items");
			for (int i = 0; i < arr.length(); i++) {
				UserBean u = new UserBean();
				u.setUser_name(arr.getJSONObject(i).getJSONObject("Users").getString("user_name"));

				userList.add(u);
			}
	    }
	    catch (Exception e) {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void bantuUpdate(String user_name) {
		String json = null;
		try
	    {
			String url = "http://192.168.3.132:8080/api/v1/users/" + user_name;

			HttpHost targetHost = new HttpHost("192.168.3.132" , 8080, "http");
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

			updateUser = new UserBean();
			updateUser.setUser_name(obj.getJSONObject("Users").getString("user_name"));
			updateUser.setAdmin(obj.getJSONObject("Users").getBoolean("admin"));
			updateUser.setDisplay_name(obj.getJSONObject("Users").getString("display_name"));

	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
		init();
		PrimeFaces current = PrimeFaces.current();
		current.executeScript("PF('dlg4').show();");

	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public List<UserBean> getUserList() {
		return userList;
	}

	public void setUserList(List<UserBean> userList) {
		this.userList = userList;
	}

	public UserBean getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(UserBean updateUser) {
		this.updateUser = updateUser;
	}
}
