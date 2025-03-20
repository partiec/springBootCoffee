package com.example.springbootex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExApplication.class, args);
    }



}
