package com.jong960107.ngle_internProject1.controller;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import com.jong960107.ngle_internProject1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.Session;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    @Resource(name = "loginUserBeansResource")
    private UserBeans loginUserBeansResource;

    @GetMapping("/user/not_login")
    public String not_login(){
        return "/user/not_login";
    }


    @GetMapping("/user/logout")
    public String logout(@ModelAttribute("tempLoginUserBeansResource") UserBeans tempLoginUserBeansResource
            ,BindingResult result, HttpSession session,HttpServletRequest request) {

        if (result.hasErrors()){
            return "/user/errorAlert";
        }

        loginUserBeansResource.setUserLogin(false);
        session = request.getSession();
        session.invalidate();
        return "/user/login";
    }

    @GetMapping("/user/login")
    public String getLogin(@ModelAttribute("tempLoginUserBeansResource") UserBeans loginUserBeansResource,Model model
    , @RequestParam(value="fail",defaultValue = "false") boolean fail){

    model.addAttribute("fail",fail);
    model.addAttribute(loginUserBeansResource);
        return "/user/login";
    }


    @PostMapping("/user/signup_pro")
    public String postSignup_pro(@Valid @ModelAttribute("tempLoginUserBeansResource") UserBeans tempLoginUserBeansResource, BindingResult result,
                                 Model model, HttpSession session, HttpServletRequest request){

        if (result.hasErrors()){
            return "/user/login";
        }
        loginUserBeansResource =   userService.getLoginUserInfo(tempLoginUserBeansResource);

        if(loginUserBeansResource.isUserLogin() == true){
            session = request.getSession();
            session.setAttribute("userLogin",loginUserBeansResource.isUserLogin());
            return "/main/checkingMachine";
        }

        return "/user/signup_fail";

    }

}
