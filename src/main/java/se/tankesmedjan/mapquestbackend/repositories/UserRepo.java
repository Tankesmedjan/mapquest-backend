package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.User;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findAll();
}
