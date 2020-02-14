package com.xiangxue.jack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping(value = "/user/queryUser",method = RequestMethod.GET)
    public String queryUser(@RequestParam String userName){
        System.out.println("queryUser");
        System.out.println("queryUser2++++++++++++++++++++++++++++");
        return userName;
    }
}
