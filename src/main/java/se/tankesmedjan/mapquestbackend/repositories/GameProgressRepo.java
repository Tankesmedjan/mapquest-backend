package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.GameProgress;

public interface GameProgressRepo extends CrudRepository<GameProgress, String> {
}
