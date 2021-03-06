package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.StoryDTO;
import se.tankesmedjan.mapquestbackend.models.Story;
import se.tankesmedjan.mapquestbackend.services.StoryService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/story")
public class StoryController {

    private final StoryService storyService;

    @Autowired
    public StoryController(StoryService storyService){
        this.storyService = storyService;
    }

    @PostMapping
    public StoryDTO addStory(@RequestBody StoryDTO story){
        return storyService.addStories(story);
    }

    @GetMapping
    public List<Story> getStories() {
        return storyService.getStories();
    }

    @GetMapping("/select")
    public Story getStory(@Param("id") Long id){
        return storyService.getStory(id);
    }

    @PutMapping("/edit")
    public StoryDTO editStory(@Param("id") Long id, @RequestBody StoryDTO storyDTO) {
        return storyService.editStory(id, storyDTO);
    }

    @DeleteMapping("/delete")
    public String deleteStories(@Param("id") Long id){
        return "Successfully deleted the story: " + storyService.deleteStory(id).getStoryName();
    }
}
