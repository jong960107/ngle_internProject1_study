package com.jong960107.ngle_internProject1.dao;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import com.jong960107.ngle_internProject1.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDao {

    @Autowired
    private final UserMapper userMapper;

    public UserBeans getLoginUserInfo(UserBeans loginUserBeans){
        return userMapper.getLoginUserInfo(loginUserBeans);
    }
}
