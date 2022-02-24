package com.jerryit.cognizantchallenge.controller;


import com.jerryit.cognizantchallenge.domain.AppResponse;
import com.jerryit.cognizantchallenge.entity.Player;
import com.jerryit.cognizantchallenge.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Controller
@Slf4j
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public String fetchAllPlayer(Model model){
        model.addAttribute("players", playerService.getAllPlayers());
        return "players";
    }

    @GetMapping("/player/new")
    public String addPlayer(Model model){
        Player player = new Player();
        model.addAttribute("player",player);
        return "create_challenge";
    }

    @PostMapping("/players")
    public String savePlayer(@ModelAttribute("player") Player player){
        playerService.savePlayer(player);
        return "redirect:/players";
    }

    private static void getResult(@RequestBody Player player)
    {
        final String uri = "https://api.jdoodle.com/v1/execute";
        final String clientId = "93db56482846001f0e2ce523c83bb5aa";
        final String clientSecrete = "8579ba0435230798b53e3397cb0292786ea2047c18184fc754a629be5b221c50";

        RestTemplate restTemplate = new RestTemplate();
        Player player1 = new Player();
        player1.setClientId(clientId);
        player1.setClientSecret(clientSecrete);
        player1.setScript(player.getScript());
        player1.setLanguage(player.getLanguage());
        player1.setVersionIndex("0");

        String result = restTemplate.getForObject(uri + player1,String.class);

        System.out.println(result);
    }


        @PutMapping("/player/{id}")
        public Player updatePlayerDetail(@RequestBody Player player, @PathVariable Long id){
            return playerService.updatePlayerDetail(player,id);
        }

//    @PostMapping("/player")
//    public ResponseEntity<AppResponse<Player>> savePlayer(@RequestBody Player player){
//        Player player1 = playerService.createNewPlayer(player);
//        log.info("Save new Player {}  "+player1);
//
//        return ResponseEntity.ok().body(AppResponse.<Player>builder()
//                .data(player1)
//                .message("success")
//                .statusCode(200)
//                .build());
//    }



}
