package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Team;

public interface TeamRepo extends CrudRepository<Team, Long> {
}
