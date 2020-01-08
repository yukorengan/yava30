package com.verzinen.polbeng.ejb;

import com.verzinen.polbeng.model.ZKConfig;
import org.apache.commons.lang3.RandomStringUtils;
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
import javax.inject.Named;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Named
@ApplicationScoped
public class ZookeeperConfigEJB implements Serializable {
    static final long serialVersionUID = 141112999l;

    ZKConfig zkConfig;
    List<ZKConfig> zkConfigList;
    int i = 0;

    @PostConstruct
    public void init() {
        try {
            zkConfig = new ZKConfig();
            readData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateData(Integer purgeInterval, Integer snapRetainCount, Integer clientPort, String dataDir, Integer initLimit, Integer syncLimit, Integer tickTime) {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            JSONObject input = new JSONObject();
            JSONObject clust = new JSONObject();
            JSONObject desired = new JSONObject();
            JSONObject prop = new JSONObject();

            desired.put("type", "zoo.cfg");
            desired.put("tag", "zk48cbe6-"+ RandomStringUtils.random(4, true, true) +"-"+RandomStringUtils.random(4, true, true)+"-"+ RandomStringUtils.random(4, false, true) +"-" + dtf.format(now));
            prop.put("autopurge.purgeInterval", purgeInterval);
            prop.put("autopurge.snapRetainCount", snapRetainCount);
            prop.put("clientPort", clientPort);
            prop.put("dataDir", dataDir);
            prop.put("initLimit", initLimit);
            prop.put("syncLimit", syncLimit);
            prop.put("tickTime", tickTime);

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
        zkConfigList = new ArrayList<ZKConfig>();
        String json = null;
        String jsonurl = null;

        try {
            String urlInduk = "http://35.239.124.198:8080/api/v1/clusters/POLBENG/configurations?type=zoo.cfg";

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

            ZKConfig m = new ZKConfig();

            JSONObject objZKConfig = new JSONObject(json);
            JSONArray arr = objZKConfig.getJSONArray("items");

            m.setTag(arr.getJSONObject(0).getString("tag"));
            m.setType(arr.getJSONObject(0).getString("type"));
            m.setPurgeInterval(arr.getJSONObject(0).getJSONObject("properties").getInt("autopurge.purgeInterval"));
            m.setSnapRetainCount(arr.getJSONObject(0).getJSONObject("properties").getInt("autopurge.snapRetainCount"));
            m.setClientPort(arr.getJSONObject(0).getJSONObject("properties").getInt("clientPort"));
            m.setDataDir(arr.getJSONObject(0).getJSONObject("properties").getString("dataDir"));
            m.setInitLimit(arr.getJSONObject(0).getJSONObject("properties").getInt("initLimit"));
            m.setSyncLimit(arr.getJSONObject(0).getJSONObject("properties").getInt("syncLimit"));
            m.setTickTime(arr.getJSONObject(0).getJSONObject("properties").getInt("tickTime"));

            zkConfigList.add(m);
        }
        catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }


    public ZKConfig getZkConfig() {
        return zkConfig;
    }

    public void setZkConfig(ZKConfig zkConfig) {
        this.zkConfig = zkConfig;
    }

    public List<ZKConfig> getZkConfigList() {
        return zkConfigList;
    }

    public void setZkConfigList(List<ZKConfig> zkConfigList) {
        this.zkConfigList = zkConfigList;
    }
}
