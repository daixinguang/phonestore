package com.phonestore.user.service;

import com.phomestore.user.pojo.User;
import com.phonestore.user.mapper.UserMapper;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

class UserServiceTest {
    @Autowired
    UserMapper userMapper;
    @Test
    void demo() {
        User user = new User();
        user.setUsername("zs");
        System.out.println(user);
        User user1 = userMapper.selectOne(user);
        if (user1 == null) {
            System.out.println("null");
        } else {
            System.out.println(user1);
        }
    }

    @Test
    void demo2() {
        System.out.println("123");
    }
    @Test
    void demo3(){
        User user = new User();
        user.setId((long) 2);
        user.setUsername("ls");
        user.setPassword("123456");
        user.setCreated(new Date());
        userMapper.insert(user);
    }
}