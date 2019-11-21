package com.verdin.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

@ApplicationScoped
@ManagedBean
public class ThemeManagedBean {
	
	 private String theme = "bluesky";
	 
	    public String getTheme() {
	        return theme;
	    }

	    public void setTheme(String thema) {
	        this.theme = thema;
	    }

	}