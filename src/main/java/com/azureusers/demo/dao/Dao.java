package com.azureusers.demo.dao;

import com.azureusers.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Dao extends JpaRepository<User, Integer> {
}
