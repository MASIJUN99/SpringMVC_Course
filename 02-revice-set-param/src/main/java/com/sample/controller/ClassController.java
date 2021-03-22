package com.sample.controller;

import com.sample.domain.Class;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/class")
public class ClassController {
    @RequestMapping("/addInfo")
    public String addInfo(Class classA) {
        System.out.println("接收班级信息" + classA);
        return "success";
    }

}
