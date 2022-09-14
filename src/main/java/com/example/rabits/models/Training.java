package com.example.rabits.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type;
    private String tasks;

    public Training(String tasks, String type) {
        this.tasks = tasks.replace(System.lineSeparator(),"<br>");
    }
}
