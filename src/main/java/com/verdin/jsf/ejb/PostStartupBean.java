package com.verdin.jsf.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
@DependsOn("StartupBean")
public class PostStartupBean {

	
	@PostConstruct
	public void initialize() {
		// Here init your resources
		System.out.println("init ...");
	}
}