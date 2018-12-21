package com.ljq.swagger_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.TagsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author LJQ
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocket() {

        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
            .paths(PathSelectors.any())
            .build();
    }

    @Bean
    public UiConfiguration uiConfiguration() {

        return UiConfigurationBuilder.builder()
            .deepLinking(true)
            .defaultModelExpandDepth(1)
            .validatorUrl("")
            .displayOperationId(true)
            .displayRequestDuration(true)
            .tagsSorter(TagsSorter.of("release"))
            .showExtensions(true)
            .build();
    }

    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
            .title("在线api")
            .description("RESTful API")
            .version("1.0")
            .build();
    }
}