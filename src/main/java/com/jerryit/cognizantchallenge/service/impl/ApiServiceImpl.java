package com.jerryit.cognizantchallenge.service.impl;

import com.jerryit.cognizantchallenge.exception.CustomException;
import com.jerryit.cognizantchallenge.model.config.apiConfig;
import com.jerryit.cognizantchallenge.model.request.ApiRequest;
import com.jerryit.cognizantchallenge.model.response.ApiResponse;
import com.jerryit.cognizantchallenge.service.ApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApiServiceImpl implements ApiService {

    private final RestTemplate restTemplate;
    private final apiConfig apiConfig;

    @Override
    public ApiResponse execute(String script, String lang) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            ApiRequest request = ApiRequest.builder()
                    .clientId(apiConfig.getClientId())
                    .clientSecret(apiConfig.getClientSecret())
                    .language(lang)
                    .script(script)
                    .build();
            HttpEntity<?> entity = new HttpEntity<>(request, headers);
            log.info("Request Resp {}  "+ request.toString());

            log.info("res ++ {} 0");
            ApiResponse res =  restTemplate.exchange(apiConfig.getBaseUrl(), HttpMethod.POST, entity, ApiResponse.class).getBody();
            log.info("res ++ {} 1");
            log.info("res ++ {} "+res.toString());
            return res;
        } catch (HttpClientErrorException e) {
            throw new CustomException(e.getMessage(), e.getStatusCode());
        }
    }


}
