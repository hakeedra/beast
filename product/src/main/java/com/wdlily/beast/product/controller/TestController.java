package com.wdlily.beast.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-11 下午6:05
 */
@RestController
public class TestController {

    @GetMapping("/login")
    public String login(){

        return "zhangSan-9002";
    }


}
