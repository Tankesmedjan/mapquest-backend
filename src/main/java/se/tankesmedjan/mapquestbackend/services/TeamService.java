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

    /**
     * Basic method for adding a Team.
     * @param team the body of a Team.
     * @return saves the Team.
     */
    public Team addTeams(Team team) {
        return teamRepo.save(team);
    }

    /**
     * Basic method for getting a list of all Teams.
     * @return the list of all Teams.
     */
    public List<Team> getTeams() {
        return teamRepo.findAll();
    }

    /**
     * Basic method for deleting a specific team.
     * @param id the ID of the Team to be deleted.
     * @return deletes the chosen Team.
     */
    public Team deleteTeam(Long id) {
        Team team = teamRepo.findTeamById(id);
        teamRepo.delete(team);
        return team;
    }
}
