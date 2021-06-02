package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.UserDTO;
import se.tankesmedjan.mapquestbackend.mappers.UserMapper;
import se.tankesmedjan.mapquestbackend.models.User;
import se.tankesmedjan.mapquestbackend.repositories.UserRepo;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
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

    /**
     * basic method to chek if the user exists in the database.
     * @param userDTO the input of the user.
     * @return if true, the user logs in.
     */
    public String checkAuth(UserDTO userDTO) {
        if (!userRepo.findUserByEmailAndPassword(userDTO.getEmail(), userDTO.getPassword()).isEmpty()){
            User user = userRepo.findUserByEmail(userDTO.getEmail());
            String id = user.getId();
            return user.getId();
        }
        return null;
    }


    /**
     * Basic method to check if the user has a valid game session based on timestamps.
     * @param id the id of the user.
     * @return true or false based on the outcome.
     */
    public Boolean checkTimestamp(String id){
        User user = userRepo.findUserById(id);

        Date date = new Date();
        date.setTime(date.getTime());

        if(user.getTimestampActivation().before(date)){
            return user.getTimestampExpired().after(date);
        }
        return false;
    }

    /**
     * Basic method to set a timestamp for activating the game session, and also when it expires.
     * @param id the id of the user.
     * @return sets
     */
    public Timestamp setTimestamp(String id) {
        User user = userRepo.findUserById(id);
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        user.setTimestampActivation(ts);

        Calendar cal = Calendar.getInstance();
        cal.setTime(ts);
        cal.add(Calendar.HOUR, 24);
        ts = new Timestamp(cal.getTime().getTime());
        user.setTimestampExpired(ts);
        userRepo.save(user);
        return ts;
    }
}
