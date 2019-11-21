package com.verdin.jsf.model;

import java.io.Serializable;

public class Sembako implements Serializable {
    static final long serialVersionUID = 12345641233l;

    private int id;
    private String jenis;
    private int harga;
    private int stok;

    public Sembako() {
    }

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
}
