package com.upgradeHub.championship.controller;
import com.upgradeHub.championship.service.PlayerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
}
