package com.jong960107.ngle_internProject1.controller;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class MainController {

    @Resource(name = "loginUserBeansResource")
    private UserBeans loginUserBeansResource;

    @GetMapping("/main")
    public String main(@ModelAttribute("loginUserBeans")UserBeans userBeans){



        return "/main/index";
    }
}
