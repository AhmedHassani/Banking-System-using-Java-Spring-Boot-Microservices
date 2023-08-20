package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = {"","/"})
    public String getHello(){
        return "Hello World";
    }

    @GetMapping(value = {"/index","/index/"})
    public String getIndex(){
        return "Index,Page";
    }


}
