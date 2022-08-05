package com.jong960107.ngle_internProject1.validator;

import com.jong960107.ngle_internProject1.beans.UserBeans;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        // TODO Auto-generated method stub
        return UserBeans.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // TODO Auto-generated method stub
        UserBeans userBeans = (UserBeans) target;

        String beanName = errors.getObjectName();


        }
    }

