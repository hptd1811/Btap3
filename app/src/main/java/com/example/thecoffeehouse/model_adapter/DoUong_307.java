package com.example.thecoffeehouse.model_adapter;

import android.widget.ImageView;

import java.io.Serializable;

public class DoUong_307 implements Serializable {
    private int hinh_307;
    private String ten_307;
    private String gia_307;

    public int getHinh() {
        return hinh_307;
    }

    public ImageView setHinh(int hinh_307) {
        this.hinh_307 = hinh_307;
        return null;
    }

    public String getTen() {
        return ten_307;
    }

    public void setTen(String ten) {
        this.ten_307 = ten_307;
    }

    public String getGia() {
        return gia_307;
    }

    public void setGia(String gia) {
        this.gia_307 = gia_307;
    }

    public DoUong_307(int hinh_307, String ten_307, String gia_307) {
        this.hinh_307 = hinh_307;
        this.ten_307 = ten_307;
        this.gia_307= gia_307;
    }

    public DoUong_307() {
    }
}
