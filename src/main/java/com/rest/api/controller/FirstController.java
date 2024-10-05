package com.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first/v1")
public class FirstController {

    @GetMapping("endpoint")
    public String firstEndpoint() {
        return "Hello World";
    }
}
