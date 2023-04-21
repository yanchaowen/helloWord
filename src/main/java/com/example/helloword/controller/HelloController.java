package com.example.helloword.controller;

import com.example.helloword.JdbcConfig;
import com.example.helloword.User;
import com.example.helloword.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//@Controller
@RestController
public class HelloController {
  //  @ResponseBody
    @Autowired
    JdbcConfig jdbcConfig;
    @Resource
    private userMapper usermapper;
    @RequestMapping("/hello")
    public User hello() {
        System.out.println("dataSource:"+jdbcConfig.dataSource());
        System.out.println(usermapper.findById(1));
        //return "Hello World,my first springboot project!111222333";
        //return  jdbcConfig.toString();
        return usermapper.findById(2);
    }
}
