package se.tankesmedjan.mapquestbackend.services;

import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.StoryRepo;

@Service
public class StoryService {

    private final StoryRepo storyRepo;

    public StoryService(StoryRepo storyRepo){
        this.storyRepo = storyRepo;
    }
}
