package com.wdlily.beast.api.rabbitmq;

import com.wdlily.beast.api.ApiApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-13 下午2:50
 */
@Slf4j
public class RabbitmqTest extends ApiApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void messageSender(){

        amqpTemplate.convertAndSend("testQueue", new Date());
    }

    @Test
    public void bindMessageSender(){

        amqpTemplate.convertAndSend("user", "man", "man" + new Date());

        amqpTemplate.convertAndSend("user", "woman", "woman" + new Date());
    }


}
