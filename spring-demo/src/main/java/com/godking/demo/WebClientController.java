package com.godking.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebClientController {
    @GetMapping("/echo")
    public ResponseEntity<String> echo() {
        return new ResponseEntity<String>("echo", HttpStatus.OK);
    }
}
