package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Player;
import se.tankesmedjan.mapquestbackend.models.Team;

import java.util.List;

public interface TeamRepo extends CrudRepository<Team, Long> {

    List<Team> findAll();
    Team findTeamById(Long id);

    @Query("SELECT p FROM Player p " +
            "inner join Team t on t.id = p.team.id " +
            "where t.id = ?1 ")
    List<Player> findPlayersByTeamId(Long id);


    List<Team> findTeamsByGameId(Long id);
}
