package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Aman! Your microservice is working.";
    }

    @GetMapping("/sum")
    public Map<String, Object> getSum(@RequestParam int a, @RequestParam int b) {
        Map<String, Object> response = new LinkedHashMap<>();
        int sum = a+b;
        response.put("message :" , "calculation successful");
        response.put("first number to add :" , a);
        response.put("second number to add : ", b);
        response.put("summation of the two numbers is : ", sum);
        return response;
    }
}