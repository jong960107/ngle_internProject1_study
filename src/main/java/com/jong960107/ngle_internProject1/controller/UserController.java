package com.jong960107.ngle_internProject1.controller;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import com.jong960107.ngle_internProject1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    @Resource(name = "loginUserBeansResource")
    private UserBeans loginUserBeansResource;


    @GetMapping("/user/logout")
    public String logout(@ModelAttribute("loginUserBeans") UserBeans loginUserBeans,BindingResult result) {

        if (result.hasErrors()){
            return "/user/errorAlert";
        }

        loginUserBeansResource.setUserLogin(false);

        return "/user/login";
    }

    @GetMapping("/user/login")
    public String getSignup_pro(@ModelAttribute("loginUserBeans") UserBeans loginUserBeans,BindingResult result){

        if(result.hasErrors()){
            return "/user/errorAlert";
        }

        return "/user/login";
    }


    @PostMapping("/user/signup_pro")
    public String postSignup_pro(@Valid @ModelAttribute("loginUserBeans") UserBeans loginUserBeans, BindingResult result, Model model, Request request){

        if (result.hasErrors()){
            return "/user/login";
        }

        userService.getLoginUserInfo(loginUserBeans);

        if(loginUserBeansResource.isUserLogin() == true){

            model.addAttribute("userLogin",loginUserBeansResource.isUserLogin());
            return "/main/index";
        }

        return "/user/signup_fail";

    }

}
