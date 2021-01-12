package com.phonestore.user.service;

import com.phomestore.user.pojo.User;
import com.phonestore.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void demo() {
        User user = new User();
        user.setId((long) 1);
        List<User> users = userMapper.select(user);

    }

    public User queryUserByUserNameAndPassword(String username, String password) {
        User record = new User();
        record.setUsername(username);
        record.setPassword(password);
        User user = userMapper.selectOne(record);
        System.out.println(user);
        return user;
    }
}
