package com.verzinen.polbeng.ejb;

import com.verzinen.polbeng.model.TEZConfig;
import org.apache.http.entity.StringEntity;
import org.primefaces.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class TEZConfigDA {

    public static String save(TEZConfig tez) {
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
