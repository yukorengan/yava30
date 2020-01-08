package com.verzinen.polbeng.ejb;

import com.verzinen.polbeng.model.YARNSummary;
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
import org.primefaces.json.JSONObject;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named("yarnSumService")
@ApplicationScoped
public class YARNSummaryDAO {
	
	static Logger logger = Logger.getLogger(YARNSummary.class);
	
	public YARNSummary getYARNSummary() throws Exception {

		logger.info("get in DAO ...");

		YARNSummary m = new YARNSummary();
		String json = null;

		try {

			String url = "http://35.239.124.198:8080/api/v1/clusters/POLBENG/services/YARN/";

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

			//JSONArray arr = obj.getJSONArray("alerts_summary");
			JSONObject arr = obj.getJSONObject("alerts_summary");

			m.setCritical(arr.getInt("CRITICAL"));
			m.setMaintenance(arr.getInt("MAINTENANCE"));
			m.setOk(arr.getInt("OK"));
			m.setUnknown(arr.getInt("UNKNOWN"));
			m.setWarning(arr.getInt("WARNING"));

		}  catch (Exception e) {
			
			e.printStackTrace();

		}


		return m;

	}


}
