package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Mission;
import se.tankesmedjan.mapquestbackend.models.MissionQA;

import java.util.List;

public interface MissionQARepo extends CrudRepository<MissionQA, Long> {

    List<MissionQA> findAll();
    List<MissionQA> findAllById(Long id);
}
