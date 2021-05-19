package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.GameMission;

import java.util.List;

public interface GameMissionRepo extends CrudRepository<GameMission, Long> {

    List<GameMission> findAll();
}
