package org.example.demo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainController {

    @Value("${app.greeting}")
    private String greeting;

    @FXML
    private Label nameLabel;

    @FXML
    public void initialize() {
        nameLabel.setText(greeting);
    }
}

