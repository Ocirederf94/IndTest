package com.Inditextest.catalog.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig
{

    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.Inditextest.catalog.controllers"))
                .paths(PathSelectors.regex("/*.*"))
                .build()
                .apiInfo(apiInfo());
    }


    private List<SecurityReference> defaultAuth()
    {
        return Arrays
                .asList(new SecurityReference("JWT", new AuthorizationScope[] {}));
    }

    private ApiInfo apiInfo()
    {
        return new ApiInfo("Webhook Client Restful API", "This API provides the necessary endpoints needed by the Webhook Clients",
                "API V0.1.0",
                "Terms of service", new Contact("Architecture Team", "http://www.example.com", "email@company.com"),
                "API License", "http://www.example.com", Collections.emptyList());
    }

}
