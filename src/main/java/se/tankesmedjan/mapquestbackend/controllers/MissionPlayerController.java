package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    public MissionPlayer addMissionPlayer(MissionPlayer missionPlayer){
        return missionPlayerService.addMissionPlayer(missionPlayer);
    }

    @GetMapping
    public List<MissionPlayer> getMissionPlayer(){
        return missionPlayerService.getMissionPlayer();
    }
}
