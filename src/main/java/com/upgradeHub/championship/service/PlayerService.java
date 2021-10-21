package com.upgradeHub.championship.service;
import com.upgradeHub.championship.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
}
