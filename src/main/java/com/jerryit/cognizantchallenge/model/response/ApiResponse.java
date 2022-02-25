package com.jerryit.cognizantchallenge.model.response;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ApiResponse implements Serializable {
    private String output;
    private Integer statusCode;
    private Long memory;
    private Double cpuTime;
}
