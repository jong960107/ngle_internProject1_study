package com.jong960107.ngle_internProject1.config;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class RootAppContext {

    @Bean("loginUserBeansResource")
    @SessionScope
    public UserBeans loginUserBeansResource() {
        return new UserBeans();
    }
}