package com.verdin.jsf.model;

import com.verdin.jsf.ejb.TEZSummaryDAO;
import com.verdin.jsf.ejb.YARNSummaryDAO;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;


@ManagedBean(name="yarnSummaryView")
@ViewScoped
public class YARNSummaryView implements Serializable {
	static final long serialVersionUID = 12345334511l;

    private YARNSummary summaryInfo;
     
    @ManagedProperty("#{yarnSummaryService}")
    private YARNSummaryDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		summaryInfo = service.getYARNSummary();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public YARNSummary getSummaryInfo() {
        return summaryInfo;
    }
 
    public void setService(YARNSummaryDAO service) {
        this.service = service;
    }
}