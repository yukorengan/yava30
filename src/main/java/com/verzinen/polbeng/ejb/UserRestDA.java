package com.verzinen.polbeng.ejb;

import com.verzinen.polbeng.model.UserBean;
import org.apache.http.entity.StringEntity;
import org.primefaces.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class UserRestDA {

    public static String save(UserBean user) {
        try {

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

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

        return "admin.xhtml?faces-redirect=true";
    }

    public static String delete(String user_name) {
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

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

        return "admin.xhtml?faces-redirect=true";
    }
}
