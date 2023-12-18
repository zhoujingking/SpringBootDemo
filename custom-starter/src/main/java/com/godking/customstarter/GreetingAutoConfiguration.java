package com.godking.customstarter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({Greeting.class, GreetingController.class})
@Configuration
public class GreetingAutoConfiguration {
}
