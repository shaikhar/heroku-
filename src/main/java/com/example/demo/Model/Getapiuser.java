package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data

@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Getapiuser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String id;
    public String name;
    public String email;
    public String gender;
    public String status;
}
