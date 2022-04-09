package com.example.dubbo.consumer.controller;

import com.example.dubbo.consumer.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("greet")
    @ResponseBody
    public String greet(@RequestParam("name") String name){
        return userService.greet(name);
    }
}
