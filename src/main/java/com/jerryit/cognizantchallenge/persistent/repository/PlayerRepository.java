package com.jerryit.cognizantchallenge.persistent.repository;

import com.jerryit.cognizantchallenge.persistent.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
