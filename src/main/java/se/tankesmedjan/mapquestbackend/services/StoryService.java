package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.Story;
import se.tankesmedjan.mapquestbackend.repositories.StoryRepo;

import java.util.List;

@Service
public class StoryService {

    private final StoryRepo storyRepo;

    @Autowired
    public StoryService(StoryRepo storyRepo){
        this.storyRepo = storyRepo;
    }

    public List<Story> getStories() {
        return storyRepo.findAll();
    }
}
