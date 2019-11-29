package com.verzinen.polbeng.bean;

import com.verzinen.polbeng.ejb.HIVESummaryDAO;
import com.verzinen.polbeng.model.HIVESummary;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;


@ManagedBean(name="hiveSummaryView")
@ViewScoped
public class HIVESummaryView implements Serializable {
	static final long serialVersionUID = 12345334511l;

    private HIVESummary summaryInfo;
     
    @ManagedProperty("#{hiveSummaryService}")
    private HIVESummaryDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		summaryInfo = service.getHIVESummary();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public HIVESummary getSummaryInfo() {
        return summaryInfo;
    }
 
    public void setService(HIVESummaryDAO service) {
        this.service = service;
    }
}