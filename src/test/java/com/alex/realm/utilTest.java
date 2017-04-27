package com.alex.realm;

import com.alex.realm.utils.ApplicationContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * Created by yang_gao on 2017/3/28.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-servlet.xml","classpath:spring-mybatis.xml"})
public class utilTest {

    @Autowired
    private ApplicationContextUtil applicationContextUtil;

    @Test
    public void testUtil(){
        String beanName[] = applicationContextUtil.getBeansNameArray();
        for (String s : beanName) {
            System.out.println(s);
        }
    }

}
