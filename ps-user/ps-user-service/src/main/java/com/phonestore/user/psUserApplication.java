package com.phonestore.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.phonestore.user.mapper")
public class psUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(psUserApplication.class, args);
    }
}
