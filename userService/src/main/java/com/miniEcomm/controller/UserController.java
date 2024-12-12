package com.miniEcomm.controller;

import com.miniEcomm.model.Users;
import com.miniEcomm.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/user/greet")
    public String greetUser() {
        return "hello user!!!";
    }


    @GetMapping("/admin/greet")
    public String greetAdmin() {
        return "hello Admin!!!";
    }

    @PostMapping("/register")
    public ResponseEntity<Users> registerUser(@RequestBody Users user) {
        Users response = usersRepository.save(user);
        return ResponseEntity.ok(response);
    }
}
