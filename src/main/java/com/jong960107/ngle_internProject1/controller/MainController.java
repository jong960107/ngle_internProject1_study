package com.jong960107.ngle_internProject1.controller;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.annotation.Resource;

@Controller
public class MainController {

    @Resource(name = "loginUserBeansResource")
    private UserBeans loginUserBeansResource;

    @GetMapping("/main")
    public String main(@ModelAttribute("loginUserBeans")UserBeans userBeans){


        return "/main/index";
    }

    @GetMapping("/main/checkingMachine")
    public String mainCheckingMachine(){
        return "/main/checkingMachine";
    }
}
