package com.kish.learning.quarkus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/hello")
public class ExampleResource {

    @Value("${example.greeting.msg:Hola}")
    private String greetings;

    @GetMapping
    public String hello() {
        return "hello Shanaya";
    }

    @GetMapping("/{name}")
    public String greetings(@PathVariable("name") String name){
        return String.format("%s %s",greetings,name);
    }
}