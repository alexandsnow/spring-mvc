package com.alex.realm.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex on 2017/5/1.
 */
public class RealmError {

    public static final String CMM_SUCCESS = "CMM001";

    public static final String SYSTEM_ERROR = "SYS_001";

    // 权限相关
    public static final String USER_NOT_LOGIN_IN = "NLNS001";

    //用户相关
    public static final String CREATE_USER_ERROR = "CUR001";
    public static final String UPDATE_USER_ERROR = "UUR002";
    public static final String DELETE_USER_ERROR = "DUR003";



    public static Map<String,String> errMsg = new HashMap<String, String>(){{
       put(CMM_SUCCESS,"调用成功");
       put(SYSTEM_ERROR,"系统错误");
       put(USER_NOT_LOGIN_IN,"用户没有登陆，无法查看Rest-Api");
       put(CREATE_USER_ERROR,"创建用户失败");
       put(UPDATE_USER_ERROR,"更新用户信息失败");
       put(DELETE_USER_ERROR,"删除用户失败");
    }};
}
