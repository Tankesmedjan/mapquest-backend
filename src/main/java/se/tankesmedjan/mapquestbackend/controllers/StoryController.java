package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.tankesmedjan.mapquestbackend.models.Story;
import se.tankesmedjan.mapquestbackend.services.StoryService;

import java.util.List;

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
}
