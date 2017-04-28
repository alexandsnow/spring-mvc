package com.alex.realm.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * Created by yang_gao on 2017/4/28.
 */
public class GetLoginUserUtil {
    public static UserDetails getUserDetails(){
        UserDetails userDetail = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetail;
    }
}
