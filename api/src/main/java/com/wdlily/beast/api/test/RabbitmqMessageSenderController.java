package com.wdlily.beast.api.test;

import com.wdlily.beast.api.rabbitmq.StreamClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-14 下午2:08
 */
@RestController
@RequestMapping("/mq")
@Slf4j
public class RabbitmqMessageSenderController {

    @Autowired
    private StreamClient streamClient;

    Random random = new Random();

    /**
     * 设置跨域 allowCredentials 表示允许cookie跨域
     * @return
     */
    @GetMapping("sendMsg")
    @CrossOrigin(allowCredentials = "true")
    public Object send(){

        String message = "testStreamMsgSender:" + random.nextInt(5);

        boolean sendResult = streamClient.output().send(MessageBuilder.withPayload(message).build());

        return sendResult;
    }


}

