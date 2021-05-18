package se.tankesmedjan.mapquestbackend.services;

import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.MissionPlayerRepo;

@Service
public class MissionPlayerService {

    private final MissionPlayerRepo missionPlayerRepo;

    public MissionPlayerService(MissionPlayerRepo missionPlayerRepo){
        this.missionPlayerRepo = missionPlayerRepo;
    }
}
