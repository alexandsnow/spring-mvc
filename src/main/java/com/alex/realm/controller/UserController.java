package com.alex.realm.controller;

import com.alex.realm.persist.dao.RealmUserDao;
import com.alex.realm.persist.entity.RealmUserEntity;
import com.alex.realm.service.RealmUserService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yang_gao on 2017/4/27.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RealmUserService realmUserService;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "GetUsers",notes ="get all users in this system")
    public List<RealmUserEntity> getUsers(){
        return realmUserService.getUsers();
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    @PreAuthorize(value="hasRole('ROLE_ADMIN')")
    public int createUser(@RequestBody RealmUserEntity userEntity){
        return realmUserService.CreateUser(userEntity);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @PreAuthorize(value="hasRole('ROLE_USER')")
    public RealmUserEntity getUserById(@PathVariable("id")Integer id){
        return realmUserService.getUser(id);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    @PreAuthorize(value="hasRole('ROLE_ADMIN')")
    public RealmUserEntity deleteUserById(@PathVariable("id")Integer id){
        return realmUserService.getUser(id);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @PreAuthorize(value="hasRole('ROLE_ADMIN')")
    public int updateUserById(@PathVariable("id")Integer id){
        return realmUserService.updateUserById(id);
    }


}
