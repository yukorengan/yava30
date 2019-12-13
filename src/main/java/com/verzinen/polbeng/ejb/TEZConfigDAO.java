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

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Named("tezConfigService")
@ApplicationScoped
public class TEZConfigDAO {

    static Logger logger = Logger.getLogger(TEZConfig.class);

    public TEZConfig getTEZConfig() throws Exception {

        logger.info("get in DAO ...");

        TEZConfig m = new TEZConfig();
        String json = null;

        try {

            String url = "http://192.168.3.132:8080/api/v1/clusters/C10H16/configurations?type=tez-site&tag=e48bcbe6-beba-4f68-9139-1f5b4da9fa0f";

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


        }  catch (Exception e) {

            e.printStackTrace();

        }

        return m;

    }

    public String save(TEZConfig tez) {
        try {

            JSONObject input = new JSONObject(
                    "{\"Clusters\": {\"desired_config\": {\"type\": \""+ tez.getType() +"\",\"tag\": \""+ tez.getTag() +"\",\"properties\": {\"tez.am.am-rm.heartbeat.interval-ms.max\": \""+ tez.getHeartbeatInterval() +"\",\"tez.am.container.idle.release-timeout-max.millis\": \""+ tez.getReleaseTimeoutMax() +"\", \"tez.am.container.idle.release-timeout-min.millis\" : \""+ tez.getReleaseTimeoutMin() +"\", \"tez.am.container.reuse.enabled\" : \""+tez.getReuseEnabled()+"\", \"tez.runtime.io.sort.mb\" : \""+tez.getIoSort()+"\", \"tez.grouping.max-size\" : \""+tez.getGroupingMaxSize()+"\", \"tez.grouping.min-size\" : \""+tez.getGroupingMinSize()+"\"}}}}"
            );

            URL url = new URL("http://192.168.3.132:8080/api/v1/clusters/C10H16");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(" PUT");
            conn.setDoOutput(true);
            String encoded = Base64.getEncoder().encodeToString(("admin:admin").getBytes(StandardCharsets.UTF_8));
            conn.setRequestProperty("Authorization", "Basic "+encoded);
            conn.setRequestProperty("X-Requested-By", "admin");

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            out.write(input.toString());
            out.close();

            System.out.println("INPUT JSON : " + input.toString());

            if (conn.getResponseCode() != HttpURLConnection.HTTP_NOT_ACCEPTABLE) {
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

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

        return "admin.xhtml?faces-redirect=true";
    }
}
