package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Data

@NoArgsConstructor


@Entity
@Table(name = "GETAPIUSER")
@SequenceGenerator(name="empid", initialValue = 2000)  //(name="empid", sequenceName = "demo",initialValue = 2000,allocationSize = 2,schema = "demo")
//remeber taht for heroku postsql it doesnt allow this much sequence generator only allows value

@Service
public class Getapiuser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "empid")
    public int id;
    public String name;
    public String email;
    public String gender;
    public String status;

    public Getapiuser(String name, String email, String gender, String status) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.status = status;
    }
}
