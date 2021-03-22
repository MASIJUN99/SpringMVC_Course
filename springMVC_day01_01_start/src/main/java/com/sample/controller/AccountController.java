package com.sample.controller;

import com.sample.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("得到账号：" + account);
        return "success";
    }
}
