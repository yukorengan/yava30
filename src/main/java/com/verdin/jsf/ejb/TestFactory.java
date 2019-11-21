package com.verdin.jsf.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;

import com.verdin.jsf.bean.Artikel;

//@ThreadSafe
public class TestFactory {
	
	static Logger logger = Logger.getLogger(TestFactory.class);
	
	private static class SingletonHolder {
	       public static TestFactory instance = new TestFactory();
	}
	
	public  List<Artikel> items =  new ArrayList<Artikel>();
    public  Map<String,Artikel> hashMap = new HashMap<String,Artikel>();
    public  Map<String,String> _map = new HashMap<String,String>();

    private TestFactory() {
    	 generateDummyData();
    }
    
    public static TestFactory getInstance(){
        return SingletonHolder.instance;
    }
    
	private void generateDummyData() {
		Artikel aa = new Artikel(11000l,"phoenix");
    	Artikel ba = new Artikel(21000l,"mapreduce");
    	Artikel ca = new Artikel(31000l,"zookeeper");
    	Artikel da = new Artikel(41000l,"ambari");
     	
    	items.add(aa);
    	items.add(ba);
    	items.add(ca);
    	items.add(da);
    	
    	logger.info("items size "+ items.size());
    	
    	Artikel a = new Artikel(100l,"hive");
    	Artikel b = new Artikel(200l,"yarn");
    	Artikel c = new Artikel(300l,"zookeeper");
    	Artikel d = new Artikel(400l,"hbase");
    	
        
        hashMap.put("id-"+ a.getId(), a);
        hashMap.put("id-"+ b.getId(), b);
        hashMap.put("id-"+ c.getId(), c);
        hashMap.put("id-"+ d.getId(), d);
        
        logger.info("hashMap size "+ hashMap.size());
        
  	  // mm.put(key, value);
		   _map.put("metron.config.cfg", "/etc/metron");
		   _map.put("metron.config.dir", "/metron/work");
		   _map.put("metron.config.tmp", "/metron/tmp");
		   _map.put("metron.config.home", "/metron/home");

        
		   logger.info("map size "+ _map.size());
        
    }
    


}
