package com.verzinen.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.jboss.logging.Logger;

@Named
@ViewScoped
public class PhoenixTest implements Serializable {
	
	static final long serialVersionUID = 1223l;
	static Logger logger = Logger.getLogger(PhoenixTest.class);

	@PostConstruct
	public  void init() {
		
		
		logger.info("PostConstruct ... init() ... ");
		
		
		logger.info("PostConstruct ... init() ... done");
	}

}
