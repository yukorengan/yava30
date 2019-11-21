package com.verdin.jsf.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.annotation.PostConstruct;



@ManagedBean
@ViewScoped
public class DynaContentBean implements Serializable {
	private static final long serialVersionUID = 20120967L;

     private String page;

     @PostConstruct
     public void init() {
         page = "includes/include1"; //  Default include.
     }

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

     // +getter+setter.
     
 }