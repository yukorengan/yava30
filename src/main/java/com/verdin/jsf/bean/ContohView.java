package com.verdin.jsf.bean;

import java.io.Serializable;
//import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.jboss.logging.Logger;

import com.verdin.jsf.model.Konfigurasi;
import com.verdin.jsf.model.Param;

@Named
@ViewScoped
public class ContohView implements Serializable {
	
	static final long serialVersionUID = 1223l;
	
	static Logger logger = Logger.getLogger(ContohView.class);
	
	private ContohFactory fac = ContohFactory.getInstance();
	
	Konfigurasi konf ;
	
	String _type;
	Integer _version;
		
	@PostConstruct
	public  void init() {
		
		try { 
		logger.info("PostConstruct ... init() ... ");
		
		konf = fac._current_konfig2.get(0);
		
		_type = konf.getType();
		_version = konf.getVersion();
		
		logger.info("PostConstruct ... init() ... done");
		
	}  catch (Exception e) {
		logger.error(e);
	}
			 		 		
	}
	
	public String   getType() {
	   	
	   	   return konf.getType();
	    	   
		}
	
	public Integer   getVersion() {
	   	
	   	   return konf.getVersion();
	    	   
		}
	
	
	public void setType(String type ) {
		this._type = type;
	}
	
	public void setVersion(String version ) {
		this._version = Integer.parseInt(version) ;
	}
	
	
	public void   saveAction() {
	   	
		logger.info("save() ... invoked");
		
		saveKonfigurasi();
		
	}
	
	  public void doSomeLogic4() {
	    	logger.info("doSomeLogic4() ... map size "+ getProperties("metron").size());
	    	
	    	for (Map.Entry <String,Object> e: getProperties("metron").entrySet()) {
	    		logger.info("doSomeLogic4() ... "+ e.getKey() +" : "+  e.getValue());
	    	}
	    	
	    }
	  
	 public void doSomeLogic5() {
	    	logger.info("doSomeLogic5() ... params size "+ fac._params.size());
	    	
	    	for (Param e: fac._params) {
	    		logger.info("doSomeLogic5() ... "+ e.getKey() +" : "+  e.getValue());
	    	}
	    }
	 
	 public void doSomeCurrent() {
	    	logger.info("doSomeCurrent() ... params size "+ fac._params.size());
	    	
	    	for (Param e: fac._params) {
	    		logger.info("doSomeCurrent() ... "+ e.getKey() +" : "+  e.getValue());
	    	}
	    }
	 
	 public void doSomeHive() {
	    	logger.info("doSomeHive() ... params size "+ fac._params.size());
	    	
	    	for (Param e: fac._params) {
	    		logger.info("doSomeHive() ... "+ e.getKey() +" : "+  e.getValue());
	    	}
	    }
	 
	 public void doSomeMetronMap() {
	    	logger.info("doSomeMetronMap() ... params size "+ fac._params.size());
	    	
	    	for (Param e: fac._params) {
	    		logger.info("doSomeMetronMap() ... "+ e.getKey() +" : "+  e.getValue());
	    	}
	    }
	 
	 public void doSomeMetronList() {
	    	logger.info("doSomeMetronList() ... params size "+ fac._params.size());
	    	
	    	//fac.doSomeStuff();
	    	
	    	Konfigurasi c = getKonfigurasiByType("metron");
	    	
	    	logger.info("Type : "+  c.getType());
	    	logger.info("Version : "+  c.getVersion());

	    	for (Map.Entry <String,Object> e: c.get_Properties().entrySet()) {
	    		logger.info("MetronList ... "+ e.getKey() +" : "+  e.getValue());
	    	}
	    }
	 
	
	public List<Param> getMetronParams() {
	
		logger.info("getMetronParams() ...");
		
		return fac._params;
	}
	
	
	
   public void setMetronParams (List<Param> params) {
		
		//this._map = map;
		logger.info("setMap() ...");
	}
	
	public Map<String, Object >  getProperties() {
	   	
		logger.info("getProperties current ... ");
		
		
		
	   	   return konf.get_Properties();
		}
	
	
	public  Map<String, Object >  getProperties(String type) {
		
		logger.info("getProperties ByType ... "+ type);
		
		return getKonfigurasiByType(type).get_Properties();
	 }
	
	private  Konfigurasi  getKonfigurasiByType(String _type) {
	   
		//logger.info("getKonfigurasiByType ... "+  _type);
		
	   Konfigurasi c  = fac._current_konfig2.stream()
				 .filter(e -> _type.equalsIgnoreCase(e.getType()))
	   			 .findAny()
	   			 .orElse(null);
	   
	   logger.info("Konfigurasi version ... "+  c.getType() +" "+ c.getVersion());
	   
		return c;
	}
	
	private void saveKonfigurasi() {
		
		Konfigurasi c = getKonfigurasiByType("metron");
		
		//Integer _version = c.getVersion();
		c.setVersion(c.getVersion() + 1);
		
		for (Param e: fac._params) {
    		logger.info("saveAction() ... "+ e.getKey() +" : "+  e.getValue());
    		
    		 getProperties("metron").put(e.getKey(), e.getValue());
    		 
    	}
		
		
	}
	
	
	
  
	
}
