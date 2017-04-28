package com.alex.realm.domain;

/**
 * Created by yang_gao on 2017/4/28.
 */
public class RealmRole {
    String roleId;
    String roleName;
    String roleCreator;
    String roleDecs;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCreator() {
        return roleCreator;
    }

    public void setRoleCreator(String roleCreator) {
        this.roleCreator = roleCreator;
    }

    public String getRoleDecs() {
        return roleDecs;
    }

    public void setRoleDecs(String roleDecs) {
        this.roleDecs = roleDecs;
    }
}
