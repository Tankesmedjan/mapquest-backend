package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.StoryDTO;
import se.tankesmedjan.mapquestbackend.mappers.StoryMapper;
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
    public StoryDTO addStories(StoryDTO story) {
        storyRepo.save(StoryMapper.INSTANCE.dtoToStory(story));
        return story;
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

    /**
     * Basic method to edit a Story.
     * @param id the id of the Story to be edited.
     * @param storyDTO the body of the Story.
     * @return saves the changes to Story.
     */
    public StoryDTO editStory(Long id, StoryDTO storyDTO) {
        Story storyToEdit = storyRepo.findStoryById(id);
        if (storyDTO.getStoryName() != null) {
            storyToEdit.setStoryName(storyDTO.getStoryName());
        }
        if (storyDTO.getStoryText() != null) {
            storyToEdit.setStoryText(storyDTO.getStoryText());
        }
        storyRepo.save(storyToEdit);
        return storyDTO;
    }
}
