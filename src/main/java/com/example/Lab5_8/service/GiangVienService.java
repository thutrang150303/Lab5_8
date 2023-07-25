package com.example.Lab5_8.service;



import com.example.Lab5_8.entity.GiangVien;

import java.util.List;

public interface GiangVienService {

    List<GiangVien> getAll();

    void addgiangVien(GiangVien giangVien);

    void remove(String ma);

    void update(GiangVien giangVien, String ma);

    GiangVien detail(String ma);


}
