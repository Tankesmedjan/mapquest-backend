package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Mission;

import java.util.List;

public interface MissionRepo extends CrudRepository<Mission, Long> {

    List<Mission> findAll();
    Mission findMissionById(Long id);
}

