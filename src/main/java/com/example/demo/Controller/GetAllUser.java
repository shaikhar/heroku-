package com.example.demo.Controller;

import com.example.demo.Model.Getapiuser;
import com.example.demo.repositoryforapi;
import io.swagger.models.Response;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class GetAllUser {
    @Autowired
    private repositoryforapi rs;
    @Autowired
    private Getapiuser getapiuser;

    @GetMapping("/getall")

    public ResponseEntity<Object> getallusers() {
        List<Getapiuser> list = new ArrayList<>();
        list = rs.findAll();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping ("/get/{id}")
    public ResponseEntity<?> getuserbyidget(@PathVariable int id) throws MyCustomeException {
        System.out.println(id);

        Getapiuser byId = rs.getById(id);
        // Optional byIdop= Optional.of(byId);
        return ResponseEntity.ok(byId);

    }
    @PutMapping ("/get/{id}")
    public ResponseEntity<?> getuserbyid(@PathVariable int id) throws Exception {
        System.out.println(id);
        getapiuser = rs.getById(id);

        // Optional byIdop= Optional.of(byId);
        return ResponseEntity.ok(getapiuser);

    }
}
