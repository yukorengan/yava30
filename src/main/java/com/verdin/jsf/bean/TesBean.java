package com.verdin.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.jboss.logging.Logger;


@ManagedBean(name="tesBean")
@ViewScoped
public class TesBean implements Serializable {

	static final long serialVersionUID = 122399l;

	static Logger logger = Logger.getLogger(TesBean.class);

    private List<String> listItems;

    public List<String> getListItems() {
        return listItems;
    }

    public void setListItems(List<String> listItems) {
        this.listItems = listItems;
    }

    public TesBean() {

    }

    @PostConstruct
    public void init() {
    	
        logger.info("Post Construct fired!");
        
        listItems = new ArrayList<String>();
        listItems.add("Mango");
        listItems.add("Apple");
        listItems.add("Banana");
    }

    public void actionListener(){
    	
       logger.info("Action Listener fired!");
    }

}