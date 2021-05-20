package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.AdminUserDTO;
import se.tankesmedjan.mapquestbackend.dto.StoryDTO;
import se.tankesmedjan.mapquestbackend.models.AdminUser;
import se.tankesmedjan.mapquestbackend.models.Story;
import se.tankesmedjan.mapquestbackend.services.AdminUserService;
import se.tankesmedjan.mapquestbackend.services.StoryService;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/admin")
public class AdminUserController {

    private final AdminUserService adminUserService;
    private final StoryService storyService;

    @Autowired
    public AdminUserController(AdminUserService adminUserService, StoryService storyService) {
        this.adminUserService = adminUserService;
        this.storyService = storyService;
    }

    @GetMapping
    public List<AdminUser> getAdminUsers() {
        return adminUserService.getAdminUsers();
    }

    @GetMapping("/story")
    public List<Story> getAllStories(){
        return storyService.getStories();
    }

    @PostMapping
    public AdminUserDTO addAdminUser(@RequestBody AdminUserDTO adminUserDTO) {
        return adminUserService.addAdminUser(adminUserDTO);
    }

    @PostMapping("/story")
    public StoryDTO addStory(@RequestBody StoryDTO storyDTO){
        return storyService.addStories(storyDTO);
    }

    @DeleteMapping("/delete")
    public String deleteAdminUser(@RequestParam String id) {
        return "Successfully deleted the AdminUser: " + adminUserService.deleteAdminUser(id).getUsername();
    }
}
