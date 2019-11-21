package com.verdin.jsf.model;

import com.verdin.jsf.ejb.ZKSummaryDAO;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;


@ManagedBean(name="zkSummaryView")
@ViewScoped
public class ZKSummaryView implements Serializable {
    static final long serialVersionUID = 123453435511l;

    private ZKSummary summaryInfo;
     
    @ManagedProperty("#{zkSummaryService}")
    private ZKSummaryDAO service;
 
    @PostConstruct
    public void init() {
        try {
            summaryInfo = service.getZKSummary();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    public ZKSummary getSummaryInfo() {
        return summaryInfo;
    }
 
    public void setService(ZKSummaryDAO service) {
        this.service = service;
    }
}