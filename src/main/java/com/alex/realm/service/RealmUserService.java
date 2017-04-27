package com.alex.realm.service;

import com.alex.realm.persist.entity.RealmUserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yang_gao on 2017/4/27.
 */
public interface RealmUserService {
    public List<RealmUserEntity> getUsers();
    public RealmUserEntity getUser(Integer id);
    public int CreateUser(RealmUserEntity userEntity);
    public int deleteUserById(Integer id);
    public int updateUser(RealmUserEntity userEntity);
    public int updateUserById(Integer id);
}
