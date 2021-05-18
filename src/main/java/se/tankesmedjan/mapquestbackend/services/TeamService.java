package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.Team;
import se.tankesmedjan.mapquestbackend.repositories.TeamRepo;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepo teamRepo;

    @Autowired
    public TeamService(TeamRepo teamRepo){
        this.teamRepo = teamRepo;
    }

    public Team addTeams(Team team) {
        return teamRepo.save(team);
    }

    public List<Team> getTeams() {
        return teamRepo.findAll();
    }

    public Team deleteTeam(Long id) {
        Team team = teamRepo.findTeamById(id);
        teamRepo.delete(team);
        return team;
    }
}
