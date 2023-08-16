package com.example.demo.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller {

    @GetMapping("/hello")
    public String index(@RequestParam(value = "myNanem", defaultValue = "World") String name){
        return "Greeting from spring boot "+ String.format("Hello %s!",name);
    }
}
