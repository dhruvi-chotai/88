package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
    @Id
    @Column(name= "id", nullable = false)
    private Long id;

    private String name;
    private int Age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    private String Address;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id=id;
    }
}
