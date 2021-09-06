package com.example.demo;

import com.example.demo.Model.Getapiuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface repositoryforapi extends JpaRepository<Getapiuser, Integer> {



//    @Query( "select u from AppUser u JOIN FETCH u.AppRole r where r.role_name = :roleName" )
//    List<User> findBySpecificRoles(@Param("roleName") String roleName);

}
