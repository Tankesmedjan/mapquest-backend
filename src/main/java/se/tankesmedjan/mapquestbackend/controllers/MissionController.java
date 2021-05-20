package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.MissionDTO;
import se.tankesmedjan.mapquestbackend.models.Mission;
import se.tankesmedjan.mapquestbackend.repositories.MissionRepo;
import se.tankesmedjan.mapquestbackend.services.MissionService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/mission")
public class MissionController {

    private final MissionService missionService;

    @Autowired
    public MissionController(MissionService missionService){
        this.missionService = missionService;
    }

    @PostMapping
    public MissionDTO addMission(@RequestBody MissionDTO mission){
        return missionService.addMissions(mission);
    }

    @GetMapping
    public List<Mission> getMissions(){
        return missionService.getAllMissions();
    }

    @DeleteMapping("/delete")
    public String deleteMissions(@RequestParam Long id){
        return "Successfully deleted: " + missionService.deleteMission(id).getMissionName();
    }
}
