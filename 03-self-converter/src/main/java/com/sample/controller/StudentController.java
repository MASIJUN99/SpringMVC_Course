package com.sample.controller;

import com.sample.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    /**
     * TODO: can i input the format like "2020/10/10"?
     *  after i define a Converter about StringToDate, i can input like "yyyy-mm-dd"
     *  but i cant input the format like "yyyy/mm/dd".
     *  is this my problem or not?
     */
    @RequestMapping("/addInfo")
    public String addInfo(Student student) {
        System.out.println("接收到学生信息：" + student);
        return "success";
    }
}
