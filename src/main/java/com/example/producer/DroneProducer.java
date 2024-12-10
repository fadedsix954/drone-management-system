package com.example.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Drone;

@Component
public class DroneProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    private static final String EXCHANGE = "droneExchange";
    private static final String ROUTING_KEY = "droneQueue";

    public void sendMessage(Drone drone) {
        amqpTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, drone);
    }
}
