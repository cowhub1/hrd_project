package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Login;

@Repository
public interface  LoginRepository extends JpaRepository<Login,String> {
  
}
