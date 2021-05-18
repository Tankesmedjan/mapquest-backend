package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.User;

public interface UserRepo extends CrudRepository<User, Long> {
}
