package com.phan.clickupapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ClickUpApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClickUpApiApplication.class, args);
    }

}
