package com.jerryit.cognizantchallenge.persistent.entity;

import com.jerryit.cognizantchallenge.model.enums.ProgrammingLanguage;
import com.jerryit.cognizantchallenge.model.enums.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playerName;
    private Task task;
    private ProgrammingLanguage language;
    private String description;
    private String script;
    private String output;
    private Integer statusCode;
    private Integer memory;
    private Integer cpuTime;

}
