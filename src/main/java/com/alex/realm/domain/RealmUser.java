package com.alex.realm.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;

/**
 * Created by yang_gao on 2017/4/28.
 */
public class RealmUser implements UserDetails {

    String id;
    String userName;
    String nickName;
    String password;
    Timestamp accountCreatedTime;
    Long accountValidTime;
    String roles;
    boolean isAccountNonLocked;
    boolean isCredentialsNonExpired;
    boolean isEnabled;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Timestamp getAccountCreatedTime() {
        return accountCreatedTime;
    }

    public void setAccountCreatedTime(Timestamp accountCreatedTime) {
        this.accountCreatedTime = accountCreatedTime;
    }

    public Long getAccountValidTime() {
        return accountValidTime;
    }

    public void setAccountValidTime(Long accountValidTime) {
        this.accountValidTime = accountValidTime;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList(roles);
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return userName;
    }

    public boolean isAccountNonExpired() {
        Long now = new Date().getTime();
        Long calc = this.getAccountCreatedTime().getTime() + this.getAccountValidTime();
        return now >= calc ? false : true;
    }

    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
