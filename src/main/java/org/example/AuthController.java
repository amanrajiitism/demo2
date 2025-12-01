package org.example;

import org.example.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/token")
    public String generateToken(@RequestParam String username) {
        return jwtUtil.generateToken(username);
    }
}

