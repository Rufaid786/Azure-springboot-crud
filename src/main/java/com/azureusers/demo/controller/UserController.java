package com.azureusers.demo.controller;


import com.azureusers.demo.entity.User;
import com.azureusers.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user-data")
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserServiceImpl service;


    @GetMapping("/users")
    public List<User> getAll() {
        return service.getAllusers();
    }

    @GetMapping("/user/{id}")
    public User getUserbyId(@PathVariable int id){
        return service.getUserbyid(id);
    }

    @PostMapping("/user")
    public String addUser(@RequestBody  User user) {
        return service.addUser(user);
    }

    @PutMapping("/updateUser")
    public User update(@RequestBody User usr){
        return service.updateUser(usr);
    }

    @DeleteMapping("/deleteuser/{uid}")
    public String delete(@PathVariable("uid") int uid){
        return service.deleteUser(uid);
    }


}
