package com.jerryit.cognizantchallenge.model.response;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class AppResponse<T> {
    private T data;
    private int statusCode;
    private String message;
}
