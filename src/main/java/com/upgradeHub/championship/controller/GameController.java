package com.upgradeHub.championship.controller;
import com.upgradeHub.championship.service.GameService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }
}
