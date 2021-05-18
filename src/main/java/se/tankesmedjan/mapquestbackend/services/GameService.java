package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.Game;
import se.tankesmedjan.mapquestbackend.repositories.GameRepo;

import java.util.List;

@Service
public class GameService {

    private final GameRepo gameRepo;

    @Autowired
    public GameService(GameRepo gameRepo){
        this.gameRepo = gameRepo;
    }

    public List<Game> getGames() {
        return gameRepo.findAll();
    }

    public Game addGame(Game game) {
        return gameRepo.save(game);
    }
}
