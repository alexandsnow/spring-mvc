package com.alex.realm.service;

import com.alex.realm.persist.entity.RealmUserEntity;

import java.util.List;

/**
 * Created by yang_gao on 2017/4/27.
 */
public interface RealmUserService {
    public List<RealmUserEntity> getUsers() throws Exception;
    public RealmUserEntity getUser(Integer id) throws Exception;
    public int CreateUser(RealmUserEntity userEntity) throws Exception;
    public int deleteUserById(Integer id) throws Exception;
    public int updateUser(RealmUserEntity userEntity) throws Exception;
    public int updateUserDelta(RealmUserEntity userEntity) throws Exception;
}
