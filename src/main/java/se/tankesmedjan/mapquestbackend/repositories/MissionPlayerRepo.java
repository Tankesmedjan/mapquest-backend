package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.MissionPlayer;

import java.util.List;

public interface MissionPlayerRepo extends CrudRepository<MissionPlayer, Long> {

    List<MissionPlayer> findAll();
    MissionPlayer findMissionPlayerById(Long id);
}
