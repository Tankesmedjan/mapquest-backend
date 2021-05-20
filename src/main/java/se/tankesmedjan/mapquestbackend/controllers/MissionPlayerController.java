package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.MissionPlayerDTO;
import se.tankesmedjan.mapquestbackend.models.MissionPlayer;
import se.tankesmedjan.mapquestbackend.services.MissionPlayerService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/missionplayer")
public class MissionPlayerController {

    private final MissionPlayerService missionPlayerService;

    @Autowired
    public MissionPlayerController(MissionPlayerService missionPlayerService){
        this.missionPlayerService = missionPlayerService;
    }

    @PostMapping
    public MissionPlayerDTO addMissionPlayer(@RequestBody MissionPlayerDTO missionPlayerDTO){
        return missionPlayerService.addMissionPlayer(missionPlayerDTO);
    }

    @GetMapping
    public List<MissionPlayer> getMissionPlayer(){
        return missionPlayerService.getMissionPlayer();
    }

    @DeleteMapping("/delete")
    public String deleteMissionPlayer(@RequestParam Long id){
        return "Successfully deleted MissionPlayer with time: " + missionPlayerService.deletePlayer(id).getTimer().toString();
    }
}
