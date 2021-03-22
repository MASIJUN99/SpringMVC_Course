package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/test")
public class SampleController {

    @RequestMapping("/string")
    public String string(){
        System.out.println("有返回");
        return "strSuccess";
    }

    @RequestMapping("/void1")
    public void void1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("无返回1");
        request.getRequestDispatcher("/WEB-INF/pages/void1Success.jsp").forward(request, response);

    }

    @RequestMapping("/void2")
    public void void2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("无返回2");
        response.sendRedirect(request.getContextPath() + "/void2Success.jsp");
    }

    @RequestMapping("/special")
    public ModelAndView special() {
        System.out.println("特殊返回");
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("message", "Hello World!");

        modelAndView.setViewName("specialSuccess");

        return modelAndView;
    }
}
