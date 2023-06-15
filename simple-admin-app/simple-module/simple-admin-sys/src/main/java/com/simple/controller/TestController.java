package com.simple.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhulx
 * @version 1.0
 * @ClassName TestController
 * @Description TODO 测试模块
 * @Date 2023/6/9 14:45
 * @since JDK1.8
 */
@RestController
@RequestMapping("sys/test")
@Api(tags = "系统：系统测试接口")
public class TestController {

    @ApiOperation("获取测试信息")
    @GetMapping(value = "/getTestInfo")
    public String getUserInfo() {
        return "这是测试接口返回的测试文字";
    }

}
