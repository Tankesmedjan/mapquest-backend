package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

    @PostMapping
    public PlayerDTO addPlayer(@RequestBody PlayerDTO player) {
        return playerService.addPlayer(player);
    }

    @GetMapping
    public List<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @DeleteMapping("/delete")
    public String deletePlayer(@Param("id") Long id) {
        return "Successfully deleted the player: " + playerService.deletePlayer(id).getName();
    }
}
