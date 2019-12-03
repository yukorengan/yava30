package com.verzinen.polbeng.bean;

import com.verzinen.polbeng.ejb.UserDAO;
import com.verzinen.polbeng.ejb.UserRestDAO;
import com.verzinen.polbeng.model.UserBean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;


@ManagedBean(name="userRestView")
@ViewScoped
public class UserRestView implements Serializable {
	static final long serialVersionUID = 12345238911l;

    private List<UserBean> user;
     
    @ManagedProperty("#{userRestService}")
    private UserRestDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		user = service.getRestUser();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public List<UserBean> getUser() {
        return user;
    }
 
    public void setService(UserRestDAO service) {
        this.service = service;
    }
}