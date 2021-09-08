package com.example.demo.repository;

import com.example.demo.models.NhanVien;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface INhanVienRepository extends PagingAndSortingRepository<NhanVien,Long> {
}
