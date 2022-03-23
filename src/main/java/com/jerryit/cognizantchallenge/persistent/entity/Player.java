package com.jerryit.cognizantchallenge.persistent.entity;

import com.jerryit.cognizantchallenge.model.enums.ProgrammingLanguage;
import com.jerryit.cognizantchallenge.model.enums.Task;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "players")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "player_name", length = 120)
    private String playerName;

    @Column(name = "task", length = 100)
    @Enumerated(EnumType.STRING)
    private Task task;

    @Column(name = "language", length = 100)
    @Enumerated(EnumType.STRING)
    private ProgrammingLanguage language;

    @Column(name = "description", length = 5_000)
    private String description;

    @Column(name = "script", length = 100_000)
    private String script;

    @Column(name = "output", length = 1_000)
    private String output;

    @Column(name = "status_code", length = 3)
    private Integer statusCode;

    @Column(name = "memory", length = 8)
    private Long memory;

    @Column(name = "cpu_time", length = 8)
    private Double cpuTime;


}