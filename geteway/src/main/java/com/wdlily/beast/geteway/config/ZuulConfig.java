package com.wdlily.beast.geteway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-15 下午10:29
 */
@Component
public class ZuulConfig {


    @ConfigurationProperties(prefix = "zuul")
    @RefreshScope
    public ZuulProperties zuulProperties(){
        return new ZuulProperties();
    }


}
