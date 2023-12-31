package com.ezequiel.springboot.pruebas.springbootwebapps.controllers;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezequiel.springboot.pruebas.springbootwebapps.models.User;
import com.ezequiel.springboot.pruebas.springbootwebapps.models.dto.UserDto;

@RestController
@RequestMapping("/api")
    public class UserRestController {
    @GetMapping("/details")
    public UserDto details(){

        UserDto userDto = new UserDto();
        User user = new User("Juan", "Guzman");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        return userDto;
    }

    @GetMapping("/list")
     public List<User> list(){
        User user1 = new User("Juan", "Guzman");
        User user2 = new User("Andres", "Aquino");
        User user3 = new User("Tito", "West");
        //Forma mas limpia de agregar elemento a una lista
        List<User> users = Arrays.asList(user1,user2,user3);
        /*List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        */
        return users;
    }
  

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        Map<String, Object> body = new HashMap<>();
        User user = new User("Juan", "Guzman");
        body.put("title", "Hola Mundo Spring Boot");
        body.put("User: ", user);
        return body;
    }

   
}
