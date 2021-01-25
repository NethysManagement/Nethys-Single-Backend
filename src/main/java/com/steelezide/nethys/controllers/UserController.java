package com.steelezide.nethys.controllers;

import com.steelezide.nethys.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dtos.UserDto;

@RestController
@RequestMapping("user")
public class UserController {
    
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("sign-in")
    public void userSignIn(@RequestBody UserDto userDto){

    }
    
    @PostMapping("create")
    public void createUser(@RequestBody UserDto userDto){

    }

    @PutMapping
    public void updateUser(@RequestBody UserDto userDto){

    }

    @DeleteMapping
    public void deleteUser(@RequestBody UserDto userDto){

    }

    
}
