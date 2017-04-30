package com.alex.realm.utils;

import com.alex.realm.exception.RealmException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * Created by yang_gao on 2017/4/28.
 */
public class GetLoginUserUtil {
    public static UserDetails getUserDetails() throws Exception{
        try{
            //spring-security 获取登陆用户名的方法
            UserDetails userDetail = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            return userDetail;

        }catch(Exception e){
            throw new RealmException(RealmError.USER_NOT_LOGIN_IN,e);
        }
    }
}
