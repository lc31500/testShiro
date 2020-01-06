package com.service.impl;

import com.domain.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public User findByName(String name) {
        return userMapper.findByUsername(name);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
