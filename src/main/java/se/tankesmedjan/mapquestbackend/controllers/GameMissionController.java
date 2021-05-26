package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.GameMissionDTO;
import se.tankesmedjan.mapquestbackend.models.GameMission;
import se.tankesmedjan.mapquestbackend.services.GameMissionService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/gamemission")
public class GameMissionController {

    private final GameMissionService gameMissionService;

    @Autowired
    public GameMissionController(GameMissionService gameMissionService){
        this.gameMissionService = gameMissionService;
    }

    @PostMapping
    public GameMissionDTO addGameMission(@RequestBody GameMissionDTO gameMissionDTO){
        return gameMissionService.addGameMissions(gameMissionDTO);
    }

    @GetMapping
    public List<GameMission> getMissionPointers(@Param("id") Long id){
        return gameMissionService.getMissionsPointers(id);
    }

    @DeleteMapping("/delete")
    public String deleteGameMission(@Param("id") Long id) {
        return "Successfully deleted the GameMission by the id of: " + gameMissionService.deleteGameMission(id).getId();
    }


}
