package com.verdin.jsf.showcase;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;

import com.login.SessionUtils;

@ManagedBean
@SessionScoped
public class TabViewManagedBean {
	private int index = 0;
	
    static Logger logger = Logger.getLogger(TabViewManagedBean.class);

	
	public int getIndex() {
		logger.info("index "+ index);
		
		return index;
	}

	public void setIndex(int index) {
		logger.info("set index "+ index);
		
		this.index = index;
	}
	public String Logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
		return "index";
	}
}
