package com.jerryit.cognizantchallenge.service;

import com.jerryit.cognizantchallenge.model.response.ApiResponse;


public interface ApiService {

    public ApiResponse execute(String script, String lang);

}
