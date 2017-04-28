package com.alex.realm.config;

import com.alex.realm.persist.dao.RealmRoleDao;
import com.alex.realm.persist.dao.RealmUserDao;
import com.alex.realm.persist.dao.RealmUserRoleDao;
import com.alex.realm.persist.entity.RealmRoleEntity;
import com.alex.realm.persist.entity.RealmUserEntity;
import com.alex.realm.persist.entity.RealmUserRoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yang_gao on 2017/4/27.
 */
public class RealmUserDetailsService implements UserDetailsService {

    @Autowired
    RealmUserDao realmUserDao;
    @Autowired
    RealmRoleDao realmRoleDao;
    @Autowired
    RealmUserRoleDao realmUserRoleDao;

    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        UserDetails details = null;
        RealmUserEntity realmUser = realmUserDao.selectByUserName(name);
        details = new User(realmUser.getUserName(), realmUser.getPassword(), AuthorityUtils.createAuthorityList(this.getRoles(realmUser)));
        return details;
    }

    // 三次io操作
    private String[] getRoles(RealmUserEntity realmUser) {
        if (null != realmUser) {
            List<RealmUserRoleEntity> realmUserRoleList = realmUserRoleDao.selectByUserId(realmUser.getId());
            if (null != realmUserRoleList) {
                List<Integer> roleIds = new ArrayList<Integer>();
                for (RealmUserRoleEntity realmUserRoleEntity : realmUserRoleList) {
                    roleIds.add(realmUserRoleEntity.getRoleId());
                }
                List<RealmRoleEntity> realmRoleList = realmRoleDao.selectByPrimaryKeyBatch(roleIds);
                if (null != realmRoleList) {
                    String[] roleNames = new String[realmRoleList.size()];
                    for (int i = 0; i < realmRoleList.size(); i++) {
                        roleNames[i] = realmRoleList.get(i).getRoleName();
                    }
                    return roleNames;
                }
            }
        }
        return null;
    }
}
