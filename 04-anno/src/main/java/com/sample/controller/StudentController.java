package com.sample.controller;


import com.sample.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@RequestMapping("/student")
@SessionAttributes(value = {"msg"})
public class StudentController {

    /**
     * TODO: even though i define the annotation "@RequestParam" and i limit the input parameter
     *  when i want make the limit to a class which contains that parameter
     *  how can i do?
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(value = "name", required = true)String name, String age, String email) {
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setAge(Integer.parseInt(age));
        System.out.println("获得学生信息：" + student);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestParam(@RequestBody() String jsonBody) {
        System.out.println("获得请求体：" + jsonBody);
        return "success";
    }

    @RequestMapping("/testPathVariable/{name}")
    public String testPathVariable(@PathVariable("name") String name){
        System.out.println("获得占位符：" + name);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestBody(@RequestHeader("accept") String header){
        System.out.println("获得请求消息头：" + header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value="JSESSIONID") String sessionId){
        System.out.println("获取cookie中的session id：" + sessionId);
        return "success";
    }

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model){
        model.addAttribute("msg", "你好");
        System.out.println("存入信息“msg:你好”成功");
        System.out.println("此时可以在request域内找到次键值对");
        return "success";
    }

    @RequestMapping("/getSessionAttribute")
    public String getSessionAttribute(ModelMap model){
        String msg = (String) model.get("msg");
        System.out.println("获取信息：" + msg);
        return "success";
    }

    @RequestMapping("/delSessionAttribute")
    public String delSessionAttribute(SessionStatus status){
        status.setComplete();
        System.out.println("清空session");
        return "success";
    }

}
