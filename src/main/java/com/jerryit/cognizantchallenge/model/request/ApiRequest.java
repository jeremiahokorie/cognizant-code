package com.jerryit.cognizantchallenge.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ApiRequest implements Serializable {

    @Builder.Default
    private String versionIndex = "0";
    @Builder.Default
    private String language = "java";
    private String script;
    private String clientId;
    private String clientSecret;
}
