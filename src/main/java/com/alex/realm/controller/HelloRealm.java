package com.alex.realm.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    @PreAuthorize(value="hasRole('ROLE_ADMIN')")
    public String healthCheck(HttpServletRequest request){
//        String userDetail = request.getRemoteUser();
        UserDetails userDetail = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println("role are: "+userDetail.getAuthorities());
        return "welcome "+userDetail.getUsername()+" ,server is running";
    }
}
