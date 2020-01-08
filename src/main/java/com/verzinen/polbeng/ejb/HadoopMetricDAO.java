package com.verzinen.polbeng.ejb;

import com.verzinen.polbeng.model.HadoopMetric;
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


@Named("hadoopMetricService")
@ApplicationScoped
public class HadoopMetricDAO {
	
	static Logger logger = Logger.getLogger(HadoopMetricDAO.class);
	
	public HadoopMetric getHadoopMetric() throws Exception {

		logger.info("get in DAO ...");

		HadoopMetric m = new HadoopMetric();
		String json = null;

		try {

			String url = "http://35.239.124.198:50070/jmx";

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

			JSONObject objHadoopMetric = new JSONObject(json);
			JSONArray arr = objHadoopMetric.getJSONArray("beans");

			m.setName(arr.getJSONObject(0).getString("name"));
			m.setModelerType(arr.getJSONObject(0).getString("modelerType"));
			m.setHostName(arr.getJSONObject(0).getString("tag.Hostname"));
			m.setMemNonHeapUsedM(arr.getJSONObject(0).getInt("MemNonHeapUsedM"));
			m.setMemNonHeapCommittedM(arr.getJSONObject(0).getInt("MemNonHeapCommittedM"));
			m.setMemNonHeapMaxM(arr.getJSONObject(0).getInt("MemNonHeapMaxM"));
			m.setMemHeapUsedM(arr.getJSONObject(0).getInt("MemHeapUsedM"));
			m.setMemHeapCommittedM(arr.getJSONObject(0).getInt("MemHeapCommittedM"));
			m.setMemHeapMaxM(arr.getJSONObject(0).getInt("MemHeapMaxM"));
			m.setMemMaxM(arr.getJSONObject(0).getInt("MemMaxM"));
			m.setGcCountParNew(arr.getJSONObject(0).getInt("GcCountParNew"));
			m.setGcTimeMillisParNew(arr.getJSONObject(0).getInt("GcTimeMillisParNew"));
			m.setGcCountConcurrentMarkSweep(arr.getJSONObject(0).getInt("GcCountConcurrentMarkSweep"));
			m.setGcTimeMillisConcurrentMarkSweep(arr.getJSONObject(0).getInt("GcTimeMillisConcurrentMarkSweep"));
			m.setGcCount(arr.getJSONObject(0).getInt("GcCount"));
			m.setGcTimeMillis(arr.getJSONObject(0).getInt("GcTimeMillis"));
			m.setGcNumWarnThresholdExceeded(arr.getJSONObject(0).getInt("GcNumWarnThresholdExceeded"));
			m.setGcNumInfoThresholdExceeded(arr.getJSONObject(0).getInt("GcNumInfoThresholdExceeded"));
			m.setGcTotalExtraSleepTime(arr.getJSONObject(0).getInt("GcTotalExtraSleepTime"));
			m.setThreadsNew(arr.getJSONObject(0).getInt("ThreadsNew"));
			m.setThreadsRunnable(arr.getJSONObject(0).getInt("ThreadsRunnable"));
			m.setThreadsBlocked(arr.getJSONObject(0).getInt("ThreadsBlocked"));
			m.setThreadsWaiting(arr.getJSONObject(0).getInt("ThreadsWaiting"));
			m.setThreadsTimedWaiting(arr.getJSONObject(0).getInt("ThreadsTimedWaiting"));
			m.setThreadsTerminated(arr.getJSONObject(0).getInt("ThreadsTerminated"));
			m.setLogFatal(arr.getJSONObject(0).getInt("LogFatal"));
			m.setLogError(arr.getJSONObject(0).getInt("LogError"));
			m.setLogWarn(arr.getJSONObject(0).getInt("LogWarn"));
			m.setLogInfo(arr.getJSONObject(0).getInt("LogInfo"));

			
		}  catch (Exception e) {
			
			e.printStackTrace();

		}


		return m;

	}


}
