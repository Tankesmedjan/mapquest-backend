package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.GameProgress;
import se.tankesmedjan.mapquestbackend.repositories.GameProgressRepo;

@Service
public class GameProgressService {

    private final GameProgressRepo gameProgressRepo;

    @Autowired
    public GameProgressService(GameProgressRepo gameProgressRepo) {
        this.gameProgressRepo = gameProgressRepo;
    }

    public GameProgress getGameProgress(String id) {
        return gameProgressRepo.findGameProgressById(id);
    }

    public GameProgress addGameProgress(GameProgress gameProgress) {
        return gameProgressRepo.save(gameProgress);
    }
}
