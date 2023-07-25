package com.example.Lab5_8.service.impl;

import com.example.Lab5_8.entity.GiangVien;
import com.example.Lab5_8.repository.GiangVienRepository;
import com.example.Lab5_8.service.GiangVienService;

import java.util.ArrayList;
import java.util.List;

public class GiangVienServiceImpl implements GiangVienService {

    private GiangVienRepository giangVienRepository = new GiangVienRepository();
    private GiangVienService giangVienService = new GiangVienServiceImpl();
    private List<GiangVien> listgiangVien = new ArrayList<>();

    @Override
    public List<GiangVien> getAll() {
        return giangVienRepository.getAll();
    }

    @Override
    public void addgiangVien(GiangVien giangVien) {
        giangVienRepository.add(giangVien);

    }

    @Override
    public void remove(String ma) {
        for (GiangVien giangVien : listgiangVien) {
            if (giangVien.getMa().equalsIgnoreCase(ma)) {
                listgiangVien.remove(giangVien);
                break;
            }
        }
    }

    @Override
    public void update(GiangVien giangVien, String ma) {
        for (int i = 0; i < listgiangVien.size(); i++) {
            if (giangVien.getMa().equalsIgnoreCase(ma)) {
                listgiangVien.set(i, giangVien);
                break;
            }
        }
    }

    @Override
    public GiangVien detail(String ma) {
        for (GiangVien giangVien : listgiangVien) {
            if (giangVien.getMa().equalsIgnoreCase(ma)) {
                return giangVien;
            }
        }
        return null;
    }
}
