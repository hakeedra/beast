package com.wdlily.beast.api.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: restTemplete结合LoadBalance
 * @Author: wangdi
 * @Date: 18-10-11 下午9:32
 */
@Component
public class RestTempleteConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
