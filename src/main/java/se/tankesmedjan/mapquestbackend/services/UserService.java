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
        userRepo.save(UserMapper.INSTANCE.dtoToUser(user));
        return user;
    }

    /**
     * Basic method for getting a list of all Users.
     * @return the list of all Users.
     */
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    /**
     * Basic method for deleting a specific User.
     * @param id the ID of the User to be deleted.
     * @return deletes the chosen User.
     */
    public User deleteUser(String id) {
        User user = userRepo.findUserById(id);
        userRepo.delete(user);
        return user;
    }

    public Boolean checkAuth(UserDTO userDTO) {
        return !userRepo.findUserByEmailAndPassword(userDTO.getEmail(), userDTO.getPassword()).isEmpty();
    }
}
