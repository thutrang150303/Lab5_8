package com.example.Lab5_8.controller;


import com.example.Lab5_8.entity.GiangVien;
import com.example.Lab5_8.repository.GiangVienRepository;
import com.example.Lab5_8.service.GiangVienService;
import com.example.Lab5_8.service.impl.GiangVienServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "GiangVienServlet", value = {
        "/giang-vien/add",
        "/giang-vien/update",
        "/giang-vien/delete",
        "/giang-vien/view-update",
        "/giang-vien/hien-thi",
        "/giang-vien/search",
        "/giang-vien/view-add",
})
public class GiangVienServlet extends HttpServlet {

    private GiangVienRepository giangVienRepository = new GiangVienRepository();
    private GiangVienService giangVienService = new GiangVienServiceImpl();
    private List<GiangVien> lisGiangVien = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")) {
            this.hienThi(request, response);
        } else if (uri.contains("view-update")) {
            this.viewUpdate(request, response);
        } else if (uri.contains("view-add")) {
            this.viewAdd(request, response);
        } else if (uri.contains("delete")) {
            this.delete(request, response);
        } else if (uri.contains("search")) {
            this.search(request, response);
        } else {
            this.hienThi(request, response);
        }

    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewAdd(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void hienThi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("giangViens", this.giangVienRepository.getAll());
        request.getRequestDispatcher("/btvn/giang-vien.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("add")) {
            this.add(request, response);
        } else if (uri.contains("update")) {
            this.update(request, response);
        } else {
            this.hienThi(request, response);
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
    }

    private void add(HttpServletRequest request, HttpServletResponse response) {
    }
}
