package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/saveAccount")
    public String testParam(String username, String password) {
        System.out.println("执行了参数绑定，获得了：" + username + "密码为：" + password);
        return "success";
    }
}
