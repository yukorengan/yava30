package com.verzinen.polbeng.ejb;

import com.verzinen.polbeng.model.TEZConfig;
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
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import org.apache.commons.lang3.RandomStringUtils;

@Named
@ApplicationScoped
public class TezConfigEJB implements Serializable {
	static final long serialVersionUID = 142255299l;

	TEZConfig tezConfig;
	List<TEZConfig> tezConfigList;
	int i = 0;

	static Logger logger = Logger.getLogger(TezConfigEJB.class);

	@PostConstruct
	public void init() {
		try {
			tezConfig = new TEZConfig();
			readData();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateData(String heartbeatInterval, String releaseTimeoutMax, String releaseTimeoutMin, String reuseEnabled, String ioSort, String groupingMaxSize, String groupingMinSize) {
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmm");  
   			LocalDateTime now = LocalDateTime.now();  
  			System.out.println(dtf.format(now));  
			// JSONObject input = new JSONObject(
			// 		"{\"Clusters\": {\"desired_config\": {\"type\": \"tez-site\",\"tag\": \"e48bcbe6-beba-4f68-9139-1f5b4da9fa0f\",\"properties\": {\"tez.am.am-rm.heartbeat.interval-ms.max\": \""+ heartbeatInterval +"\",\"tez.am.container.idle.release-timeout-max.millis\": \""+ releaseTimeoutMax +"\", \"tez.am.container.idle.release-timeout-min.millis\" : \""+ releaseTimeoutMin +"\", \"tez.am.container.reuse.enabled\" : \""+reuseEnabled+"\", \"tez.runtime.io.sort.mb\" : \""+ioSort+"\", \"tez.grouping.max-size\" : \""+groupingMaxSize+"\", \"tez.grouping.min-size\" : \""+groupingMinSize+"\"}}}}"
			// );
			JSONObject input = new JSONObject();
			JSONObject clust = new JSONObject();
			JSONObject desired = new JSONObject();
			JSONObject prop = new JSONObject();

			desired.put("type", "tez-site");
			desired.put("tag", "e48bcbe6-"+ RandomStringUtils.random(4, true, true) +"-"+RandomStringUtils.random(4, true, true)+"-"+ RandomStringUtils.random(4, false, true) +"-" + dtf.format(now));
			prop.put("tez.am.am-rm.heartbeat.interval-ms.max", heartbeatInterval);
			prop.put("tez.am.container.idle.release-timeout-max.millis", releaseTimeoutMax);
			prop.put("tez.am.container.idle.release-timeout-min.millis", releaseTimeoutMin);
			prop.put("tez.am.container.reuse.enabled", reuseEnabled);
			prop.put("tez.runtime.io.sort.mb", ioSort);
			prop.put("tez.grouping.max-size", groupingMaxSize);
			prop.put("tez.grouping.min-size", groupingMinSize);

			desired.put("properties", prop);
			clust.put("desired_config", desired);
			input.put("Clusters", clust);

			URL url = new URL("http://35.239.124.198:8080/api/v1/clusters/POLBENG");
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

			System.out.println("Kode HTTP : " + conn.getResponseCode());

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
		tezConfigList = new ArrayList<TEZConfig>();
		String json = null;
		String jsonurl = null;

		try {
			String urlInduk = "http://35.239.124.198:8080/api/v1/clusters/POLBENG/configurations?type=tez-site";

			String url = null;

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

			HttpResponse responseInduk = client.execute(new HttpGet(urlInduk), context);

			HttpEntity entityInduk = responseInduk.getEntity();

			System.out.println(responseInduk.getStatusLine());


			Header[] headersInduk = responseInduk.getAllHeaders();

			for (int i = 0; i < headersInduk.length; i++) {
				System.out.println(headersInduk[i]);
			}

			if (entityInduk != null) {

				jsonurl =     EntityUtils.toString(entityInduk);

			}

			JSONObject objURL = new JSONObject(jsonurl);
			JSONArray arrURL = objURL.getJSONArray("items");

			for (int i = 0; i < arrURL.length(); i++) {
				if(arrURL.getJSONObject(i).getInt("version") == arrURL.length())
					url = arrURL.getJSONObject(i).getString("href");
			}

			// Batas Sampai sini

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

			TEZConfig m = new TEZConfig();

			JSONObject objTEZConfig = new JSONObject(json);
			JSONArray arr = objTEZConfig.getJSONArray("items");

			m.setTag(arr.getJSONObject(0).getString("tag"));
			m.setType(arr.getJSONObject(0).getString("type"));
			m.setHeartbeatInterval(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.am-rm.heartbeat.interval-ms.max"));
			m.setReleaseTimeoutMax(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.container.idle.release-timeout-max.millis"));
			m.setReleaseTimeoutMin(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.container.idle.release-timeout-min.millis"));
			m.setReuseEnabled(arr.getJSONObject(0).getJSONObject("properties").getBoolean("tez.am.container.reuse.enabled"));
			m.setIoSort(arr.getJSONObject(0).getJSONObject("properties").getString("tez.runtime.io.sort.mb"));
			m.setGroupingMaxSize(arr.getJSONObject(0).getJSONObject("properties").getString("tez.grouping.max-size"));
			m.setGroupingMinSize(arr.getJSONObject(0).getJSONObject("properties").getString("tez.grouping.min-size"));

			tezConfigList.add(m);
	    }
	    catch (Exception e) {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	}


	public TEZConfig getTezConfig() {
		return tezConfig;
	}

	public void setTezConfig(TEZConfig tezConfig) {
		this.tezConfig = tezConfig;
	}

	public List<TEZConfig> getTezConfigList() {
		return tezConfigList;
	}

	public void setTezConfigList(List<TEZConfig> tezConfigList) {
		this.tezConfigList = tezConfigList;
	}

}
