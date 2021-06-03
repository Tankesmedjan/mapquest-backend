package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.GameDTO;
import se.tankesmedjan.mapquestbackend.dto.StoryDTO;
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

    @PostMapping
    public GameDTO addGame(@RequestBody GameDTO gameDTO) {
        return gameService.addGame(gameDTO);
    }

    @GetMapping
    public List<Game> getGames() {
        return gameService.getGames();
    }

    @GetMapping("/select")
    public List<Game> getGameByUserId(@Param("id") String id){
        return gameService.getGameByUserId(id);
    }

    @DeleteMapping("/delete")
    public String deleteGame(@Param("id") Long id) {
        return "Successfully deleted the game by the id of: " + gameService.deleteGame(id).getId();
    }
    @PutMapping("/edit")
    public GameDTO editGame(@Param("id") Long id, @RequestBody GameDTO gameDTO) {
        return gameService.editGame(id, gameDTO);
    }
}
