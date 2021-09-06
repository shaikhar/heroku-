package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController()
public class Home {
    @GetMapping
    public ModelAndView home()
    {
        Object atik= "Atik";
//        return "Welcome to Demo page of Atik shaikh ";
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("Name", atik);
        return modelAndView;

    }
}
