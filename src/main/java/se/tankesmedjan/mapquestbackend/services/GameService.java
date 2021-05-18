package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.GameRepo;

@Service
public class GameService {

    private final GameRepo gameRepo;

    @Autowired
    public GameService(GameRepo gameRepo){
        this.gameRepo = gameRepo;
    }
}
