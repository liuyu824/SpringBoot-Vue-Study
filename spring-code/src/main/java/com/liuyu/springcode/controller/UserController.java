package com.liuyu.springcode.controller;

import com.liuyu.springcode.pojo.User;
import com.liuyu.springcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    public User findById(Integer id){
        return userService.findById(id);
    }

}
