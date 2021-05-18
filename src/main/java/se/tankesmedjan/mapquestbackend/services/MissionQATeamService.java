package se.tankesmedjan.mapquestbackend.services;

import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.MissionQATeamRepo;

@Service
public class MissionQATeamService {

    private final MissionQATeamRepo missionQATeamRepo;

    public MissionQATeamService(MissionQATeamRepo missionQATeamRepo){
        this.missionQATeamRepo = missionQATeamRepo;
    }
}