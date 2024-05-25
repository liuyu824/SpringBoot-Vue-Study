package com.liuyu.springcode.service.impl;

import com.liuyu.springcode.mapper.UserMapper;
import com.liuyu.springcode.pojo.User;
import com.liuyu.springcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServeImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}
