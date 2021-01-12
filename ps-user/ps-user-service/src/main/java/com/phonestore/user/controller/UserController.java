package com.phonestore.user.controller;

import com.phomestore.user.pojo.User;
import com.phonestore.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/")
    public String Hello(){
        userService.demo();
        return "HelloWord!";
    }
    @GetMapping("/query")
    public ResponseEntity<User> query(
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ){
        return ResponseEntity.ok(userService.queryUserByUserNameAndPassword(username,password));
    }
}
