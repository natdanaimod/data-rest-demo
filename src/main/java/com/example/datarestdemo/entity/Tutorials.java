package com.example.datarestdemo.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "tutorials", types = { Tutorials.class })
public interface Tutorials {

    String getTitle();
    String getSubtitle();
    String getDescription();
}
