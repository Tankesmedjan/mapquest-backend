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

    /**
     * Basic method for getting a list of all Games.
     *
     * @return the list of all Games.
     */
    public List<Game> getGames() {
        return gameRepo.findAll();
    }

    /**
     * Basic method for adding a Game.
     * @param game the body of an Game.
     * @return saves the Game.
     */
    public Game addGame(Game game) {
        return gameRepo.save(game);
    }

    /**
     * Basic method for deleting a specific Game.
     * @param id the ID of the Game to be deleted.
     * @return deletes the chosen Game.
     */
    public Game deleteGame(Long id) {
        Game game = gameRepo.findGameById(id);
        gameRepo.delete(game);
        return game;
    }
}
