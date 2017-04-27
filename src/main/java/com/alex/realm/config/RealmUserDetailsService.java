package com.alex.realm.config;

import com.alex.realm.persist.dao.RealmUserDao;
import com.alex.realm.persist.entity.RealmUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

/**
 * Created by yang_gao on 2017/4/27.
 */
public class RealmUserDetailsService implements UserDetailsService{

    @Autowired
    RealmUserDao realmUserDao;
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        UserDetails details = null;
        RealmUserEntity realmUser = realmUserDao.selectByUserName(name);
        details = new User(realmUser.getUserName(),realmUser.getPassword(), AuthorityUtils.createAuthorityList(realmUser.getRole()));
        return details;
    }
}
