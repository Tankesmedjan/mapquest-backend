package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.GameTeam;

public interface GameTeamRepo extends CrudRepository<GameTeam, Long> {
}
