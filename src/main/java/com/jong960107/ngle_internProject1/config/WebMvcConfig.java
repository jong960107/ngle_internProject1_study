package com.jong960107.ngle_internProject1.config;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import com.jong960107.ngle_internProject1.interceptor.CheckLoginInterceptor;
import com.jong960107.ngle_internProject1.interceptor.TopMenuInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Resource(name = "loginUserBeansResource")
    private UserBeans loginUserBeansResource;

    @Autowired
    TopMenuInterceptor topMenuInterceptor;



    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        CheckLoginInterceptor checkLoginInterceptor = new CheckLoginInterceptor(loginUserBeansResource);
        InterceptorRegistration reg1 = registry.addInterceptor(checkLoginInterceptor);
        reg1.addPathPatterns("/user/modify","/main/adminMenu");



    }
}
