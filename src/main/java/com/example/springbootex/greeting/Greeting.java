package com.example.springbootex.greeting;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "greeting")
@Data
public class Greeting {
    private String name;
    private String coffee;


}
