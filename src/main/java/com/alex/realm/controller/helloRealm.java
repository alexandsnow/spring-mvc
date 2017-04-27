package com.alex.realm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yang_gao on 2017/3/23.
 */
@RestController
public class helloRealm {

    @RequestMapping(method = RequestMethod.GET,value = "hello")
    public String getUser(){
        return "server is running";
    }
}
