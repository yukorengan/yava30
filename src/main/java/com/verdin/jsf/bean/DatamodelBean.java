package com.verdin.jsf.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.jboss.logging.Logger;

/*
 * Really simple CRUD
*/

//@ManagedBean
//@ViewScoped

@Named
@ViewScoped
public class DatamodelBean implements Serializable {
	
	static final long serialVersionUID = 122388l;
	static Logger logger = Logger.getLogger(DatamodelBean.class);
	
	
    private List<Artikel> list;
    private transient DataModel<Artikel> model;
    private Artikel item = new Artikel();
    private boolean edit;

    @PostConstruct
    public void init() {
        // list = dao.list();
        // Actually, you should retrieve the list from DAO. This is just for demo.
    	
    	item.setId(serialVersionUID);
    	
        list = new ArrayList<Artikel>();
        list.add(new Artikel(1L, "item1"));
        list.add(new Artikel(2L, "item2"));
        list.add(new Artikel(3L, "item3"));
    }
    
    public void add() {
        // dao.create(item);
        // Actually, the DAO should already have set the ID from DB. This is just for demo.
    	logger.info("before setID id = "+ item.getId());
        item.setId(list.isEmpty() ? 1 : list.get(list.size() - 1).getId() + 1);
        list.add(item);
        
        logger.info("added id = "+ item.getId());
        item = new Artikel(); // Reset placeholder.
        item.setId(serialVersionUID);
    	logger.info("reset id = "+ item.getId());

    }

    public void edit() {
    	
    	logger.info("edit ...");
    	
        item = model.getRowData();
        
        edit = true;
        logger.info("edit ... true "+ item.getId() +" "+ item.getValue());
    }

    public void save() {
    	
    	logger.info("save ...");
        // dao.update(item);
        item = new Artikel(); // Reset placeholder.
        item.setId(serialVersionUID);
        
         
        edit = false;
        
        logger.info("save ... edit false, reset id "+ item.getId());
    }

    public void delete() {
        // dao.delete(item);
        list.remove(model.getRowData());
    }

    public List<Artikel> getList() {
        return list;
    }

    public DataModel<Artikel> getModel() {
        if (model == null) {
            model = new ListDataModel<Artikel>(list);
        }

        return model;
    }

    public Artikel getItem() {
        return item;
    }

    public boolean isEdit() {
    	
    	 logger.info("isEdit  ... edit "+ edit);
    	 
        return edit;
    }

    // Other getters/setters are actually unnecessary. Feel free to add them though.

}