package com.verdin.jsf.bean;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

//import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.jboss.logging.Logger;

@Singleton
@Startup
public class ContohConfigFactory  {
	
	private static class SingletonHolder {
	       public static ContohConfigFactory instance = new ContohConfigFactory();
	}

	static Logger logger = Logger.getLogger(ContohConfigFactory.class);

	Map<String, String> mm = new HashMap<String, String>();

	static String DEFAULT_USER = "admin";
	static String DEFAULT_PASS = "admin";
	static String CLUSTER = "C10H16";// "YAVA30";// "H2SO4";
	static String HOSTNAME = "192.168.3.132";// 192.168.3.132 192.168.3.221 192.168.3.164

	private ContohConfigFactory() {
		generateDummyData();
	}
		
	 public static ContohConfigFactory getInstance(){
	        return SingletonHolder.instance;
	    }
	 
	 
	
   private void generateDummyData() {

	   logger.info("generateDummyData running ... ");
		
	   mm.put("dfs.config.type", "400");
	   mm.put("dfs.config.dir", "/dfs/work");
	   mm.put("dfs.config.tmp", "/dfs/tmp");
	   mm.put("dfs.config.home", "/dfs/home");
	   
	   logger.info("generateDummyData ... done");
   }
	
}
