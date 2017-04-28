package com.alex.realm.persist.dao;

import com.alex.realm.persist.entity.RealmUserRoleEntity;
import com.alex.realm.persist.entity.RealmUserRoleKey;

import java.util.List;

public interface RealmUserRoleDao {
    int deleteByPrimaryKey(RealmUserRoleKey key);

    int insert(RealmUserRoleEntity record);

    int insertSelective(RealmUserRoleEntity record);

    RealmUserRoleEntity selectByPrimaryKey(RealmUserRoleKey key);

    int updateByPrimaryKeySelective(RealmUserRoleEntity record);

    int updateByPrimaryKey(RealmUserRoleEntity record);

    List<RealmUserRoleEntity> selectByUserId(Integer userId);
    List<RealmUserRoleEntity> selectByRoleId(Integer roleId);
}