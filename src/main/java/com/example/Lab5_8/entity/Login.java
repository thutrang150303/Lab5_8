package com.example.Lab5_8.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "login")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Login {

    @Id
    @Column(name = "username")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String userName;

    @Column(name = "password")
    private String passWord;


}
