package com.alex.realm.controller;

import com.alex.realm.utils.ApplicationContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yang_gao on 2017/3/23.
 */
@RestController
public class helloRealm {

    @Autowired
    ApplicationContextUtil applicationContextUtil;
    @RequestMapping("/hello")
    public String hello(){
        return "welcome to Realm";
    }

    @RequestMapping("/getBean")
    public String getBean(){
        String [] beans =  applicationContextUtil.getBeansNameArray();
        for (String bean : beans) {
            System.out.println(bean);
        }
        return "ok";
    }
}
