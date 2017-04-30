package com.alex.realm.controller;

import com.alex.realm.utils.GetLoginUserUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yang_gao on 2017/3/23.
 */
@RestController
@Api(value="healthCheck",description = "health check")
public class HelloRealm {

    @RequestMapping(value = "check",method = RequestMethod.GET)
    @ApiOperation(value="heathCheck",notes = "check Health")
    public String healthCheck(){
        return "server is running ...";
    }

    @RequestMapping(value = "checkSafely",method = RequestMethod.GET)
    @ApiOperation(value="heathCheck",notes = "check Health")
    public String healthCheckWithSecurity(){
        String loginUserName = null;
        try {
            loginUserName = GetLoginUserUtil.getUserDetails().getUsername();
        } catch (Exception e) {
            return "用户没有经过登陆，无法查看受保护的API";
        }
        return "welcome "+loginUserName+" ,server is running";
    }
}
