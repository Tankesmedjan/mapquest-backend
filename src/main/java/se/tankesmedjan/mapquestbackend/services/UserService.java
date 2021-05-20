package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.UserDTO;
import se.tankesmedjan.mapquestbackend.mappers.UserMapper;
import se.tankesmedjan.mapquestbackend.models.User;
import se.tankesmedjan.mapquestbackend.repositories.UserRepo;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    /**
     * Basic method to store an Acesscode in the database.
     * @return the code you added.
     */
    public UserDTO addAccessCode(UserDTO user) {
        User addUser = UserMapper.INSTANCE.dtoToUser(user);
        userRepo.save(addUser);
        return user;
    }

    /**
     * Basic method for getting a list of all Users.
     * @return the list of all Users.
     */
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
