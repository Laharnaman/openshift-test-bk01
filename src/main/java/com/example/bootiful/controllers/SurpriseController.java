package com.example.bootiful.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.example.bootiful.surprise.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurpriseController {

    private static final String template = "How's the form, %s?";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/surprise")
    public Greeting surprise(@RequestParam(value="name", defaultValue="Yer Man") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}