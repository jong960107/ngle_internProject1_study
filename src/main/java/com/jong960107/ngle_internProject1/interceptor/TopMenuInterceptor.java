package com.jong960107.ngle_internProject1.interceptor;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import com.jong960107.ngle_internProject1.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Slf4j
@Component
public class TopMenuInterceptor implements HandlerInterceptor {
    @Resource(name = "loginUserBeansResource")
    private UserBeans loginUserBeansResource;

    private final UserService userService;

    public TopMenuInterceptor(UserService userService){
        this.userService = userService;
    }



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("loginUserBeansResource",loginUserBeansResource);

        return true;
    }
}
