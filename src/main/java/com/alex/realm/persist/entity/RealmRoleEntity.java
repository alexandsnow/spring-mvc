package com.alex.realm.persist.entity;

import java.util.Date;

public class RealmRoleEntity {
    private Integer id;

    private String roleName;

    private String roleDesc;

    private Integer roleCreatorId;

    private Date dataCreateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Integer getRoleCreatorId() {
        return roleCreatorId;
    }

    public void setRoleCreatorId(Integer roleCreatorId) {
        this.roleCreatorId = roleCreatorId;
    }

    public Date getDataCreateTime() {
        return dataCreateTime;
    }

    public void setDataCreateTime(Date dataCreateTime) {
        this.dataCreateTime = dataCreateTime;
    }
}