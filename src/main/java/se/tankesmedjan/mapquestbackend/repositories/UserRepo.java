package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.User;

import java.util.List;

public interface UserRepo extends CrudRepository<User, String> {

    List<User> findAll();
    User findUserById(String id);
    List<User> findUserByEmailAndPassword(String email, String password);
}
