package se.tankesmedjan.mapquestbackend.services;

import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.TeamRepo;

@Service
public class TeamService {

    private final TeamRepo teamRepo;

    public TeamService(TeamRepo teamRepo){
        this.teamRepo = teamRepo;
    }
}
