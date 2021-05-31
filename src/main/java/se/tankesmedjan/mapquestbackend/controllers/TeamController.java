package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.TeamDTO;
import se.tankesmedjan.mapquestbackend.models.Player;
import se.tankesmedjan.mapquestbackend.models.Team;
import se.tankesmedjan.mapquestbackend.services.TeamService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/team")
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService){
        this.teamService = teamService;
    }

    @PostMapping
    public TeamDTO addTeam(@RequestBody TeamDTO team){
        return teamService.addTeams(team);
    }

    @GetMapping("/all")
    public List<Team> getTeams(){
        return teamService.getTeams();
    }

    @GetMapping
    public List<Team> findTeamsbyGameId(@Param("id") Long id) { return teamService.findTeamsByGameId(id); }

    @GetMapping("/teamplayers")
    public List<Player> getTeamPlayers(@Param("id") Long id){
        return teamService.getTeamAndPlayer(id);
    }

    @DeleteMapping("/delete")
    public String deleteTeam(@Param("id") Long id){
        return "Successfully deleted team: " + teamService.deleteTeam(id).getTeamName();
    }

}
