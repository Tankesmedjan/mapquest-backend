package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping
    public List<Story> getStories() {
        return storyService.getStories();
    }

    @PostMapping
    public Story addStory(@RequestBody Story story){
        return storyService.addStories(story);
    }

    @DeleteMapping("/delete")
    public String deleteStories(@RequestParam Long id){
        return "Successfully deleted the story: " + storyService.deleteStory(id).getStoryName();
    }
}
