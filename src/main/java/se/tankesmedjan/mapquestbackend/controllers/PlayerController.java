package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.models.Player;
import se.tankesmedjan.mapquestbackend.services.PlayerService;

import java.util.List;

@RestController
@RequestMapping
public class PlayerController {


    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) { this.playerService = playerService; }

    @GetMapping
    public List<Player> getPlayers() { return playerService.getPlayers();}

    @PostMapping
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player); }
}
