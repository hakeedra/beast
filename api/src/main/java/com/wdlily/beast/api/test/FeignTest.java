package com.wdlily.beast.api.test;

import com.wdlily.beast.api.feign.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 使用feign
 * @Author: wangdi
 * @Date: 18-10-11 下午9:56
 */
@RestController
@Slf4j
public class FeignTest {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/feign/login")
    public String feignLogin(){

        String result = productClient.login();
        log.info("result = {}", result);
        return result;
    }

}
