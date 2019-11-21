package com.verdin.jsf.model;

import com.verdin.jsf.ejb.HadoopMetricDAO;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;


@ManagedBean(name="hadoopmetricView")
@ViewScoped
public class HadoopMetricView implements Serializable {
	static final long serialVersionUID = 12345674511l;

    private HadoopMetric hadoopMetric;
     
    @ManagedProperty("#{hadoopMetricService}")
    private HadoopMetricDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		hadoopMetric = service.getHadoopMetric();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public HadoopMetric getHadoopMetric() {
        return hadoopMetric;
    }
 
    public void setService(HadoopMetricDAO service) {
        this.service = service;
    }
}