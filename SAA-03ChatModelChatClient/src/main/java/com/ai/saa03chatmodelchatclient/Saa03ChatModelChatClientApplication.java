package com.ai.saa03chatmodelchatclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class Saa03ChatModelChatClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Saa03ChatModelChatClientApplication.class, args);
        String port = context.getEnvironment().getRequiredProperty("server.port");
        log.info("SAA-03ChatModelChatClient started successfully, port: {}", port);
    }
}
