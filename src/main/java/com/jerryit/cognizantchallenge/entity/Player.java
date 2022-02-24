package com.jerryit.cognizantchallenge.entity;

import com.jerryit.cognizantchallenge.enums.ProgrammingLanguage;
import com.jerryit.cognizantchallenge.enums.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    private String script;
    private String solution;
    private String description;
    private transient String clientId;
    private transient String clientSecret;
    private transient String versionIndex;



}
