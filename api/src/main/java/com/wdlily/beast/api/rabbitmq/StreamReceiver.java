package com.wdlily.beast.api.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-14 下午2:04
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

    @StreamListener(StreamClient.INPUT)
    public void onMessageIn(Object message){

        log.info("stream message = {}", message.toString());
    }

    @StreamListener(value = StreamClient.OUTPUT)
    public void onMessageOut(String message){

        log.info("stream message = {}", message.toString());
    }


}
