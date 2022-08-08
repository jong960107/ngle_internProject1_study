package com.jong960107.ngle_internProject1.controller;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import oracle.jdbc.proxy.annotation.Post;
import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    @Resource(name = "loginUserBeansResource")
    private UserBeans loginUserBeansResource;

    @GetMapping("/main")
    public String main(@ModelAttribute("tempLoginUserBeansResource")UserBeans tempLoginUserBeansResource, Model model, HttpServletRequest request,  HttpSession session){
        System.out.println("loginUserBeansResource = " + loginUserBeansResource.isUserLogin());
        session.setAttribute("userLogin",loginUserBeansResource.isUserLogin());
        return "/main/index";
    }

    @GetMapping("/main/checkingMachine")
    public String mainCheckingMachine(){
        return "/main/checkingMachine";
    }


    @GetMapping("/main/adminMenu")
    public String mainAdminMenu(){
        return "/main/adminMenu";
    }
}
