package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Game;

import java.util.List;

public interface GameRepo extends CrudRepository<Game, Long> {

    List<Game> findAll();
}
