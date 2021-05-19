package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.models.GameMission;
import se.tankesmedjan.mapquestbackend.services.GameMissionService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/gamemission")
public class GameMissionController {

    private final GameMissionService gameMissionService;

    public GameMissionController(GameMissionService gameMissionService){
        this.gameMissionService = gameMissionService;
    }

    @PostMapping
    public GameMission addGameMission(@RequestBody GameMission gameMission){
        return gameMissionService.addGameMissions(gameMission);
    }

    @GetMapping()
    public List<GameMission> getMissionPointers(@RequestParam Long id){
        return gameMissionService.getMissionsPointers(id);
    }

    @DeleteMapping("/delete")
    public String deleteGameMission(@RequestParam Long id) {
        return "Successfully deleted the GameMission by the id of: " + gameMissionService.deleteGameMission(id).getId();
    }

}
