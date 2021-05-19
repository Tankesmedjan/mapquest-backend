package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.models.GameMission;
import se.tankesmedjan.mapquestbackend.services.GameMissionService;

import java.util.List;

@CrossOrigin(origins = "https://localhost:3000")
@RestController
@RequestMapping("/api/gamemission")
public class GameMissionController {

    private final GameMissionService gameMissionService;

    public GameMissionController(GameMissionService gameMissionService){
        this.gameMissionService = gameMissionService;
    }

    @PostMapping
    public GameMission addGameMission(GameMission gameMission){
        return gameMissionService.addGameMissions(gameMission);
    }

    @GetMapping()
    public List<GameMission> getMissionPointers(@RequestParam Long id){
        return gameMissionService.getMissionsPointers(id);
    }

}
