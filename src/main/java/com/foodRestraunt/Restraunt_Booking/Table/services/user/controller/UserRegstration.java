package com.foodRestraunt.Restraunt_Booking.Table.services.user.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api/v1")
public class UserRegstration {


    @GetMapping("/")
    public String getMethodName() {
        return "hello";
    }
    
    
}
