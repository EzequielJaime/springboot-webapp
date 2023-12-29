package com.ezequiel.springboot.pruebas.springbootwebapps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
   
    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("name", "Ezequiel");
        model.addAttribute("lastName", "Jaime");
        return "details";
    }
  
}
