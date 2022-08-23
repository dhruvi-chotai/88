package com.example.demo.models;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
    @Id
    @Column(name= "id", nullable = false)
    private int id;

    private String name;
    private int Age;

    private String Address;

    public Patient(int id, String name, int Age, String Address) {
        this.id=id;
        this.name = name;
        this.Address = Address;
        this.Age = Age;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }




    public int getPatientId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }




}
