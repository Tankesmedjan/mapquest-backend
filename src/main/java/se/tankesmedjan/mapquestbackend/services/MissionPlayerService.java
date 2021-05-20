package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.MissionPlayer;
import se.tankesmedjan.mapquestbackend.repositories.MissionPlayerRepo;

import java.util.List;

@Service
public class MissionPlayerService {

    private final MissionPlayerRepo missionPlayerRepo;

    @Autowired
    public MissionPlayerService(MissionPlayerRepo missionPlayerRepo){
        this.missionPlayerRepo = missionPlayerRepo;
    }

    public MissionPlayer addMissionPlayer(MissionPlayer missionPlayer) {
        return missionPlayerRepo.save(missionPlayer);
    }

    public List<MissionPlayer> getMissionPlayer() {
        return missionPlayerRepo.findAll();
    }
}
