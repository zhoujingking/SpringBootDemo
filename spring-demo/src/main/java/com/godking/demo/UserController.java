package com.godking.demo;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j(topic = "service")
@RequestMapping(path = "/user")
public class UserController {
    @GetMapping("{id}")
    public User getUser(@PathVariable int id) {
        return new User(id, "godking", 100);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createUser(@Valid @RequestBody User user) throws Exception {

//        return new ResponseEntity<String>("created", HttpStatus.CREATED);
        return ResponseEntity.status(HttpStatus.CREATED).body("created");
//        throw new RuntimeException("internal error");
    }
}


