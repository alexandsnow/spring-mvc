package com.alex.realm.controller;

import com.alex.realm.utils.GetResourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yang_gao on 2017/3/23.
 */
@RestController
public class helloRealm {

    @Autowired
    private GetResourceUtil getResourceUtil;

    @RequestMapping(method = RequestMethod.GET,value = "banner")
    public ModelAndView getBanner(){
        ModelAndView modelAndView = new ModelAndView("banner");
        modelAndView.addObject("banner",getResourceUtil.getResource("classpath:banner.txt"));
        return modelAndView;
    }

}
