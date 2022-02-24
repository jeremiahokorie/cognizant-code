package com.jerryit.cognizantchallenge.service.serviceImpl;


import com.jerryit.cognizantchallenge.entity.Player;
import com.jerryit.cognizantchallenge.repository.PlayerRepository;
import com.jerryit.cognizantchallenge.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player createNewPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player updatePlayerDetail(Player player, Long id) {
        log.info("Inside Player Update Service {}");

        return playerRepository.findById(id)
                .map(p ->{
                    p.setPlayerName(player.getPlayerName());
                    p.setTask(player.getTask());
                   return playerRepository.save(player);
                })
                .orElseGet(()-> {
                    player.setId(id);
                   return playerRepository.save(player);
                });
    }

    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);

    }
}
