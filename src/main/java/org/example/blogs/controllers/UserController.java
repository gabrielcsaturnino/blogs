package org.example.blogs.controllers;

import org.example.blogs.model.User;
import org.example.blogs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public User getUser(@RequestParam UUID uuid){
        User user = userService.findUser(uuid);
        if (user == null){
            System.out.printf("NULL");
        }
        return userService.findUser(uuid);
    }

}
