package com.alex.realm.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yang_gao on 2017/3/23.
 */
@RestController
public class HelloRealm {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    @ApiOperation(value="heathCheck",notes = "check Health")
    public String getUser(){
        return "server is running";
    }
}
