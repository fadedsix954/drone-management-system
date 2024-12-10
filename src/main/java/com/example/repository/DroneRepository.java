package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Drone;

public interface DroneRepository extends JpaRepository<Drone, Long> {
}
