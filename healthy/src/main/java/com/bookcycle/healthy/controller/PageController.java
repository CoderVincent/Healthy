package com.bookcycle.healthy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/registpage")
    public String registpage(){
        return "register";
    }

    @RequestMapping("/survey")
    public String survey(){
        return "survey";
    }

    @RequestMapping("/success")
    public String success(){return "success";}

    @RequestMapping("/fail")
    public String fail(){return "fail";}
}
