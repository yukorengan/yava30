package com.verdin.jsf.model;

import com.verdin.jsf.ejb.SembakoDAO;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;


@ManagedBean(name="sembakoView")
@ViewScoped
public class SembakoView implements Serializable {
	static final long serialVersionUID = 12345678911l;

    private List<Sembako> sembako;
     
    @ManagedProperty("#{sembakoService}")
    private SembakoDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		sembako = service.getSembako();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public List<Sembako> getSembako() {
        return sembako;
    }
 
    public void setService(SembakoDAO service) {
        this.service = service;
    }
}