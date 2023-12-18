package com.godking.customstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.Date;

@Data
@Service
@ConfigurationProperties(prefix = "greeting")
public class Greeting {
    private String message;
    private Date date;
}
