package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.GameMission;
import se.tankesmedjan.mapquestbackend.repositories.GameMissionRepo;

import java.util.List;

@Service
public class GameMissionService {

    private final GameMissionRepo gameMissionRepo;

    @Autowired
    public GameMissionService(GameMissionRepo gameMissionRepo){
        this.gameMissionRepo = gameMissionRepo;
    }

    public GameMission addGameMissions(GameMission gameMission) {
        return gameMissionRepo.save(gameMission);
    }

    public List<GameMission> getMissions() {
        return gameMissionRepo.findAll();
    }
}
