package com.verdin.jsf.bean;

import com.verdin.jsf.ejb.SembakoDA;
import com.verdin.jsf.ejb.SembakoDAO;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class SembakoBean {

    private int id;
    private String jenis;
    private int harga;
    private int stok;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // Method To Add New Sembako To The Database
    public String saveSembako(SembakoBean sembakoBean) {
        addMessage("Welcome to Primefaces!!");
        return SembakoDA.save(sembakoBean);
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
