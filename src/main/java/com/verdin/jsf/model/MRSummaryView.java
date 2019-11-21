package com.verdin.jsf.model;

import com.verdin.jsf.ejb.MRSummaryDAO;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;


@ManagedBean(name="mrSummaryView")
@ViewScoped
public class MRSummaryView implements Serializable {
    static final long serialVersionUID = 123443435511l;

    private MRSummary summaryInfo;
     
    @ManagedProperty("#{mrSummaryService}")
    private MRSummaryDAO service;
 
    @PostConstruct
    public void init() {
        try {
            summaryInfo = service.getMRSummary();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    public MRSummary getSummaryInfo() {
        return summaryInfo;
    }
 
    public void setService(MRSummaryDAO service) {
        this.service = service;
    }
}