package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.MissionPlayer;

public interface MissionPlayerRepo extends CrudRepository<MissionPlayer, Long> {
}
