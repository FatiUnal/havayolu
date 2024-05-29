package org.example.havayolu.controller;

import org.example.havayolu.dto.user.CreateUserDto;
import org.example.havayolu.entity.Users;
import org.example.havayolu.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping
    public ResponseEntity<Users> createUSers(@RequestBody CreateUserDto createUserDto){
        return new ResponseEntity<>(usersService.createUser(createUserDto), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<Users> login(@RequestParam String tc,@RequestParam String password){
        return new ResponseEntity<>(usersService.loginUser(tc,password),HttpStatus.OK);
    }
}
