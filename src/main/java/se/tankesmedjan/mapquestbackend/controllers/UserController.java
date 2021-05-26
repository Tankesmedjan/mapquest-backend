package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.UserDTO;
import se.tankesmedjan.mapquestbackend.models.User;
import se.tankesmedjan.mapquestbackend.services.UserService;

import java.sql.Timestamp;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public UserDTO addUser(@RequestBody UserDTO user){
        return userService.addUser(user);
    }

    @PostMapping("/timestamp")
    public Timestamp setTimestamp(@RequestParam String id){
        return userService.setTimestamp(id);
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/login")
    public Boolean getAccessCode(@RequestBody UserDTO userDTO){
      return userService.checkAuth(userDTO);
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam String id) {
        return "Successfully deleted the User: " + userService.deleteUser(id).getName();
    }
}
