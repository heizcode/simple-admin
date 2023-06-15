package com.simple.common.swagger2;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhulx
 * @version 1.0
 * @ClassName Swagger2Config
 * @Description TODO Swagger2 Docket配置
 * @Date 2023/6/9 16:58
 * @since JDK1.8
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //.apis(RequestHandlerSelectors.basePackage("com.wisestars"))
                .paths(PathSelectors.any())
                .build();
    }

    // 构建api文档的详细信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 页面标题
                .title("API接口说明")
                // 创建人
                .contact(new Contact("admin", "", ""))
                // 版本号
                .version("V1.0.0")
                // 描述
                .description("")
                .build();
    }

}
