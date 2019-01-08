package com.netease.accidence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
    
    @ResponseBody
    @RequestMapping("helloworld")
    public String helloWorld() {
    
        return "hello world! hello springboot!";
    }
}
