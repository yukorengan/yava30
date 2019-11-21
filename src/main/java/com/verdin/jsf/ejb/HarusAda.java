package com.verdin.jsf.ejb;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.apache.hadoop.security.UserGroupInformation;

@Named
@ApplicationScoped
public class HarusAda implements Serializable {
	static final long serialVersionUID = 122399l;
	static boolean initialized = false;

	@PostConstruct
    public void initialize() {
		System.out.println("invoke PostConstruct/initialize, REGISTERING user hbase");
		
		if (initialized) return;
		
		try {
			
			UserGroupInformation.setLoginUser(UserGroupInformation.createRemoteUser("hbase"));
			//UserGroupInformation.setLoginUser(UserGroupInformation.createRemoteUser("vyxx"))
			initialized = true;
			
			UserGroupInformation ur = UserGroupInformation.getCurrentUser();
			UserGroupInformation lo = UserGroupInformation.getLoginUser();
			
			System.out.println("CurrentUser: "+ ur);
			System.out.println("LoginUser: "+ lo);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("invoked initialize, REGISTERING done");
	}
	
	@PreDestroy
    public void shutdown() {
		System.out.println("invoke @PreDestroy");
	}

}
