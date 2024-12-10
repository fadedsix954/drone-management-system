package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Drone;
import com.example.service.DroneService;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DroneController {

    @FXML
    private TextField nomeField;

    @FXML
    private TextField modeloField;

    @FXML
    private Button saveButton;

    @Autowired
    private DroneService droneService;

    @FXML
    private void handleSave() {
        Drone drone = new Drone();
        drone.setNome(nomeField.getText());
        drone.setModelo(modeloField.getText());
        drone.setStatus("Ativo");  // Status padrão
        droneService.saveDrone(drone);  // Salva no banco e envia para o RabbitMQ
    }
}
