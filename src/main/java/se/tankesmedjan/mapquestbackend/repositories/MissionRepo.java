package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Mission;

public interface MissionRepo extends CrudRepository<Mission, Long> {
}
