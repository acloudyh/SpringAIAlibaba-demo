package com.ai.saa08persistent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class Saa08PersistentApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Saa08PersistentApplication.class, args);
        String port = context.getEnvironment().getRequiredProperty("server.port");
        log.info("SAA-08Persistent started successfully, port: {}", port);
    }
}
