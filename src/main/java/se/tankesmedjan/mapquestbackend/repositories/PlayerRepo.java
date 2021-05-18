package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Player;

public interface PlayerRepo extends CrudRepository<Player, Long> {
}
