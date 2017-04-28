package com.alex.realm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by yang_gao on 2017/4/27.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket getDocket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .groupName("Realm")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(generateApiInfo());
        return docket;
    }

    private static ApiInfo generateApiInfo(){
        ApiInfo apiInfo = new ApiInfo("Realm","Realm BackEnd Api","1.0.0",
                "http://DaniellaRealm:8080/Realm",
                "contact","MIT","http://DaniellaRealm:8080/Realm");
        return apiInfo;
    }

    @Bean
    public UiConfiguration getUiConfig() {
        return new UiConfiguration(
                null,// url,暂不用
                "none",       // docExpansion          => none | list
                "alpha",      // apiSorter             => alpha
                "schema",     // defaultModelRendering => schema
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS,
                false,        // enableJsonEditor      => true | false
                true);        // showRequestHeaders    => true | false
    }
}
