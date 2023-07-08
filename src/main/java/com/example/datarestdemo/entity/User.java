package com.example.datarestdemo.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "users", types = { UserEntity.class })
public interface User {

    String getName();
    int getAge();
    String getEmail();
}
