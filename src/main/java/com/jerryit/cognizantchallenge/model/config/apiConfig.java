package com.jerryit.cognizantchallenge.model.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.io.Serializable;

@ConstructorBinding
@ConfigurationProperties(prefix = "app.api")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class apiConfig implements Serializable {

    private String baseUrl;
    private String clientId;
    private String clientSecret;
}
