package com.wdlily.beast.api.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-12 下午4:49
 */
@Data
@Component
@ConfigurationProperties(prefix = "api")
@RefreshScope
public class UserConfig {

    private String name;

    private String age;

    private String home;

}
