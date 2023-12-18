package com.godking.customstarter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(GreetingAutoConfiguration.class)
public @interface EnableGreeting {
}
