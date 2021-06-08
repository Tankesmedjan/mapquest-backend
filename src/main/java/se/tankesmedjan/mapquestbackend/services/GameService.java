package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.GameDTO;
import se.tankesmedjan.mapquestbackend.mappers.GameMapper;
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
     * @param gameDTO the body of an Game.
     * @return saves the Game.
     */
    public GameDTO addGame(GameDTO gameDTO) {
        Game game = GameMapper.INSTANCE.dtoToGame(gameDTO);

        gameRepo.save(game);
        return gameDTO;
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

    public GameDTO editGame(Long id, GameDTO gameDTO) {
        Game gameToEdit = gameRepo.findGameById(id);
        gameToEdit.setLng(gameDTO.getLng());
        gameToEdit.setLat(gameDTO.getLat());
        gameRepo.save(gameToEdit);
        return gameDTO;
    }


    public List<Game> getGameByUserId(String id) {
        return gameRepo.findGameByUserId(id);
    }

    /**
     * Basic method for getting a specific Game.
     * @param id the ID of the Game.
     * @return the chosen Game.
     */
    public Game getSpecificGame(Long id) {
        return gameRepo.findGameById(id);
    }
}
