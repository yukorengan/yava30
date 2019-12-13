package com.verzinen.polbeng.bean;

import com.verzinen.polbeng.ejb.TEZConfigDAO;
import com.verzinen.polbeng.ejb.TEZSummaryDAO;
import com.verzinen.polbeng.model.TEZConfig;
import com.verzinen.polbeng.model.TEZSummary;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;


@ManagedBean(name="tezConfigView")
@ViewScoped
public class TEZConfigView implements Serializable {
	static final long serialVersionUID = 12345334511l;

    private TEZConfig tezConfig;
     
    @ManagedProperty("#{tezConfigService}")
    private TEZConfigDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		tezConfig = service.getTEZConfig();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public TEZConfig getTezConfig() {
        return tezConfig;
    }

    public String saveTezConfig() {
        return service.save(tezConfig);
    }
 
    public void setService(TEZConfigDAO service) {
        this.service = service;
    }
}