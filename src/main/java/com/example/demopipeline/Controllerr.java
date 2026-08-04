package com.example.demopipeline;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Controllerr {

    
    @GetMapping("/")
    String print(){
        return "page";

    }
    
}
