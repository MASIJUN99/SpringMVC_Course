package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 控制器类
@Controller
public class HelloController {

    @RequestMapping(path="/hello")
    public String sayHello() {
        System.out.println("Hello Spring MVC");
        return "success";
    }
}
