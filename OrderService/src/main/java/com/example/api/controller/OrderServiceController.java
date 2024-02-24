package com.example.api.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController()
@RequestMapping("/orders")
public class OrderServiceController {

    @GetMapping("/")
    public String serviceTwo(){
        return "This will return orders";
    }

    @GetMapping("/check")
    public String check(Principal principal){
        System.out.println(principal);
        return "This will return orders";
    }



}
