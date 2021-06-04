package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.FeedbackDTO;
import se.tankesmedjan.mapquestbackend.services.FeedbackService;

@RestController
@CrossOrigin
@RequestMapping("/api/feedback")
public class FeedbackController {

    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService){
        this.feedbackService = feedbackService;
    }

    @PostMapping()
    public FeedbackDTO getFeedback(@RequestBody FeedbackDTO feedbackDTO){
        return feedbackService.getFeedback(feedbackDTO);
    }
}
