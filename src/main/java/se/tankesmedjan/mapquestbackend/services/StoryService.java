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

    /**
     * Basic method for getting a list of all Stories.
     * @return the list of all Stories.
     */
    public List<Story> getStories() {
        return storyRepo.findAll();
    }

    /**
     * Basic method for adding a Story.
     * @param story the body of a Story.
     * @return saves the Story.
     */
    public Story addStories(Story story) {
        return storyRepo.save(story);
    }

    /**
     * Basic method for deleting a specific Story.
     * @param id the ID of the Story to be deleted.
     * @return deletes the chosen Story.
     */
    public Story deleteStory(Long id) {
        Story story = storyRepo.findStoryById(id);
        storyRepo.delete(story);
        return story;
    }
}
