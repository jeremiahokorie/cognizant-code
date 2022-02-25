package com.jerryit.cognizantchallenge.service.impl;

import com.jerryit.cognizantchallenge.model.response.ApiResponse;
import com.jerryit.cognizantchallenge.persistent.entity.Challenge;
import com.jerryit.cognizantchallenge.persistent.repository.ChallengeRepository;
import com.jerryit.cognizantchallenge.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService {

    @Autowired
    private ChallengeRepository challengeRepository;

    @Override
    public void submitChallenge() {


    }

    @Override
    public void fetchPlayerChallenge(Long playerId, Long challengeId) {

    }

    @Override
    public void fetchPlayerChallenges(Long playerId) {

    }

    @Override
    public void fetchPlayerChallenges() {

    }

    @Override
    public void saveChallenge(Challenge challenge) {
         challengeRepository.save(challenge);
    }
}
