package com.verdin.jsf.bean;



import java.io.Serializable;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
//import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.CellEditEvent;

import com.verdin.jsf.ejb.TestFactory;
import com.verdin.jsf.model.Param;

import org.jboss.logging.Logger;


@ManagedBean(name="testBean")
@ViewScoped
public class TestBean implements Serializable {
	
	static final long serialVersionUID = 122391l;

	static Logger logger = Logger.getLogger(TestBean.class);
	
	private static long  _index = 10000l;
	
    private List<String> stringCollection;
    
    private String _string = "string";
     
    private DataTable  dataTable;
     
    private DataTable artikelTable;
    
   // private List<Artikel> items =  new ArrayList<Artikel>();
     
    private DataTable hashmapTable;
    
    //private Map<String,Artikel> hashMap = new HashMap<String,Artikel>();
    
    private List<Param> _params;
    
   // private Map<String,Object> _map2 = new HashMap<String,Object>();
    
    private TestFactory fac = TestFactory.getInstance();
    
    @PostConstruct
    public void init() {
    	
        logger.info("Post Construct fired!!");
        
        stringCollection = new ArrayList<String>();
        stringCollection.add("ranger");
        stringCollection.add("knoxx");
        stringCollection.add("kerberos");
        
        
        getParamList() ;
        
    }
 
    public String getString() {
    	return _string;
    }
    
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
     
    public List<String> getStringCollection() {
    	
    	logger.info("getStringCollection() ... " + stringCollection.size());
    	
        return stringCollection;
    }

    public void setStringCollection(List<String> stringCollection) {
        this.stringCollection = stringCollection;
        
        logger.info("setStringCollection() ... "+ stringCollection.size());
    }
 
    public void addRow() {
        // dao.create(item);
        // Actually, the DAO should already have set the ID from DB. This is just for demo.
    	
    	logger.info("before string = "+ _string);
    	
    	stringCollection.add(_string);
        
    	_string = "string";
      
    	fac.items.add(new Artikel(_index++, "string"));
    	
        
    	logger.info("reset id = "+ _string);

    }
    
    
    public void doSomeLogic() {
    	logger.info("doSomeLogic() ... "+ stringCollection.size());
    }
    
    public void doSomeLogic2() {
    	logger.info("doSomeLogic2() ... items size "+ fac.items.size());
    	
    	for (Artikel ar: fac.items) {
    		logger.info("doSomeLogic2() ... "+ ar);
    	}
    	
    }
    
    public void doSomeLogic3() {
    	logger.info("doSomeLogic3() ... map size "+ fac._map.size());
    	
    	for (Entry <String,String> e: fac._map.entrySet()) {
    		logger.info("doSomeLogic3() ... "+ e.getKey() +" : "+  e.getValue());
    	}
    	
    }
    
    public void doSomeLogic4() {
    	logger.info("doSomeLogic4() ... map size "+ fac.hashMap.size());
    	
    	for (Entry <String,Artikel> e: fac.hashMap.entrySet()) {
    		logger.info("doSomeLogic4() ... "+ e.getKey() +" : "+  e.getValue());
    	}
    	
    }
    public void doSomeLogic5() {
    	logger.info("doSomeLogic5() ... params size "+ _params.size());
    	
    	for (Param e: _params) {
    		logger.info("doSomeLogic5() ... "+ e.getKey() +" : "+  e.getValue());
    	}
    	
    }
    
    
    // bs != null ? f.format(bs) : ""
    public DataTable getHashmapTable() {
    	logger.info("getHashmapTable() ... " + 
    			hashmapTable == null ? hashmapTable.getRowCount() : "null");
    	
        return hashmapTable;
    }

    public void setHashmapTable(DataTable hashmapTable) {
    	
        this.hashmapTable = hashmapTable;
        
        logger.info("setHashmapTable() ... "+ hashmapTable.getAriaRowLabel()  +" "+ hashmapTable.getRows());
    }

    public void actionSave(String item) {
    	
    	//stringCollection.add(item);
    	
    //	add();
    	
    	
        logger.info("Clicked!! "+ item);

    }
    
    public void action() {
    	
        logger.info("Clicked!!");

    }
    
    public void addAction() {
  
        fac.items.add(new Artikel(_index++, "new label"));
        
        logger.info("addAction() ... "+ fac.items.size());
        
    }
    
    public void removeAction(Artikel item) {
        fac.items.remove(item);
        
        logger.info("removeAction items: " + item);
    }

    public void saveAction() {
    	 logger.info("saveAction items: " + fac.items);
    	 
    	///items.remove(0);
    	
    	/// logger.info("saveAction items: " + items);
    }

    
    
    public DataTable getArtikelTable() {
		logger.info("getArtikelTable() ...");

		return artikelTable;
	}

	public void setArtikelTable(DataTable artikelTable) {
		this.artikelTable = artikelTable;
		logger.info("setArtikelTable() ...");

	}

	public List<Artikel> getItems() {
		logger.info("getItems() ... " + fac.items.size());
		return fac.items;
	}

	public void setItems(List<Artikel> items) {
		//this.items = items;
		logger.info("setItems() ... " + items.size());
	}
	
	public DataTable getDataTable() {
		
		logger.info("getDataTable() ...");
	    return dataTable;
	}

	public void setDataTable(DataTable dataTable) {
		
		logger.info("setDataTable() ...");
	    this.dataTable = dataTable;
	}
	    
	    
	
	public Map<String, Artikel> getHashMap() {
		
		logger.info("getHashMap() ... "+ fac.hashMap.size());
		
		return fac.hashMap;
		
	}

	public void setHashMap(Map<String, Artikel> hashMap) {
		//this.hashMap = hashMap;
		logger.info("setHashMap() ...");
	}

	
	/*
	 * HashMap<String, BigDecimal> myHashMap;
	 * 
public List<Entry<String, BigDecimal>> getMyHashMapEntryList() {
       return new ArrayList(myHashMap.entrySet());
}
<p:dataTable value="#{yourBean.myHashMapEntryList}" var="myEntry">
             in here reference as: #{myEntry.key} #{myEntry.value}
</p:dataTable>
	 * 
	 */
  //  public Map<String, Object> getMap() {
    	
	
	
	
	public List<Param> getParams() {
		
		logger.info("getMap() ... "+ _params.size());
		
		return _params;
		
	}
    
   // public void setMap(Map<String, String> map) {
	public void setParams(List<Param> params) {
	
		//this._map = map;
		logger.info("setMap() ...");
	}
	
	private void getParamList() {
		
		logger.info("getMap() ... "+ fac._map.size());
		
		_params =  new ArrayList<Param>();
		
		for (Entry <String,String> e: fac._map.entrySet()) {
			
			_params.add(new Param(e.getKey(),e.getValue()));
			
    	}
		
		
	}
	
	
	
	
    
}