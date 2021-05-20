package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.tankesmedjan.mapquestbackend.models.MissionPlayer;
import se.tankesmedjan.mapquestbackend.services.MissionPlayerService;
import se.tankesmedjan.mapquestbackend.services.MissionQAService;

@CrossOrigin
@RestController
@RequestMapping("/api/missionplayer")
public class MissionPlayerController {

    private final MissionPlayerService missionPlayerService;

    @Autowired
    public MissionPlayerController(MissionPlayerService missionPlayerService){
        this.missionPlayerService = missionPlayerService;
    }
}
