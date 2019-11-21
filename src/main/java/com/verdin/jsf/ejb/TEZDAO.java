package com.verdin.jsf.ejb;

import com.verdin.jsf.model.HadoopMetric;
import com.verdin.jsf.model.TEZConfig;
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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;


@Named("tezService")
@ApplicationScoped
public class TEZDAO {
	
	static Logger logger = Logger.getLogger(TEZDAO.class);
	
	public TEZConfig getTEZConfig() throws Exception {

		logger.info("get in DAO ...");

		TEZConfig m = new TEZConfig();
		String json = null;

		try {

			String url = "http://192.168.1.231:8080/api/v1/clusters/cyberdefense/configurations?type=tez-site&tag=version1545964639162";

			HttpHost targetHost = new HttpHost("192.168.1.231" , 8080, "http");
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

			JSONObject objTEZConfig = new JSONObject(json);
			JSONArray arr = objTEZConfig.getJSONArray("items");

			m.setHref(arr.getJSONObject(0).getString("href"));
			m.setClusterName(arr.getJSONObject(0).getJSONObject("Config").getString("cluster_name"));
			m.setServiceConfigVersion(arr.getJSONObject(0).getString("tag"));
			m.setServiceName(arr.getJSONObject(0).getString("type"));
			m.setStackID(arr.getJSONObject(0).getJSONObject("Config").getString("stack_id"));
			m.setHeartbeatIntervalMsMax(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.am-rm.heartbeat.interval-ms.max"));
			m.setReleaseTimeoutMaxMillis(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.container.idle.release-timeout-max.millis"));
			m.setGetReleaseTimeoutMinMillis(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.container.idle.release-timeout-min.millis"));
			m.setReuseEnabled(arr.getJSONObject(0).getJSONObject("properties").getBoolean("tez.am.container.reuse.enabled"));
			m.setClusterDefaultCmdOpts(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.launch.cluster-default.cmd-opts"));
			m.setLaunchClusterDefaultCmdOpts(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.launch.cmd-opts"));
			m.setEnv(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.launch.env"));
			m.setLogLevel(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.log.level"));
			m.setResourceMemory(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.resource.memory.mb"));
			m.setHistoryUrlTemplate(arr.getJSONObject(0).getJSONObject("properties").getString("tez.am.tez-ui.history-url.template"));



		}  catch (Exception e) {
			
			e.printStackTrace();

		}


		return m;

	}


}
