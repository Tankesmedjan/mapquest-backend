package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Scoreboard;

public interface ScoreboardRepo extends CrudRepository<Scoreboard, Long> {
}
