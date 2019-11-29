package com.verzinen.polbeng.bean;

import com.verzinen.polbeng.ejb.HadoopMetricDAO;
import com.verzinen.polbeng.model.HadoopMetric;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;


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