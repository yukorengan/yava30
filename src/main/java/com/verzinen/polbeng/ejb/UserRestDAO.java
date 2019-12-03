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
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Named("userRestService")
@ApplicationScoped
public class UserRestDAO {
	
	static Logger logger = Logger.getLogger(UserRestDAO.class);

	public List<UserBean> getRestUser() throws Exception {

		logger.info("get in DAO ...");

	    List<UserBean> _users =  new ArrayList<UserBean>();

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

				_users.add(u);
			}

		}  catch (Exception e) {

			e.printStackTrace();

		}
		return _users;
	}


}
