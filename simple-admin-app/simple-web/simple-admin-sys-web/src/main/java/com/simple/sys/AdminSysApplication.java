package com.simple.sys;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhulx
 * @version 1.0
 * @ClassName AdminSysApplication
 * @Description TODO
 * @Date 2023/6/9 9:29
 * @since JDK1.8
 */
@SpringBootApplication(scanBasePackages = "com.simple",exclude = DruidDataSourceAutoConfigure.class)
@ServletComponentScan(basePackages = "com.simple")
@EnableTransactionManagement
@EnableCaching
public class AdminSysApplication{

    public static void main(String[] args) {
        SpringApplication.run(AdminSysApplication.class, args);
    }
}
