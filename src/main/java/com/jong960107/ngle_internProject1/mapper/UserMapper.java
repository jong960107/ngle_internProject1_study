package com.jong960107.ngle_internProject1.mapper;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select user_email_front, user_pw " +
            "from user_table " +
            "where user_email_front=#{user_email_front} and user_pw=#{user_pw}")
     UserBeans getLoginUserInfo(UserBeans loginUserBeans);





}
