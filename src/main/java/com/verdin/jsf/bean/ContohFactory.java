package com.verdin.jsf.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.jboss.logging.Logger;

import com.verdin.jsf.model.Konfigurasi;
import com.verdin.jsf.model.Param;

@Singleton
@Startup
public class ContohFactory  {
	
	private static class SingletonHolder {
	       public static ContohFactory instance = new ContohFactory();
	}
	
	static Logger logger = Logger.getLogger(ContohFactory.class);
	
	List<Konfigurasi> _current_konfig2 = new ArrayList<Konfigurasi>();
	
	List<Param> _params =  new ArrayList<Param>();
	
	
	private ContohFactory() {
		generateDummyData();
	}
		
	 public static ContohFactory getInstance(){
	        return SingletonHolder.instance;
	    }
	 
	 
	 
	 public void doSomeStuff() {
		 for (Param e: _params) {
	    		logger.info("doSomeHive() ... "+ e.getKey() +" : "+  e.getValue());
	    	}
	 }
	
  
   private void generateDummyData() {

	   logger.info("generateDummyData running ... ");
	   
	   Konfigurasi konf = new Konfigurasi();
	   
	   konf.setType("dfs");
	   konf.setVersion(17);
	   
	  // konf.set_Properties(properties_as_map);
	   
	   Map<String,Object> mm = new HashMap<String,Object>();
	   
	  // mm.put(key, value);
	   mm.put("dfs.config.type", "400");
	   mm.put("dfs.config.dir", "/dfs/work");
	   mm.put("dfs.config.tmp", "/dfs/tmp");
	   mm.put("dfs.config.home", "/dfs/home");
	   
	   konf.set_Properties(mm);
	   
	   // collect 
	   _current_konfig2.add(konf);
	   
	   Konfigurasi konf2 = new Konfigurasi();
	   
	   konf2.setType("hive");
	   konf2.setVersion(18);
	   
	   Map<String,Object> ll = new HashMap<String,Object>();
	   
		  // mm.put(key, value);
		   ll.put("hive.config.cfg", "/etc/hive");
		   ll.put("hive.config.dir", "/hive/work");
		   ll.put("hive.config.tmp", "/hive/tmp");
		   ll.put("hive.config.home", "/hive/home");
	   
		   konf2.set_Properties(ll);
	   
		   // collect 
		   _current_konfig2.add(konf2);
		   
		   
		   Konfigurasi konf3 = new Konfigurasi();
		   
		   konf3.setType("metron");
		   konf3.setVersion(19);
		   
		   Map<String,Object> lll = new HashMap<String,Object>();
		   
			  // mm.put(key, value);
			   lll.put("metron.config.cfg", "/etc/metron");
			   lll.put("metron.config.dir", "/metron/work");
			   lll.put("metron.config.tmp", "/metron/tmp");
			   lll.put("metron.config.home", "/metron/home");
		   
			   konf3.set_Properties(lll);
		   
			   // collect 
			   _current_konfig2.add(konf3);
			   
			   for (Map.Entry<String,Object> e: lll.entrySet()  ) {
					
					_params.add(new Param(e.getKey(),e.getValue().toString()));
					
		    	}
			   
			   
		   logger.info("generateDummyData ... done");
   }
	
}
