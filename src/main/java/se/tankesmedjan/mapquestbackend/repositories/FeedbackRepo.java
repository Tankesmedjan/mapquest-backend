package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Feedback;

public interface FeedbackRepo extends CrudRepository<Feedback, Long> {
}
