package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String sayHello() {
        logger.debug("Hello from Aman's application");
        return "Hello Aman! Your microservice is working.";
    }

    @GetMapping("/sum")
    public Map<String, Object> getSum(@RequestParam int a, @RequestParam int b) {
        logger.info("Received request to calculate sum: a={}, b={}", a, b);
        Map<String, Object> response = new LinkedHashMap<>();
        int sum = a+b;
        response.put("message :" , "calculation successful");
        response.put("first number to add :" , a);
        response.put("second number to add : ", b);
        response.put("summation of the two numbers is : ", sum);
        logger.debug("Calculation completed. Result={}", sum);
        return response;
    }
}