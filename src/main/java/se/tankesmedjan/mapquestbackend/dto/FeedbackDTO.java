package se.tankesmedjan.mapquestbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedbackDTO {

    private String fullName, email, message;
}
