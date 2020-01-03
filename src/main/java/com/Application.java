package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mapper")
@SpringBootApplication
//@MapperScan("com.mapper")
public class Application {
    /**
     * SpringBoot启动类
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
