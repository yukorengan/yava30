package com.verzinen.polbeng.model;


import com.verzinen.polbeng.ejb.UserDA;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class UserBean {

    private int admin_id;
    private String user_name;
    private String password;
    private boolean active;
    private boolean admin;

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String saveUser(UserBean userBean) {
        addMessage("Data berhasil disimpan!!");
        return UserDA.save(userBean);
    }

    public String updateUser(UserBean userBean) {
        addMessage("Data berhasil disimpan!!");
        return UserDA.update(userBean);
    }

    public String deleteUser(int id)
    {
        addMessage("Data berhasil dihapus!!");
        return UserDA.delete(id);
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
