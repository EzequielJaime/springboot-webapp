package com.ezequiel.springboot.pruebas.springbootwebapps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ezequiel.springboot.pruebas.springbootwebapps.models.User;

@Controller
public class UserController {
   
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Juan", "Guzman");
        user.setEmail("ezequiel@gmail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }
  
}
