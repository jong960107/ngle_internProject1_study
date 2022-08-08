package com.jong960107.ngle_internProject1.interceptor;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import com.jong960107.ngle_internProject1.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@Component
public class TopMenuInterceptor implements HandlerInterceptor {

    private UserBeans loginUserBeansResource;
    private UserService userService;

    public TopMenuInterceptor(UserService userService, UserBeans loginUserBeansResource) {
        this.userService = userService;
        this.loginUserBeansResource = loginUserBeansResource;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        userService.getLoginUserInfo(loginUserBeansResource);
        UserBeans requestTempLoginUserBeansResource =(UserBeans)request.getAttribute("loginUserBeansResource");
        request.setAttribute("loginUserBeansResource",requestTempLoginUserBeansResource);

        return true;
    }
}
