package com.jerryit.cognizantchallenge;

import com.jerryit.cognizantchallenge.entity.Player;
import com.jerryit.cognizantchallenge.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CognizantChallengeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CognizantChallengeApplication.class, args);
    }

    @Autowired
    private PlayerRepository playerRepository;


    @Override
    public void run(String... args) throws Exception {
//            Player player = new Player("Jerry","Coding","Java","System.out.print","System.out.print");
//            playerRepository.save(player);
//
//            Player player2 = new Player("John","Coding","C#","System.out.print","System.out.print");
//            playerRepository.save(player2);
//
//            Player player3 = new Player("Fred","Coding","React","System.out.print","System.out.print");
//            playerRepository.save(player3);

    }
}
