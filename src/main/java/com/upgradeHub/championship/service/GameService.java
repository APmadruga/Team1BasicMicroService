package com.upgradeHub.championship.service;
import com.upgradeHub.championship.repository.GameRepository;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
}
