package com.netease.accidence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloWorld {
    
    @ResponseBody
    @RequestMapping("/helloworld")
    public String helloWorld() {
    
        return "hello world! hello springboot!";
    }

// @ResponseBody // 要去除
@RequestMapping("/welcome")
public String welcome(Map<String, Object> map) {
    // geithymeleaf准备数据
    
    // 给request域中放welcome
    map.put("welcome", "welcome thymeleaf");
    
    return "result";
}
}
