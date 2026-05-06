package com.ai.saa09text2image;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class Saa09Text2imageApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Saa09Text2imageApplication.class, args);
        String port = context.getEnvironment().getRequiredProperty("server.port");
        log.info("SAA-09Text2image started successfully, port: {}", port);
    }
}
