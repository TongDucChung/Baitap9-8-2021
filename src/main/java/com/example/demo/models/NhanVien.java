package com.example.demo.models;

import javax.persistence.*;

@Entity
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tenNv;
    private int tuoiNv;
    private String maNv;
    private int luongNv;

    @ManyToOne
    private PhongBan phongBan;

    public NhanVien() {
    }

    public NhanVien(long id, String tenNv, int tuoiNv, String maNv, int luongNv, PhongBan phongBan) {
        this.id = id;
        this.tenNv = tenNv;
        this.tuoiNv = tuoiNv;
        this.maNv = maNv;
        this.luongNv = luongNv;
        this.phongBan = phongBan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public int getTuoiNv() {
        return tuoiNv;
    }

    public void setTuoiNv(int tuoiNv) {
        this.tuoiNv = tuoiNv;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public int getLuongNv() {
        return luongNv;
    }

    public void setLuongNv(int luongNv) {
        this.luongNv = luongNv;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }
}
