package com.jerryit.cognizantchallenge.persistent.repository;

import com.jerryit.cognizantchallenge.persistent.entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
}
