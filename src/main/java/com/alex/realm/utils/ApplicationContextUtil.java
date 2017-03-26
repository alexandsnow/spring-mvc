package com.alex.realm.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * Created by yang_gao on 2017/3/26.
 */

@Service
public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext CONTEXT;
    private static String[] BEAN_NAMES;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CONTEXT = applicationContext;
        BEAN_NAMES = CONTEXT.getBeanDefinitionNames();
    }

    public static ApplicationContext getContext() {
        return CONTEXT;
    }

    /**
     * get bean by beanName
     *
     * @param beanName
     * @return
     */
    public Object getBean(String beanName) {
        return CONTEXT.getBean(beanName);
    }

    /**
     * get beans name
     *
     * @return An Array saved Bean Name
     */
    public String[] getBeansInContext() {
        return BEAN_NAMES;
    }

    public String[] getBeansNameArray() {
        return BEAN_NAMES;
    }
}
