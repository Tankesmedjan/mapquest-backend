package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.models.GameProgress;
import se.tankesmedjan.mapquestbackend.services.GameProgressService;

@CrossOrigin
@RestController
@RequestMapping("/api/gameprogress")
public class GameProgressController {

    private final GameProgressService gameProgressService;

    @Autowired
    public GameProgressController(GameProgressService gameProgressService) {
        this.gameProgressService = gameProgressService;
    }

    @PostMapping
    public GameProgress addGameProgress(@RequestBody GameProgress gameProgress) {
        return gameProgressService.addGameProgress(gameProgress);
    }

}
