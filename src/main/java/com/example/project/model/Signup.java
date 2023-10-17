package com.example.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Signup {
  @Id
  int num;
  String id;
  String pwd;
  String name;
  String email;
  String phone;
  Date creDate;
}
