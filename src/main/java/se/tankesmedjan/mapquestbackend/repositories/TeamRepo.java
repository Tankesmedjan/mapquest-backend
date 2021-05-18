package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Team;

import java.util.List;

public interface TeamRepo extends CrudRepository<Team, Long> {

    List<Team> findAll();
    Team findTeamById(Long id);
}
