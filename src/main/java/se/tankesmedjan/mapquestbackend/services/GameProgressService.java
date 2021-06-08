package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.GameProgress;
import se.tankesmedjan.mapquestbackend.repositories.GameProgressRepo;

import java.util.List;

@Service
public class GameProgressService {

    private final GameProgressRepo gameProgressRepo;

    @Autowired
    public GameProgressService(GameProgressRepo gameProgressRepo) {
        this.gameProgressRepo = gameProgressRepo;
    }

    /**
     * Basic method for saving GameProgress
     * @param gameProgress the body of a GameProgress entity
     * @return saves the GameProgress
     */
    public GameProgress addGameProgress(GameProgress gameProgress) {
        return gameProgressRepo.save(gameProgress);
    }

    /**
     * Method for getting the gameprogress for a specific team
     * @param gameid the id of the game
     * @param teamid the id of the team
     * @return the gameprogress
     */
    public List<GameProgress> findGameProgress(Long gameid, Long teamid) {
        return gameProgressRepo.findGameProgressByGameid(gameid, teamid);
    }

    /**
     * Method for getting GameProgress for a specific game
     * @param gameid the id of the game
     * @return the gameprogress for the game
     */
    public List<GameProgress> findSingleGameProgress(Long gameid) {
        return gameProgressRepo.findSingleGameProgressByGameid(gameid);
    }
}
