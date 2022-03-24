package com.jerryit.cognizantchallenge.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Task {
    REVERSE_STRING("REVERSE_STRING"),
    PRINT_HELLO_WORLD("PRINT_HELLO_WORLD"),
    FIBONACCI_ALGORITHM("FIBONACCI_ALGORITHM");

    private String value;
}