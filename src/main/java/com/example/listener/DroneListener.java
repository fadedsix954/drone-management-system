package com.example.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.model.Drone;
import com.example.service.DroneService;

@Component
public class DroneListener {

    private final DroneService droneService;

    public DroneListener(DroneService droneService) {
        this.droneService = droneService;
    }

    @RabbitListener(queues = "droneQueue")
    public void listen(Drone drone) {
        droneService.saveDrone(drone);
    }
}
