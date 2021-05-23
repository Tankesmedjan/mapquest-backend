package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.AdminUserDTO;
import se.tankesmedjan.mapquestbackend.dto.MissionDTO;
import se.tankesmedjan.mapquestbackend.dto.StoryDTO;
import se.tankesmedjan.mapquestbackend.models.AdminUser;
import se.tankesmedjan.mapquestbackend.models.Mission;
import se.tankesmedjan.mapquestbackend.models.Story;
import se.tankesmedjan.mapquestbackend.services.AdminUserService;
import se.tankesmedjan.mapquestbackend.services.MissionService;
import se.tankesmedjan.mapquestbackend.services.StoryService;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api/admin")
public class AdminUserController {

    private final AdminUserService adminUserService;
    private final StoryService storyService;
    private final MissionService missionService;

    @Autowired
    public AdminUserController(AdminUserService adminUserService, StoryService storyService, MissionService missionService) {
        this.adminUserService = adminUserService;
        this.storyService = storyService;
        this.missionService = missionService;
    }

    @GetMapping
    public List<AdminUser> getAdminUsers() {
        return adminUserService.getAdminUsers();
    }

    @PostMapping("/login")
    public Boolean checkAuth(@RequestBody AdminUserDTO adminUserDTO){
        return adminUserService.checkAuth(adminUserDTO);
    }

    @GetMapping("/story")
    public List<Story> getAllStories(){
        return storyService.getStories();
    }

    @GetMapping("/mission")
    public List<Mission> getAllMissions(){
        return missionService.getAllMissions();
    }

    @PostMapping
    public AdminUserDTO addAdminUser(@RequestBody AdminUserDTO adminUserDTO) {
        return adminUserService.addAdminUser(adminUserDTO);
    }

    @PostMapping("/story")
    public StoryDTO addStory(@RequestBody StoryDTO storyDTO){
        return storyService.addStories(storyDTO);
    }

    @PostMapping("/mission")
    public MissionDTO addMission(@RequestBody MissionDTO missionDTO){
        return missionService.addMissions(missionDTO);
    }

    @PutMapping("/story/edit")
    public StoryDTO editStory(@Param("id") Long id, @RequestBody StoryDTO storyDTO){
        return storyService.editStory(id, storyDTO);
    }

    @PutMapping("/mission/edit")
    public MissionDTO editMission(@RequestParam Long id, @RequestBody MissionDTO missionDTO){
        return missionService.editMission(id, missionDTO);
    }

    @DeleteMapping("/delete")
    public String deleteAdminUser(@RequestParam String id) {
        return "Successfully deleted the AdminUser: " + adminUserService.deleteAdminUser(id).getUsername();
    }

    @DeleteMapping("/story/delete")
    public String deleteStory(@RequestParam Long id){
        return "Successfully deleted the story of: " + storyService.deleteStory(id).getStoryName();
    }

    @DeleteMapping("/mission/delete")
    public String deleteMission(@RequestParam Long id){
        return "Successfully deleted the mission: " + missionService.deleteMission(id).getMissionName();
    }
}
