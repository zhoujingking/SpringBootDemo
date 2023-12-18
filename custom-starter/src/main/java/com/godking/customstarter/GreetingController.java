package com.godking.customstarter;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class GreetingController {
    @Autowired
    private Greeting greeting;
    @GetMapping("/greeting")
    public ResponseEntity<Greeting> greeting() {
        log.info("greeting from my customized starter");
        return new ResponseEntity<Greeting>(greeting,HttpStatus.OK);
    }
}
