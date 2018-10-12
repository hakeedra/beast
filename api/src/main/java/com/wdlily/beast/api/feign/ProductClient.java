package com.wdlily.beast.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-11 下午9:58
 */
@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/login")
    String login();

}
