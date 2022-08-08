package com.jong960107.ngle_internProject1.interceptor;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import com.jong960107.ngle_internProject1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequiredArgsConstructor
public class CheckLoginInterceptor implements HandlerInterceptor {




    @Resource(name = "loginUserBeansResource")
    private UserBeans loginUserBeansResource;

    public CheckLoginInterceptor(UserBeans loginUserBeansResource){
        this.loginUserBeansResource = loginUserBeansResource;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {



        // TODO Auto-generated method stub
        if(loginUserBeansResource.isUserLogin() == false) {
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath + "/user/not_login");
            return false;
        }

        return true;
    }
}
