package com.alex.realm.service.impl;

import com.alex.realm.persist.dao.RealmUserDao;
import com.alex.realm.persist.entity.RealmUserEntity;
import com.alex.realm.service.RealmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yang_gao on 2017/4/27.
 */
@Service
public class RealmUserServiceImpl implements RealmUserService {

    @Autowired
    private RealmUserDao realmUserDao;

    public List<RealmUserEntity> getUsers() {
        return realmUserDao.selectAll();
    }
    public RealmUserEntity getUser(Integer id) {
        return realmUserDao.selectByPrimaryKey(id);
    }

    public int CreateUser(RealmUserEntity userEntity) {
        return 0;
    }

    public int deleteUserById(Integer id) {
        return 0;
    }

    public int updateUser(RealmUserEntity userEntity) {
        return 0;
    }

    public int updateUserById(Integer id) {
        return 0;
    }
}
