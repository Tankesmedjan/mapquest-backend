package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.TeamPlayer;

public interface TeamPlayerRepo extends CrudRepository<TeamPlayer, Long> {
}
