package com.example.springsecurityjwt.controller;

import com.example.springsecurityjwt.dto.SignUpRequest;
import com.example.springsecurityjwt.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<?> signUpNewUser(@RequestBody SignUpRequest signUpRequest) throws Exception{
        userService.signUpService(signUpRequest);
        return ResponseEntity.ok("Success");
    }

}
