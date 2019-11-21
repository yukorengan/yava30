package com.verdin.jsf.ejb;

import com.verdin.jsf.bean.PegawaiBean;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class PegawaiBacking implements Serializable {

    private List<PegawaiBean> paraPegawai;
    private PegawaiBean pegawai = new PegawaiBean();

    @Inject
    private PegawaiManager pegawaiManager;

    @PostConstruct
    public void init() {
        this.paraPegawai = pegawaiManager.loadAllPegawai();
    }

    public void delete(PegawaiBean pegawai) {
        pegawaiManager.delete(pegawai);
        paraPegawai.remove(pegawai);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Data dihapus!!"));
    }

    public void add() {
        pegawaiManager.addNewPegawai(pegawai);
        this.paraPegawai = pegawaiManager.loadAllPegawai();
        this.pegawai = new PegawaiBean();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Tambah Data Berhasil!!"));
    }

    public void update() {
        pegawaiManager.update(paraPegawai);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Update Berhasil!!"));
    }

    public List<PegawaiBean> getParaPegawai() {
        return paraPegawai;
    }

    public void setParaPegawai(List<PegawaiBean> paraPegawai) {
        this.paraPegawai = paraPegawai;
    }

    public PegawaiBean getPegawai() {
        return pegawai;
    }

    public void setPegawai(PegawaiBean pegawai) {
        this.pegawai = pegawai;
    }

    public PegawaiManager getPegawaiManager() {
        return pegawaiManager;
    }

    public void setPegawaiManager(PegawaiManager pegawaiManager) {
        this.pegawaiManager = pegawaiManager;
    }
}
