package org.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootApp {

    // Beispiel: Eigenschaft aus application.properties einlesen
    @Bean
    public String appGreeting(@Value("${app.greeting:Hallo aus Spring Boot!}") String greeting) {
        return greeting;
    }
}
