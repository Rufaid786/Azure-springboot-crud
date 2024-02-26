package com.azureusers.demo.service;

import com.azureusers.demo.entity.User;

import java.util.List;

public interface Userservice {

   String addUser(User user);
   List<User> getAllusers();
   User getUserbyid(int id);
   String deleteUser(int id);
   User updateUser(User userid);

}
