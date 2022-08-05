package com.jong960107.ngle_internProject1.service;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import com.jong960107.ngle_internProject1.dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@RequiredArgsConstructor
public class UserService {



    @Autowired
    private final UserDao userDao;

    @Resource(name = "loginUserBeansResource")
    private UserBeans loginUserBeansResource;

    public void getLoginUserInfo(UserBeans loginUserBeans){
        UserBeans tempLoginUserBeans = userDao.getLoginUserInfo(loginUserBeans);

        if(tempLoginUserBeans != null) {
            loginUserBeansResource.setUser_idx(tempLoginUserBeans.getUser_idx());
            loginUserBeansResource.setUser_email_front(tempLoginUserBeans.getUser_email_front());
            loginUserBeansResource.setUser_pw(tempLoginUserBeans.getUser_pw());
            loginUserBeansResource.setUserLogin(true);
            System.out.println(loginUserBeansResource);


        }else {

            loginUserBeansResource.setUserLogin(false);

        }


    }

}
