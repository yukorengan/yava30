package com.verdin.jsf.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Beras implements Serializable {
    @SerializedName("harga")
    private int harga;
    @SerializedName("tahun")
    private int tahun;

    public Beras() {

    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    @Override
    public String toString() {
        return "Beras{" +
                "harga=" + harga +
                ", tahun=" + tahun +
                '}';
    }
}
