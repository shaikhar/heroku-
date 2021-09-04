package com.example.demo.Controller;

import com.example.demo.Model.Getapiuser;
import com.example.demo.Model.Pagination;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GetAPidata {

    @Autowired
    RestTemplate rs;
     Getapiuser getapiuser1=new Getapiuser();
     Pagination p=new Pagination();
    ObjectMapper om = new ObjectMapper();
    @GetMapping("/hitapi")
    public ResponseEntity<?> hitapi()
    {


        String repsone;
        repsone = rs.getForObject("https://gorest.co.in/public/v1/users", String.class);
        try {
             p = om.readValue((repsone),Pagination.class );
            // getapiuser1.setName("I hitted url ");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

//        List<Getapiuser> list=new ArrayList<>();
//    list= (List<Getapiuser>) rs.getForObject("https://gorest.co.in/public/v1/users",Getapiuser.class);


        return new ResponseEntity<>(p, HttpStatus.OK);
    }

@GetMapping("/test1")
    public String test1()
{
    if (true)
   throw  new ArithmeticException("THis is arithexe");
    return "I am inside test1";

}
}
