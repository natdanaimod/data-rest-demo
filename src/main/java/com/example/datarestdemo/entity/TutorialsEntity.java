package com.example.datarestdemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TutorialsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subtitle;

    @Column(name = "description")
    private String description;
}
