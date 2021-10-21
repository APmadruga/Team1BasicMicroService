package com.upgradeHub.championship.controller;
import com.upgradeHub.championship.service.TeamService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }
}
