package com.farhantanvir.demogitaction.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping
    public String getDemo(){
        System.out.println("Hello");
        System.out.println("Hello World Farhan");
        System.out.println("Hello Demo GIT ACTION V6");
        return "Hello Demo GIT ACTION V6";

    }

}
