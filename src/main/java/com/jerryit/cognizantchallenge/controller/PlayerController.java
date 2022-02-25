package com.jerryit.cognizantchallenge.controller;


import com.jerryit.cognizantchallenge.model.response.ApiResponse;
import com.jerryit.cognizantchallenge.persistent.entity.Challenge;
import com.jerryit.cognizantchallenge.persistent.entity.Player;
import com.jerryit.cognizantchallenge.service.ApiService;
import com.jerryit.cognizantchallenge.service.ChallengeService;
import com.jerryit.cognizantchallenge.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@Controller
@Slf4j
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private ApiService apiService;

    @Autowired
    ChallengeService challengeService;

    private ApiResponse apiResponse;

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
       ApiResponse apiResponses =  apiService.execute(player.getScript(),player.getLanguage().toString());
       log.info("api resp {} ",apiResponses);
       player.setOutput(apiResponses.getOutput());
       player.setStatusCode(apiResponses.getStatusCode());

       playerService.savePlayer(player);
        return "redirect:/players";
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
