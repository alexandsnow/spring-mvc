package com.alex.realm.persist.entity;

import java.util.Date;

public class RealmUserEntity {
    private Integer id;

    private String userName;

    private String nickName;

    private String password;

    private Date accountCreatedTime;

    private Integer accountValidTime;

    private Boolean isEnabled;

    private Boolean isAccountNonLocked;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getAccountCreatedTime() {
        return accountCreatedTime;
    }

    public void setAccountCreatedTime(Date accountCreatedTime) {
        this.accountCreatedTime = accountCreatedTime;
    }

    public Integer getAccountValidTime() {
        return accountValidTime;
    }

    public void setAccountValidTime(Integer accountValidTime) {
        this.accountValidTime = accountValidTime;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsAccountNonLocked() {
        return isAccountNonLocked;
    }

    public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
        this.isAccountNonLocked = isAccountNonLocked;
    }
}