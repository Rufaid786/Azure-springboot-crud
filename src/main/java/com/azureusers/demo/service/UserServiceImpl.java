package com.azureusers.demo.service;


import com.azureusers.demo.dao.Dao;
import com.azureusers.demo.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements Userservice{
    @Autowired
    Dao dao;

    @Override
    public String addUser(User user) {
        Optional<User> us=dao.findById(user.getId());
        if(us.isEmpty()){
        dao.save(user);
        return "User added successfully with id "+user.getId();
        }
        else{
            return "user cannot be added..please recheck the details provided";
        }
    }

    @Override
    public List<User> getAllusers() {
        return dao.findAll();
    }

    @Override
    public User getUserbyid(int id) {
        Optional<User> user=dao.findById(id);
        if(user.isEmpty()){
            return null;
        }else{
            return user.get();
        }
    }

    @Override
    public String deleteUser(int id) {
        Optional<User> us=dao.findById(id);
        if(us.isEmpty()){
            return "User cannot be deleted";
        }else{
            dao.deleteById(id);
            return "Employee deleted succesfully";
        }
    }

    @Override
    public User updateUser(User user) {
        Optional<User> us=dao.findById(user.getId());
        if(us.isEmpty()){
            return null;
        }else{
            return dao.save(user);
        }

    }
}
