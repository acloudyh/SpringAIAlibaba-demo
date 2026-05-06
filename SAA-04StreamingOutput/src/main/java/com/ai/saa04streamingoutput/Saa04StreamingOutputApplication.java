package com.ai.saa04streamingoutput;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class Saa04StreamingOutputApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Saa04StreamingOutputApplication.class, args);
        String port = context.getEnvironment().getRequiredProperty("server.port");
        log.info("SAA-04StreamingOutput started successfully, port: {}", port);
    }
}
