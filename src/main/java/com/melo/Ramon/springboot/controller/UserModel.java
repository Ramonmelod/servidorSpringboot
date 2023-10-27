package com.melo.Ramon.springboot.controller;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_Users")

public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(unique = true)  // não permite que usuários com o mesmo nome sejam criados
    private String name;
    private String userName;
    private String PassWord;

    @CreationTimestamp
    private LocalDateTime createdAt;

   



}
