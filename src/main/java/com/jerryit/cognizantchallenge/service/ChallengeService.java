package com.jerryit.cognizantchallenge.service;

import com.jerryit.cognizantchallenge.model.response.ApiResponse;
import com.jerryit.cognizantchallenge.persistent.entity.Challenge;

public interface ChallengeService {

    public void submitChallenge();

    public void fetchPlayerChallenge(Long playerId, Long challengeId);

    public void fetchPlayerChallenges(Long playerId);

    public void fetchPlayerChallenges();

    void saveChallenge(Challenge challenge);
}
