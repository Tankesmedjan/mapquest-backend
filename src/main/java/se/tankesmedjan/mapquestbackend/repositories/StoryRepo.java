package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Story;

import java.util.List;

public interface StoryRepo extends CrudRepository<Story, Long> {

    List<Story> findAll();
    Story findStoryById(Long id);
}
