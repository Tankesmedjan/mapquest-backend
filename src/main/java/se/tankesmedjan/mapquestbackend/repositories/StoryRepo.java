package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Story;

public interface StoryRepo extends CrudRepository<Story, Long> {
}
