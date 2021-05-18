package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Player;

import java.util.List;

public interface PlayerRepo extends CrudRepository<Player, Long> {

    List<Player> findAll();
}
