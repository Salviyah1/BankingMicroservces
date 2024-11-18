package com.bank; // Ensure this matches your package structure 

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 

@SpringBootApplication  // Marks this class as the main Spring Boot application class
@RestController  // Marks this class as a REST controller
public class App { 

    public static void main(String[] args) { 
        // Launch the Spring Boot application
        SpringApplication.run(App.class, args); 
    } 

    @GetMapping("/hello")  // Maps HTTP GET requests to /hello to this method
    public String hello() { 
        // Returns a simple string response
        return "Hello, Banking Microservice!"; 
    } 
}
