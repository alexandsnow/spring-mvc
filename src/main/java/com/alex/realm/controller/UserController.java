package com.alex.realm.controller;

import com.alex.realm.persist.entity.RealmUserEntity;
import com.alex.realm.service.RealmUserService;
import com.alex.realm.utils.RealmBaseResponse;
import com.alex.realm.utils.RealmError;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yang_gao on 2017/4/27.
 */
@RestController
@RequestMapping("/rest/user")
@Api(value="User",description = "crud operation with role 'admin'")
public class UserController {

    @Autowired
    private RealmUserService realmUserService;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "getUsers",notes ="get all users in this system")
    public RealmBaseResponse getUsers(){
        RealmBaseResponse response = new RealmBaseResponse();
        try {
            response.setCode(RealmError.CMM_SUCCESS);
            response.setMessage(RealmError.errMsg.get(RealmError.CMM_SUCCESS));
            response.setResponse(realmUserService.getUsers());
        } catch (Exception e) {
            response.setCode(RealmError.SYSTEM_ERROR);
            response.setMessage(RealmError.errMsg.get(RealmError.SYSTEM_ERROR));
        }
        return response;
    }

    @RequestMapping(method = RequestMethod.POST)
    @PreAuthorize(value="hasRole('ROLE_ADMIN')")
    @ApiOperation(value = "getUsers",notes ="get all users in this system")
    public RealmBaseResponse createUser(@RequestBody RealmUserEntity userEntity){
        RealmBaseResponse response = new RealmBaseResponse();
        try {
            response.setCode(RealmError.CMM_SUCCESS);
            response.setMessage(RealmError.errMsg.get(RealmError.CMM_SUCCESS));
            response.setResponse(realmUserService.CreateUser(userEntity));
        } catch (Exception e) {
            response.setCode(RealmError.CREATE_USER_ERROR);
            response.setMessage(RealmError.errMsg.get(RealmError.CREATE_USER_ERROR));
        }
        return response;

    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @PreAuthorize(value="hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public RealmBaseResponse getUserById(@PathVariable("id")Integer id){
        RealmBaseResponse response = new RealmBaseResponse();
        try {
            response.setCode(RealmError.CMM_SUCCESS);
            response.setMessage(RealmError.errMsg.get(RealmError.CMM_SUCCESS));
            response.setResponse(realmUserService.getUser(id));
        } catch (Exception e) {
            response.setCode(RealmError.SYSTEM_ERROR);
            response.setMessage(RealmError.errMsg.get(RealmError.SYSTEM_ERROR));
        }
        return response;
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    @PreAuthorize(value="hasRole('ROLE_ADMIN')")
    public RealmBaseResponse deleteUserById(@PathVariable("id")Integer id){
        RealmBaseResponse response = new RealmBaseResponse();
        try {
            response.setCode(RealmError.CMM_SUCCESS);
            response.setMessage(RealmError.errMsg.get(RealmError.CMM_SUCCESS));
            response.setResponse(realmUserService.deleteUserById(id));
        } catch (Exception e) {
            response.setCode(RealmError.DELETE_USER_ERROR);
            response.setMessage(RealmError.errMsg.get(RealmError.DELETE_USER_ERROR));
        }
        return response;
    }
    @RequestMapping(method = RequestMethod.PUT)
    @PreAuthorize(value="hasRole('ROLE_ADMIN')")
    public RealmBaseResponse updateUserById(@RequestBody RealmUserEntity entity){
        RealmBaseResponse response = new RealmBaseResponse();
        try {
            response.setCode(RealmError.CMM_SUCCESS);
            response.setMessage(RealmError.errMsg.get(RealmError.CMM_SUCCESS));
            response.setResponse(realmUserService.updateUser(entity));
        } catch (Exception e) {
            response.setCode(RealmError.UPDATE_USER_ERROR);
            response.setMessage(RealmError.errMsg.get(RealmError.UPDATE_USER_ERROR));
        }
        return response;
    }

}
