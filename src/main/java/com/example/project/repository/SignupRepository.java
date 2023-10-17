package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Signup;

@Repository
public interface  SignupRepository extends JpaRepository<Signup, Integer> {
  
}

