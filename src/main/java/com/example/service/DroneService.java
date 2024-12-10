package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Drone;
import com.example.repository.DroneRepository;

@Service
public class DroneService {

    @Autowired
    private DroneRepository droneRepository;

    public List<Drone> getAllDrones() {
        return droneRepository.findAll();
    }

    public Drone saveDrone(Drone drone) {
        return droneRepository.save(drone);
    }

    public void deleteDrone(Long id) {
        droneRepository.deleteById(id);
    }
}
