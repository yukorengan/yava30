package com.verdin.jsf.bean;

import com.verdin.jsf.ejb.LoginDAO;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class Login {
    private static final long serialVersionUID = 1434386363L;

    private String pwd;
    private String msg;
    private String user;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    //validate login
    public String validateUsernamePassword() {
        try {
            boolean valid = LoginDAO.validate(user, pwd);
            if (valid) {
                HttpSession session = SessionUtils.getSession();
                session.setAttribute("username", user);
                return "admin";
            } else {
                FacesContext.getCurrentInstance().addMessage(
                        null,
                        new FacesMessage(FacesMessage.SEVERITY_WARN,
                                "Incorrect Username and Passowrd",
                                "Please enter correct username and Password"));
                return "login";
            }
        } catch (Exception ex) {
            System.out.println("Login error -->" + ex.getMessage());
            return "login";
        }
        
    }

    //logout event, invalidate session
    public String logout() {
        HttpSession session = SessionUtils.getSession();
        session.invalidate();
        //externalContext.redirect("login.xhtml");
        return "login";
    }
}
