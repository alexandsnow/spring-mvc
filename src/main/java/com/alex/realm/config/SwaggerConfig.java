package com.alex.realm.config;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yang_gao on 2017/4/27.
 */
@Configuration
@EnableSwagger
public class SwaggerConfig {

    @Autowired
    private SpringSwaggerConfig swaggerConfig;

    @Bean
    public SwaggerSpringMvcPlugin getSwaggerSpringPlugin(){
        SwaggerSpringMvcPlugin plugin;
        plugin  = new SwaggerSpringMvcPlugin(swaggerConfig).apiInfo(generateApiInfo());
        return plugin;
    };
    private static ApiInfo generateApiInfo(){
        return new ApiInfo(
                "Realm",
                "All Api in project Realm",
                "My Apps API terms of service",
                "gaoyang_dev@outlook.com",
                "MIT",
                "http:DaniellaRealm.cn:8080/Realm"
        );
    }
}
