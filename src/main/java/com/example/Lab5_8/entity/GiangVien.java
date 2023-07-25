package com.example.Lab5_8.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "giang_vien")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class GiangVien {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "tuoi")
    private int tuoi;

    @Column(name = "gioi_tinh")
    private boolean gioiTinh;

    @Column(name = "dia_chi")
    private String diaChi;

}
