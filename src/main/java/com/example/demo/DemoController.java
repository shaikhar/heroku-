package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;
import java.util.stream.DoubleStream;

@RestController
public class DemoController {
    @Autowired
    repository rs;

    @GetMapping("/test")
public String test()
{
    User user=new User();
    UUID uniqueID = UUID.randomUUID();
    user.setId(uniqueID.toString());
    user.setName("Atik Its Working ");
    rs.save(user);
    return "its working ";
}
}
