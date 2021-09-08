package com.example.demo.service;

import com.example.demo.models.PhongBan;
import com.example.demo.repository.IPhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhongBanService implements IPhongBanService{
@Autowired
    IPhongBanRepository iPhongBanRepository;
    @Override
    public List<PhongBan> findAll() {
        return (List<PhongBan>) iPhongBanRepository.findAll();
    }

    @Override
    public PhongBan findById(long id) {
        return iPhongBanRepository.findById(id).get();
    }
}
