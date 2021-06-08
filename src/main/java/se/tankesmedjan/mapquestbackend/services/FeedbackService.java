package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.FeedbackDTO;
import se.tankesmedjan.mapquestbackend.mappers.FeedbackMapper;
import se.tankesmedjan.mapquestbackend.repositories.FeedbackRepo;

@Service
public class FeedbackService {

    private final FeedbackRepo feedbackRepo;

    @Autowired
    FeedbackService(FeedbackRepo feedbackRepo){
        this.feedbackRepo = feedbackRepo;
    }

    /**
     * Basic method for adding feedback.
     * @param feedbackDTO the body of a FeedbackDTO
     * @return saves the feedback
     */
    public FeedbackDTO getFeedback(FeedbackDTO feedbackDTO) {
        feedbackRepo.save(FeedbackMapper.INSTANCE.dtoToFeedback(feedbackDTO));
        return feedbackDTO;
    }
}
