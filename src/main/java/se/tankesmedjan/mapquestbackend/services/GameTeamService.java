package se.tankesmedjan.mapquestbackend.services;

import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.GameTeamRepo;

@Service
public class GameTeamService {

    private final GameTeamRepo gameTeamRepo;

    public GameTeamService(GameTeamRepo gameTeamRepo){
        this.gameTeamRepo = gameTeamRepo;
    }
}
