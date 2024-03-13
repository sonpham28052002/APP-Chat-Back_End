package vn.edu.iuh.fit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.entities.User;
import vn.edu.iuh.fit.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.finAll();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId){
        return userService.findById(userId);
    }
}
