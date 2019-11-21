package com.roasted.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


import org.jboss.logging.Logger;
import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.TabCloseEvent;

import com.roasted.ejb.HDFSConfigRestUtil;
import com.roasted.ejb.HDFSConfigRestClient;
import com.roasted.model.Config;
import com.roasted.model.Configuration;
import com.roasted.model.Item;
import com.roasted.model.POJOConfigResult;

/*
 *  Written by Reyzaldy, 28/02/2019
 */

@ManagedBean
@RequestScoped

public class HDFSConfigRestView implements Serializable{
	
	private static final long serialVersionUID = 1L;

	static Logger logger = Logger.getLogger(HDFSConfigRestView.class);
	
	static Double input1;
	
	
	POJOConfigResult _json_as_pojo;
	List<Item> items;
	
	static String DEFAULT_USER = "admin";
	static String DEFAULT_PASS = "admin";
	static String HOSTNAME = "192.168.3.132";
	static String DEFAULT_SERVICE =  "HDFS";
	
//	static String port = "50075";
	static String CLUSTER = "C10H16";
//	static String stack = "YAVA-3.0";
	
	Item _current_time;
	List<Configuration> current_configuration;
	static Configuration configuration;
	Config config;
	
	static long timeStamp;
	
	HDFSConfigRestClient hdfs_client = new HDFSConfigRestClient(HOSTNAME, CLUSTER);	
	
	
	
	@PostConstruct
	public void init() throws Exception {
//		getJSON();
		
		items = new ArrayList<Item>();
		
		

		String json =  hdfs_client.hdfs_config_rest_client(DEFAULT_SERVICE);
		
		  
		 _json_as_pojo = HDFSConfigRestUtil.json2pojo(json);
		 
		 
	
		 items = _json_as_pojo.getItems();    	
		 
		 System.out.println("items = "+ items.size());
		 
		 Item _current_item = items.stream()
   			 .filter(item -> item.getIsCurrent())
   			 .findAny()
   			 .orElse(null);
		 
		 current_configuration = _current_item.getConfigurations();
		 
		 System.out.println("_current_configurations = "+ current_configuration.size());
		 
//		 configuration = getCurrentConfigurationByType("hdfs-site");
		 

		
	}
	
