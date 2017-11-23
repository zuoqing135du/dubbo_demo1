package com.example.demo.controller;

import com.zuioqing.base.service.LoginService;
import com.zuoqing.base.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zuoqing on 2017/11/21.
 */
@RestController
@RequestMapping(value = "login")
public class LoginController {

//    @Resource
//    LoginService loginService;
//
//    @RequestMapping(value = "login2")
//    public Object login2(){
//        return   loginService.ligin();
//    }

    @RequestMapping(value = "login")
    public Object login(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        LoginService loginService = context.getBean(LoginService.class);
        return  loginService.ligin();
    }

}
