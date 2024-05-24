package com.example.cjhfirstproject.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Department {
    public Integer id;
    public String dept_name;
    public String description;
    public String address;

    public List<User> users;

    public Department(Integer id, String dept_name, String description, String address) {
        this.id = id;
        this.dept_name = dept_name;
        this.description = description;
        this.address = address;
    }
    public Department() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
