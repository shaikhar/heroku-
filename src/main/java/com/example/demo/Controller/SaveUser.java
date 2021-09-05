package com.example.demo.Controller;

import com.example.demo.Model.Getapiuser;
import com.example.demo.repositoryforapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
public class SaveUser {

    @Autowired
    repositoryforapi apirepo;

    @GetMapping("/save")

    public ResponseEntity<?> saveuser() {

        UUID uuid= UUID.randomUUID();

//getapiuser.setId(78);

//        getapiuser.setGender("Male");
//        getapiuser.setEmail(uuid.toString() +"@gmail.com");
//        getapiuser.setName(uuid.toString());
//        getapiuser.setStatus("Best Technical Person ");

        Getapiuser getapiuser= new Getapiuser("Male","test@gmail.com","Atik", "Best Technical Person ");


        apirepo.save(getapiuser);

        return new ResponseEntity<>("HI I have saved USer "+getapiuser, HttpStatus.OK);

         }
}
