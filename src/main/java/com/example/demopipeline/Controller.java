package com.example.demopipeline;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {

    
    @GetMapping("/")
    String print(){
        return "My First Ec2 server and running cicd pipeline for the fisrt time";

    }
    
}
