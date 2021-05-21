package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.ScoreboardRepo;

@Service
public class ScoreboardService {

    private final ScoreboardRepo scoreboardRepo;

    @Autowired
    public ScoreboardService(ScoreboardRepo scoreboardRepo){
        this.scoreboardRepo = scoreboardRepo;
    }
}
