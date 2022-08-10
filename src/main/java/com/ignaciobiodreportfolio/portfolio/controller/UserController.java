
package com.ignaciobiodreportfolio.portfolio.controller;

import com.ignaciobiodreportfolio.portfolio.models.User;
import com.ignaciobiodreportfolio.portfolio.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/User")
public class UserController {
    private final UserService userService;
    
    public UserController(UserService userService){
    this.userService = userService;
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<User> gethttpUser(@PathVariable("id") Long id){
        User user = userService.findUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<User> editUser(@RequestBody User user){
        User updatedUser = userService.editUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
}

