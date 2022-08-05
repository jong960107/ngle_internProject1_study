package com.jong960107.ngle_internProject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homeToMain(){
        return "redirect:/main";
    }

}


