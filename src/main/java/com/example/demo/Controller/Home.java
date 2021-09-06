package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Home {
    @GetMapping
    public String home()
    {
        return "Welcoem to Demo page of Atik shaikh ";
    }
}
