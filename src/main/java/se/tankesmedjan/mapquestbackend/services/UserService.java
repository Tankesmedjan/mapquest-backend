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
     * Basic method for adding a User.
     * @param user the body of the User to be added.
     * @return saves the User.
     */
    public UserDTO addUser(UserDTO user) {
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
