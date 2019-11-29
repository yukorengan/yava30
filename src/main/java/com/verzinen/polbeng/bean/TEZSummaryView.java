package com.verzinen.polbeng.bean;

import com.verzinen.polbeng.ejb.TEZSummaryDAO;
import com.verzinen.polbeng.model.TEZSummary;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;


@ManagedBean(name="tezSummaryView")
@ViewScoped
public class TEZSummaryView implements Serializable {
	static final long serialVersionUID = 12345334511l;

    private TEZSummary summaryInfo;
     
    @ManagedProperty("#{tezSummaryService}")
    private TEZSummaryDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		summaryInfo = service.getTEZSummary();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public TEZSummary getSummaryInfo() {
        return summaryInfo;
    }
 
    public void setService(TEZSummaryDAO service) {
        this.service = service;
    }
}