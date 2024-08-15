package com.example.Firstapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Amitesh")
public class Firstcontroller {

        @GetMapping("/test")
        public  String kaiseho(){
            return "Kaie ho sir ji.....";

    }
    @GetMapping("/hello")
    public  String helo(){
        return "bol be.....";

    }


}
