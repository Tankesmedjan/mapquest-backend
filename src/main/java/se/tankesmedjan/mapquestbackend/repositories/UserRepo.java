package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Game;
import se.tankesmedjan.mapquestbackend.models.User;

import java.util.List;

public interface UserRepo extends CrudRepository<User, String> {

    List<User> findAll();
    User findUserById(String id);
    List<User> findUserByEmailAndPassword(String email, String password);
    User findUserByEmail(String email);

    @Query("select g from Game g " +
            "inner join User u on g.user.id = u.id " +
            "where u.id = ?1")
    List<Game> findGameByUserId(String id);
}
