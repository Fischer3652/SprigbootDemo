package com.xiangxue.jack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.xiangxue.jack")
public class SpringbootDemo {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo.class, args);
        System.out.println("hello world");

    }

}