	public void getJSON() {
		try {
			String _url = "http://192.168.3.132:8080/api/v1/clusters/YAVA30/configurations/"
					+ "service_config_versions/?service_name=HDFS";
			
			String json = hdfs_client.hdfs_config_rest_client(_url);
			_json_as_pojo = HDFSConfigRestUtil.json2pojo(json);
			
			
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
public void POSTRequest() throws IOException{
		
//		String input = input1.toString();
		
		StringBuffer postInput = new StringBuffer(input1.toString());
		
//		long timeNow = System.currentTimeMillis();
		
		
	    final String POST_PARAMS = "{\n" + "\"href\": http://192.168.3.132:8080/api/v1/clusters/C10H16/configurations/service_config_versions?service_name=HDFS,\r\n" +

        "    \"items\": [ \r\n" + 
        "{ \r\n" + 
        "\"href\": http://192.168.3.132:8080/api/v1/clusters/C10H16/configurations/service_config_versions?service_name=HDFS&service_config_version=1,\r\n" + 
        "\"cluster_name\": C10H16,\r\n"+
        "\"configurations\": [ \r\n"+
        "\"Config\": { \r\n"+
        "\"cluster_name\": C10H16,\r\n"+
        "\"stack_id\": YAVA-3.0 \r\n"+
        "},\r\n"+
        "\"type\":"+ configuration.getCurrentConfigurationByType()+",\r\n"+
        "\"tag\":"+ configuration.getTag() +",\r\n"+
        "\"version\":"+ configuration.getVersion() +",\r\n"+
        "\"properties\":"+ configuration.get_Properties() +"{,\r\n"+
        postInput +
        "},\r\n"+
        "\"properties_attributes\":"+ configuration.get_PropertiesAttributes()+",\r\n"+
        "{,\r\n"+
        "\"cluster_name\": C10H16,\r\n"+
        "},\r\n"+
        "],\r\n"+
        "\"createtime\":1548301089160,\r\n"+
        "\"group_id\" : -1,\r\n"+
        "\"group_name\" : Default,\r\n"+
        "\"hosts\" : [ ],\r\n"+
        "\"is_cluster_compatible\" : true,\r\n"+
        "\"is_current\" : true,\r\n"+
        "\"service_config_version\" : 8,\r\n"+
        "\"service_config_version_note\" : ,\r\n"+
        "\"service_name\" : HDFS,\r\n"+
        "\"stack_id\" : YAVA-3.0,\r\n"+
        "\"user\" : admin \r\n"+
        "}\r\n"+
        "]\r\n" +
        "}\r\n";
	    
	    
	    URL obj =  new URL("http://192.168.3.132:8080/api/v1/clusters/YAVA30/configurations/"
		+ "service_config_versions/?service_name=HDFS");
		HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		postConnection.setRequestMethod("POST");
		postConnection.setRequestProperty("admin", "admin");
		postConnection.setRequestProperty("Content-Type", "application/json");
		
		
		postConnection.setDoOutput(true);
		OutputStream os = postConnection.getOutputStream();
		os.write(POST_PARAMS.getBytes());
		os.flush();
		os.close();
		
	    int responseCode = postConnection.getResponseCode();
	    System.out.println("POST Response Code :  " + responseCode);
	    System.out.println("POST Response Message : " + postConnection.getResponseMessage());
	    
	    if(responseCode == HttpURLConnection.HTTP_CREATED) {
	    BufferedReader in = new BufferedReader(new InputStreamReader(
	    		postConnection.getInputStream()));
	    
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    
	    while ((inputLine = in .readLine()) != null) {
	    	response.append(inputLine);
	    } in.close();
	    
        // print result

        System.out.println(response.toString());

    } else {

        System.out.println("POST NOT WORKED");

    }
	    
		
	}
	
	
	public List<Item> getItems() {
		return items;
	}

	
	
	public void buttonAction() throws IOException {
		POSTRequest();
	}
	public POJOConfigResult get_json_as_pojo() {
		return _json_as_pojo;
	}

	public void set_json_as_pojo(POJOConfigResult _json_as_pojo) {
		this._json_as_pojo = _json_as_pojo;
	}

	public HDFSConfigRestClient getHdfs_client() {
		return hdfs_client;
	}

	public void setHdfs_client(HDFSConfigRestClient hdfs_client) {
		this.hdfs_client = hdfs_client;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public HDFSConfigRestView() {
		input1 = 0d;
	}
	
	

	public String   getType() {
	   	
	   	   return configuration.getType();
	    	   
		}
	
	public String   getTag() {
	   	
	   	   return configuration.getTag();
	    	   
		}
	
	public Integer   getVersion() {
	   	
	   	   return configuration.getVersion();
	    	   
		}
	
	public String   getClusterName() {
	   	
	   	   return configuration.getConfig().getClusterName();
	    	   
		}
	public String   getStackId() {
		
	   	   return configuration.getConfig().getStackId();
	    	   
		}
	
	public Map<String, Object >  getProperties(String type) {
		
			// String _type = "\"" + type +"\"";
		
		       Configuration cfg = getCurrentConfigurationByType(type);
		       
		   
		
	   	   return cfg.get_Properties();
	    	   
		}
	
	public Map<String, Object >  getProperties() {
	   	
	   	   return configuration.get_Properties();
	    	   
		}
	
	public Map<String, Object>    getPropertiesAttributes() {
	   	
	   	   return configuration.get_PropertiesAttributes();
	    	   
		}

	
	 public  Configuration  getCurrentConfigurationByType(String type) {
			
		   String _type = "\"" + type +"\"";
		   
			Configuration c  = current_configuration.stream()
					 .filter(e -> _type.equalsIgnoreCase(e.getType()))
		   			 .findAny()
		   			 .orElse(null);
				
			
			return c;
		}
	
	 public void onTabChange(TabChangeEvent event) {
	        FacesMessage msg = new FacesMessage("Tab Changed", "Active Tab: " + event.getTab().getTitle());
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	         
	    public void onTabClose(TabCloseEvent event) {
	        FacesMessage msg = new FacesMessage("Tab Closed", "Closed tab: " + event.getTab().getTitle());
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	

}
