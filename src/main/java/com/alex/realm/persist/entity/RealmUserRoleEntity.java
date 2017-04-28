package com.alex.realm.persist.entity;

import java.util.Date;

public class RealmUserRoleEntity extends RealmUserRoleKey {
    private Date dataCreateTime;

    public Date getDataCreateTime() {
        return dataCreateTime;
    }

    public void setDataCreateTime(Date dataCreateTime) {
        this.dataCreateTime = dataCreateTime;
    }
}