package com.jerryit.cognizantchallenge.service;


import com.jerryit.cognizantchallenge.persistent.entity.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();

    Player createNewPlayer(Player player);

    Player updatePlayerDetail(Player player, Long id);

    Player savePlayer(Player player);
}
