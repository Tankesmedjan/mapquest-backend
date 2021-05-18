package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.MissionRepo;

@Service
public class MissionService {

    private final MissionRepo missionRepo;

    @Autowired
    public MissionService(MissionRepo missionRepo){
        this.missionRepo = missionRepo;
    }
}
