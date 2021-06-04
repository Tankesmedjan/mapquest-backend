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

    public FeedbackDTO getFeedback(FeedbackDTO feedbackDTO) {
        feedbackRepo.save(FeedbackMapper.INSTANCE.dtoToFeedback(feedbackDTO));
        return feedbackDTO;
    }
}
