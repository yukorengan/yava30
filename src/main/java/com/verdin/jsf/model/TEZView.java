package com.verdin.jsf.model;

import com.verdin.jsf.ejb.HadoopMetricDAO;
import com.verdin.jsf.ejb.TEZDAO;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;


@ManagedBean(name="tezView")
@ViewScoped
public class TEZView implements Serializable {
	static final long serialVersionUID = 123456232511l;

    private TEZConfig TEZConfig;
     
    @ManagedProperty("#{tezService}")
    private TEZDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		TEZConfig = service.getTEZConfig();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public TEZConfig getTEZConfig() {
        return TEZConfig;
    }
 
    public void setService(TEZDAO service) {
        this.service = service;
    }
}