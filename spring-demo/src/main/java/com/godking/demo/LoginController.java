package com.godking.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoginController {
    @Autowired
    private EventPublisher eventPublisher;
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginInfo loginInfo) {
        // send events login success

        eventPublisher.sendEvent(new LoginSuccessEvent(loginInfo.getUsername()));
        return ResponseEntity.ok("success");
    }
}
