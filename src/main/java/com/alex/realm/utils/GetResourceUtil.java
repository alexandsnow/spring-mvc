package com.alex.realm.utils;

import org.apache.commons.io.IOUtils;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yang_gao on 2017/3/26.
 * getClassPathResource from file .txt .doc
 */

@Service
public class GetResourceUtil implements ResourceLoaderAware {

    private static ResourceLoader LOADER;

    public void setResourceLoader(ResourceLoader resourceLoader) {
        LOADER = resourceLoader;
    }

    public List<String> getLines(String fileClassPath){
        Resource res = LOADER.getResource(fileClassPath);
        try {
            InputStream inputStream = res.getInputStream();
            BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(inputStream));
            List<String> lineContent = new ArrayList<String>();
            while(null != inputStreamReader.readLine()){
                lineContent.add(inputStreamReader.readLine());
            }
            return lineContent;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String getResource(String fileClassPath){
        try {
            return IOUtils.toString(LOADER.getResource(fileClassPath).getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }




}
