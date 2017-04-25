package com.alex.realm;

import org.springframework.test.context.TestExecutionListeners;

import java.util.*;

/**
 * Created by yang_gao on 2017/3/28.
 */
public class utilTest {
    public static void main(String[] args) {
        Map<String ,String> res = new HashMap<String,String>();
        res.put("key1","hello");
        res.put("key2","hello word");
        res.put("key3","hello word");
        res.put("key4","hello word");
        System.out.println(res.toString());
        List<String> result = new ArrayList<String>();

        Collection<String> re = res.values();
        for (String s : re) {
            System.out.println(s);
        }

    }
}
