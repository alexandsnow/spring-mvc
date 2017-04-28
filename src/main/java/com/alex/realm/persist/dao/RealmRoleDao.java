package com.alex.realm.persist.dao;

import com.alex.realm.persist.entity.RealmRoleEntity;

import java.util.List;

public interface RealmRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(RealmRoleEntity record);

    int insertSelective(RealmRoleEntity record);

    int updateByPrimaryKeySelective(RealmRoleEntity record);

    int updateByPrimaryKey(RealmRoleEntity record);

    RealmRoleEntity selectByPrimaryKey(Integer id);
    List<RealmRoleEntity> selectByPrimaryKeyBatch(List<Integer> list);
}