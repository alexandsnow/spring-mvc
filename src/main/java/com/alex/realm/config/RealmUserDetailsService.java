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
public class RealmUserDetailsService implements UserDetailsService{

    @Autowired
    RealmUserDao realmUserDao;
    @Autowired
    RealmRoleDao realmRoleDao;
    @Autowired
    RealmUserRoleDao realmUserRoleDao;
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        UserDetails details = null;
        // 三次io操作
        RealmUserEntity realmUser = realmUserDao.selectByUserName(name);
        List<RealmUserRoleEntity> realmUserRoleList = realmUserRoleDao.selectByUserId(realmUser.getId());
        List<Integer> roleIds = new ArrayList<Integer>();
        for (RealmUserRoleEntity realmUserRoleEntity : realmUserRoleList) {
            roleIds.add(realmUserRoleEntity.getRoleId());
        }
        List<RealmRoleEntity> realmRoleList = realmRoleDao.selectByPrimaryKeyBatch(roleIds);
        String [] roleName = new String[realmRoleList.size()];
        for (int i = 0; i < realmRoleList.size(); i++) {
            roleName[i] = realmRoleList.get(i).getRoleName();
        }
        details = new User(realmUser.getUserName(),realmUser.getPassword(), AuthorityUtils.createAuthorityList(roleName));
        return details;
    }
}
