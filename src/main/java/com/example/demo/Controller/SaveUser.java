package com.example.demo.Controller;

import com.example.demo.Model.Getapiuser;
import com.example.demo.repositoryforapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;
@RestController

public class SaveUser {

    @Autowired
    repositoryforapi apirepo;

    @GetMapping("/save")

    public ResponseEntity<?> saveuser() {

        UUID uuid= UUID.randomUUID();
        Random random=new Random();

        int sr= random.nextInt(10000) + 20000;
//getapiuser.setId(78);

//        getapiuser.setGender("Male");
//        getapiuser.setEmail(uuid.toString() +"@gmail.com");
//        getapiuser.setName(uuid.toString());
//        getapiuser.setStatus("Best Technical Person ");

        Getapiuser getapiuser= new Getapiuser("Atik"+sr,uuid.toString()+"@gmail.com","M", "Best Technical Person ");



        apirepo.save(getapiuser);

        return new ResponseEntity<>(  getapiuser, HttpStatus.OK);

         }
}
