package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.MissionQA;

public interface MissionQARepo extends CrudRepository<MissionQA, Long> {
}