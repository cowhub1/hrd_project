package com.example.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
  @GetMapping("/signup")
  // http://localhost:8080/auth/join
  public String signup() {
    
    return "auth/signup";
  }
  
   @GetMapping("/login")
  // http://localhost:8080/auth/join
  public String login() {
    
    return "auth/login";
  }

}
