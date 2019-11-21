package com.verdin.jsf.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BerasResponse {
    @SerializedName("hasil")
    private List<Beras> hasil;

    public List<Beras> getHasil() {
        return hasil;
    }

    public void setHasil(List<Beras> hasil) {
        this.hasil = hasil;
    }
}
