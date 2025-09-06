package org.example.demo.controller;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.demo.SpringBootApp;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class JavaFXController extends Application {

    private ApplicationContext springContext;

    @Override
    public void init() {
        // Spring-Boot-Kontext initialisieren
        springContext = SpringApplication.run(SpringBootApp.class);
    }

    @Override
    public void start(Stage primaryStage) {
        // Bean aus dem Spring-Kontext abrufen
        String greeting = springContext.getBean("appGreeting", String.class);

        // Label mit dem Spring-Grußtext setzen
        Label label = new Label(greeting);
        VBox root = new VBox(label);
        root.setAlignment(Pos.CENTER);

        primaryStage.setTitle("JavaFX App mit Spring Boot");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }

    @Override
    public void stop() {
        // Spring-Kontext schließen
        SpringApplication.exit(springContext);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
