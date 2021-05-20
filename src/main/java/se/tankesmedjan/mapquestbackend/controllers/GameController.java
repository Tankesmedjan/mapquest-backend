package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.GameDTO;
import se.tankesmedjan.mapquestbackend.models.Game;
import se.tankesmedjan.mapquestbackend.services.GameService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/game")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<Game> getGames() {
        return gameService.getGames();
    }

    @PostMapping
    public GameDTO addGame(@RequestBody GameDTO gameDTO) {
        return gameService.addGame(gameDTO);
    }

    @DeleteMapping("/delete")
    public String deleteGame(@RequestParam Long id) {
        return "Successfully deleted the game by the id of: " + gameService.deleteGame(id).getId();
    }
}
