package com.wdlily.beast.api.rabbitmq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-14 下午2:11
 */
public interface StreamClient {

    String INPUT = "testStreamMsg";

    String OUTPUT = "myMessageOutput";



    @Input(StreamClient.INPUT)
    SubscribableChannel input();

    @Output(StreamClient.OUTPUT)
    MessageChannel output();

}
