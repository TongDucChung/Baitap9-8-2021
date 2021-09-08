package com.example.demo.service;

import com.example.demo.models.NhanVien;

import java.util.List;

public interface INhanVienService {
    List<NhanVien> findAll();

    NhanVien findById(long id);

    NhanVien saveNV(NhanVien nhanVien);

    void deleteNV(NhanVien nhanVien);

}
