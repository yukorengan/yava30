package com.verzinen.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "sembako")
public class Sembako {
    static final long serialVersionUID = 1998l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "jenis")
    private String jenis;

    @Column(name = "harga")
    private int harga;

    @Column(name = "stok")
    private int stok;

    public Sembako() {
    }

    public Sembako(String jenis, int harga, int stok) {
        this.jenis = jenis;
        this.harga = harga;
        this.stok = stok;
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

    @Override
    public String toString() {
        return "Sembako{" +
                "id=" + id +
                ", jenis='" + jenis + '\'' +
                ", harga=" + harga +
                ", stok=" + stok +
                '}';
    }
}
