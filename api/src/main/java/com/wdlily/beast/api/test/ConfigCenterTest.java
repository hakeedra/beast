package com.wdlily.beast.api.test;

import com.wdlily.beast.api.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-12 下午4:39
 */
@RestController
public class ConfigCenterTest {

    @Autowired
    private UserConfig userConfig;

    @Value("${env}")
    private String env;

    @Value("${api.name}")
    private String name;

    @Value("${api.age}")
    private String age;

    @Value("${api.home}")
    private String home;





    @GetMapping("/pring/env")
    public String pringEnv(){
        return env + "-" + name + "-" + age + "-" + home;
    }

    @GetMapping("/configs")
    public String getConfig(){

        return userConfig.toString();
    }

}
