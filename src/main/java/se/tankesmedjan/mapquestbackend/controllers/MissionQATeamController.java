package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.models.MissionQATeam;
import se.tankesmedjan.mapquestbackend.services.MissionQATeamService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/missionqateam")
public class MissionQATeamController {

    private final MissionQATeamService missionQATeamService;

    @Autowired
    public MissionQATeamController(MissionQATeamService missionQATeamService){
        this.missionQATeamService = missionQATeamService;
    }

    @PostMapping
    public MissionQATeam addMissionQATeam(@RequestBody MissionQATeam missionQATeam){
        return missionQATeamService.addMissionQATeam(missionQATeam);
    }

    @GetMapping
    public List<MissionQATeam> getMissionQATeam(){
        return missionQATeamService.getMissionQATeam();
    }
}
