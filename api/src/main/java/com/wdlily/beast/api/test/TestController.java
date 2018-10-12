package com.wdlily.beast.api.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-11 下午9:03
 */
@RestController
@Slf4j
public class TestController {

    //method 2
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/client/login")
    public String clientLogin(){

//        method 1
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject("http://localhost:9000/login", String.class);

//        method2
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s/login", serviceInstance.getHost(), serviceInstance.getPort());
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(url, String.class);

        //method 3
        String result = restTemplate.getForObject("http://PRODUCT/login", String.class);

        log.info("result = {}", result);


        return result;
    }


}
