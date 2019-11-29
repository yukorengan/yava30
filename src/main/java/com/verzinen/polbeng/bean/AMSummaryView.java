package com.verzinen.polbeng.bean;

import com.verzinen.polbeng.ejb.AMSummaryDAO;
import com.verzinen.polbeng.model.AMSummary;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;


@ManagedBean(name="amSummaryView")
@ViewScoped
public class AMSummaryView implements Serializable {
    static final long serialVersionUID = 123453435511l;

    private AMSummary summaryInfo;
     
    @ManagedProperty("#{amSummaryService}")
    private AMSummaryDAO service;
 
    @PostConstruct
    public void init() {
        try {
            summaryInfo = service.getAMSummary();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    public AMSummary getSummaryInfo() {
        return summaryInfo;
    }
 
    public void setService(AMSummaryDAO service) {
        this.service = service;
    }
}