package com.example.kontak.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostPutDelKontak {
    @SerializedName("status")
    String status;

    @SerializedName("result")
    String result;

    Kontak kontak;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Kontak getKontak() {
        return kontak;
    }

    public void setKontak(Kontak kontak) {
        this.kontak = kontak;
    }
}
