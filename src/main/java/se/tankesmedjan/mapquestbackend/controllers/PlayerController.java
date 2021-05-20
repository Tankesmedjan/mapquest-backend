package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.PlayerDTO;
import se.tankesmedjan.mapquestbackend.models.Player;
import se.tankesmedjan.mapquestbackend.services.PlayerService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) { this.playerService = playerService; }

    @GetMapping
    public List<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @PostMapping
    public PlayerDTO addPlayer(@RequestBody PlayerDTO player) {
        return playerService.addPlayer(player);
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam String id) {
        return "Successfully deleted the player: " + playerService.deletePlayer(id).getName();
    }
}
