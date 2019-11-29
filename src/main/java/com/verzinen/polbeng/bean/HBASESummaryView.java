package com.verzinen.polbeng.bean;

import com.verzinen.polbeng.ejb.HBASESummaryDAO;
import com.verzinen.polbeng.model.HBASESummary;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;


@ManagedBean(name="hbaseSummaryView")
@ViewScoped
public class HBASESummaryView implements Serializable {
    static final long serialVersionUID = 123453444511l;

    private HBASESummary summaryInfo;
     
    @ManagedProperty("#{hbaseSummaryService}")
    private HBASESummaryDAO service;
 
    @PostConstruct
    public void init() {
        try {
            summaryInfo = service.getHBASESummary();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    public HBASESummary getSummaryInfo() {
        return summaryInfo;
    }
 
    public void setService(HBASESummaryDAO service) {
        this.service = service;
    }
}