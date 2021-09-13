package com.example.demo.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class Hitter {
    private String message;

    @GetMapping("/hitit/{hitint}")
    public ResponseEntity<?> hitit(@PathVariable int hitint)
    {

//        return "Inside hit it ";
        try{
            URL url=new URL("https://demoatik.herokuapp.com/save");
            // URL url=new URL("http://localhost:8080/contact");
            //HttpURLConnection huc=(HttpURLConnection)url.openConnection();
            for(int i=1;i<=hitint;i++){
                HttpURLConnection huc=(HttpURLConnection)url.openConnection();
                message =   String.valueOf((huc.getResponseCode()));
                huc.disconnect();

            }


        }catch(Exception e){System.out.println(e);
            message = e.getMessage();
        }

        return ResponseEntity.ok("I have hitted url with "+hitint+ "time and \n Created  "+hitint+ "Users ");
    }


    @GetMapping(value = "/greetings",  consumes="application/json-atik")

    public ResponseEntity<?> addGreeting( ) {
        //return "Inside application/json ";
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>("{\"test\": \"Hello with ResponseEntity with jason consumes\"}", httpHeaders, HttpStatus.OK);
    }
    @GetMapping(value = "/greetings",  consumes="application/json-valid")

    public ResponseEntity<?> addGreeting1( ) {
        //return "Inside application/json ";
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>("{\"test\": \"Hello with ResponseEntity with valid consumes \"}", httpHeaders, HttpStatus.OK);
    }





}
