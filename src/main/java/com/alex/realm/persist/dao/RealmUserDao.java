package com.alex.realm.persist.dao;

import com.alex.realm.persist.entity.RealmUserEntity;

import java.util.List;

public interface RealmUserDao {
    RealmUserEntity selectByPrimaryKey(Integer id);
    RealmUserEntity selectByUserName(String name);
    List<RealmUserEntity> selectAll();
}