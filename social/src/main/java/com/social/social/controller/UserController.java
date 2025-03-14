package com.social.social.controller;


import com.social.social.entities.User;
import com.social.social.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

@Autowired
private UserService userService;


private static final Logger LOGGER= LoggerFactory.getLogger(UserService.class);

    @PostMapping(value = "/newUser")
    public ResponseEntity<User> saveUser(@RequestBody User user){

        LOGGER.info("user to save "+ user);
        User newUser = userService.saveUser(user);

        return  new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
}
