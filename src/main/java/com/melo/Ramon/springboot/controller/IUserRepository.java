package com.melo.Ramon.springboot.controller;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;



public interface IUserRepository extends JpaRepository<UserModel,UUID>{
   UserModel findByUserName(String userName);
    
}
