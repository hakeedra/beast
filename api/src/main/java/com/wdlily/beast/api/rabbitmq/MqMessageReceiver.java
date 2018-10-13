package com.wdlily.beast.api.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: wangdi
 * @Date: 18-10-13 下午2:55
 */
@Component
@Slf4j
public class MqMessageReceiver {

//    @RabbitListener(queues = "testQueue")
    @RabbitListener(queuesToDeclare = {@Queue("testQueue")})
    public void messageReceiver(String message){

        log.info("default message receiver: {}", message);
    }


    @RabbitListener(bindings = {
            @QueueBinding(key = "man", exchange = @Exchange("user"), value = @Queue("man"))
    })
    public void routeKeyForMan(String message){

        log.info("man exchange message: {}", message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(key = "woman", exchange = @Exchange("user"), value = @Queue("woman"))
    })
    public void routeKeyForWoman(String message){

        log.info("woman exchange message: {}", message);
    }


}
