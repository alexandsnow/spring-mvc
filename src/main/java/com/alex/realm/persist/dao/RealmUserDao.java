package com.alex.realm.persist.dao;

import com.alex.realm.persist.entity.RealmUserEntity;

public interface RealmUserDao {

    int insertSelective(RealmUserEntity record);
    int updateByPrimaryKeySelective(RealmUserEntity record);
    int updateByPrimaryKey(RealmUserEntity record);

    RealmUserEntity selectByPrimaryKey(Integer id);
    RealmUserEntity selectByUserName(String userName);
    int deleteByPrimaryKey(Integer id);
    int insert(RealmUserEntity record);
}