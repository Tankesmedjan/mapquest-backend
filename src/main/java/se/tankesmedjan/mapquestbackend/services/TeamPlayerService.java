package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.TeamPlayerRepo;

@Service
public class TeamPlayerService {

    private final TeamPlayerRepo teamPlayerRepo;

    @Autowired
    public TeamPlayerService(TeamPlayerRepo teamPlayerRepo){
        this.teamPlayerRepo = teamPlayerRepo;
    }
}
