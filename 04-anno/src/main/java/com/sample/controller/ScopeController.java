package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/scope")
public class ScopeController {
    @RequestMapping("/testRequestScope")
    public String testRequestScope() {
        System.out.println("查看Request域");
        return "requsetPage";
    }

    @RequestMapping("/testSessionScope")
    public String testSessionScope() {
        System.out.println("查看Session域");
        return "sessionPage";
    }
}
