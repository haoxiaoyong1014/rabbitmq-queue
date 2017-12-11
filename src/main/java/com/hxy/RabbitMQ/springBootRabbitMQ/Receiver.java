package com.hxy.RabbitMQ.springBootRabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/7.
 * com.hxy.RabbitMQ.hxy
 * Demo3 springBoot整合RabbitMQ
 *
 * 创建消息消费者Receiver。通过@RabbitListener注解定义该类对hello队列的监听，
 * 并用@RabbitHandler注解来指定对消息的处理方法。
 * 所以，该消费者实现了对hello队列的消费，消费操作为输出消息的字符串内容。
 */
@Component
@RabbitListener(queues = {"hello","hello2"})
public class Receiver {

    @RabbitHandler
    public void process(String hello){

        System.out.println("Receiver :"+ hello);

    }

}