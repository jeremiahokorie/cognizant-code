package com.jerryit.cognizantchallenge.persistent.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "challenges")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Challenge implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "script", length = 100_000)
    private String script;

    @Column(name = "language", length = 120)
    private String language;

    @Column(name = "result", length = 1_000)
    private Boolean result;

    @Column(name = "task", length = 500)
    private String task;

    @Column(name = "output", length = 1_000)
    private String output;

    @ManyToOne
    @JoinColumn(name = "player_fk")
    private Player player;
}