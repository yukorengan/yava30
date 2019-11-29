package com.verzinen.polbeng.bean;

import com.verzinen.polbeng.ejb.UserDAO;
import com.verzinen.polbeng.model.UserBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;


@ManagedBean(name="userView")
@ViewScoped
public class UserView implements Serializable {
	static final long serialVersionUID = 12345678911l;

    private List<UserBean> user;
     
    @ManagedProperty("#{userService}")
    private UserDAO service;
 
    @PostConstruct
    public void init() {
    	try {
    		user = service.getUser();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public List<UserBean> getUser() {
        return user;
    }
 
    public void setService(UserDAO service) {
        this.service = service;
    }
}