package com.sample.controller;

import com.sample.dao.StudentDao;
import com.sample.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/regInfo")
    public String regInfo(String name, String email, String age) {
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setAge(Integer.parseInt(age));
        System.out.println("接收学生信息：" + student);

        StudentDao studentDao = new StudentDao();

        studentDao.addInfo(student);
        return "success";
    }


    @RequestMapping("/regInfo2")
    public String regInfo2(Student student){
        System.out.println("接收学生信息：" + student);

        StudentDao studentDao = new StudentDao();

        studentDao.addInfo(student);
        return "success";

    }

}
