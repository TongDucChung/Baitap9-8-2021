package com.example.demo.service;

import com.example.demo.models.NhanVien;
import com.example.demo.models.PhongBan;

import java.util.List;

public interface IPhongBanService {
    List<PhongBan> findAll();

    PhongBan findById(long id);



}
