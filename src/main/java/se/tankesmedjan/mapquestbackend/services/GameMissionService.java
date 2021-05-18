package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.GameMissionRepo;

@Service
public class GameMissionService {

    private final GameMissionRepo gameMissionRepo;

    @Autowired
    public GameMissionService(GameMissionRepo gameMissionRepo){
        this.gameMissionRepo = gameMissionRepo;
    }
}
