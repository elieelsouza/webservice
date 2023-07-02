package com.ws.web.service.webservice.resources;

import com.ws.web.service.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class userResource {

    @GetMapping
    public ResponseEntity<User> finall() {
        User u = new User(1L, "Eliel", "eliel@gmail.com", "7998844885", "12343564");
        return ResponseEntity.ok().body(u);
    }
}
