package com.azureusers.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userdetails")
public class User {
    @Id
    int id;
    String name;
    String place;
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", age=" + age +
                '}';
    }

    public User(int id, String name, String place, int age) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.age = age;
    }

    public User() {
    }
}
