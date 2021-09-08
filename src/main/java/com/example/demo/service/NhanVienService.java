package com.example.demo.service;

import com.example.demo.models.NhanVien;
import com.example.demo.repository.INhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanVienService implements INhanVienService{
    @Autowired
    INhanVienRepository iNhanVienRepository;
    @Override
    public List<NhanVien> findAll() {
        return (List<NhanVien>) iNhanVienRepository.findAll();
    }

    @Override
    public NhanVien findById(long id) {
        return (NhanVien) iNhanVienRepository.findById(id).get();
    }

    @Override
    public NhanVien saveNV(NhanVien nhanVien) {
        return (NhanVien) iNhanVienRepository.save(nhanVien);
    }

    @Override
    public void deleteNV(NhanVien nhanVien) {
        iNhanVienRepository.delete(nhanVien);
    }
}
