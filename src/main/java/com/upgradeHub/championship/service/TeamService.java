package com.upgradeHub.championship.service;
import com.upgradeHub.championship.repository.TeamRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
}
