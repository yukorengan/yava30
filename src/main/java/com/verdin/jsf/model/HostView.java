package com.verdin.jsf.model;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.verdin.jsf.ejb.HostsDAO;

 
@ManagedBean(name="hostView")
@ViewScoped
public class HostView implements Serializable {
	static final long serialVersionUID = 12345678913l;

    private List<Host> hosts;
     
    @ManagedProperty("#{hostService}")
    private HostsDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		hosts = service.getHosts();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public List<Host> getHosts() {
        return hosts;
    }
 
    public void setService(HostsDAO service) {
        this.service = service;
    }
}