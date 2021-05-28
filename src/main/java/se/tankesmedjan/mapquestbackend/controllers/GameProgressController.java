package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.models.GameProgress;
import se.tankesmedjan.mapquestbackend.services.GameProgressService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/gameprogress")
public class GameProgressController {

    private final GameProgressService gameProgressService;

    @Autowired
    public GameProgressController(GameProgressService gameProgressService) {
        this.gameProgressService = gameProgressService;
    }

    @GetMapping
    public GameProgress getGameProgress(@Param("id") String id) {
        return gameProgressService.getGameProgress(id);
    }

    @PostMapping
    public GameProgress addGameProgress(@RequestBody GameProgress gameProgress) {
        return gameProgressService.addGameProgress(gameProgress);
    }

}
