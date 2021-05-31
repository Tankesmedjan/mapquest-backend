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

    public GameProgress addGameProgress(GameProgress gameProgress) {
        return gameProgressRepo.save(gameProgress);
    }

    public List<GameProgress> findGameProgress(Long id) {
        return gameProgressRepo.findGameProgressByGameid(id);
    }
}
