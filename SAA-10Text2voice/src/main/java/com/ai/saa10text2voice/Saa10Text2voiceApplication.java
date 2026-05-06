package com.ai.saa10text2voice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class Saa10Text2voiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Saa10Text2voiceApplication.class, args);
        String port = context.getEnvironment().getRequiredProperty("server.port");
        log.info("SAA-10Text2voice started successfully, port: {}", port);
    }
}
