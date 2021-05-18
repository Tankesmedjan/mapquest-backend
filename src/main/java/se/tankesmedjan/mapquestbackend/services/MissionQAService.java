package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.MissionQARepo;

@Service
public class MissionQAService {

    private final MissionQARepo missionQARepo;

    @Autowired
    public MissionQAService(MissionQARepo missionQARepo){
        this.missionQARepo = missionQARepo;
    }
}
