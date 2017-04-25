package com.alex.realm.persist.entity;

import java.util.Date;

public class UserEntity {
    private Integer id;

    private String name;

    private String mobileEncrypt;

    private Date datacreateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobileEncrypt() {
        return mobileEncrypt;
    }

    public void setMobileEncrypt(String mobileEncrypt) {
        this.mobileEncrypt = mobileEncrypt == null ? null : mobileEncrypt.trim();
    }

    public Date getDatacreateTime() {
        return datacreateTime;
    }

    public void setDatacreateTime(Date datacreateTime) {
        this.datacreateTime = datacreateTime;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileEncrypt='" + mobileEncrypt + '\'' +
                ", datacreateTime=" + datacreateTime +
                '}';
    }
}