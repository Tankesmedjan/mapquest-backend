package se.tankesmedjan.mapquestbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MissionDTO {

    private String missionDescription;
    private String missionName;
    private String shortDescription;
    private Long winnerScore;
    private boolean izQuestion;
    private Long storyId;

    private Long missionId;
    private String answer1;
    private String answerX;
    private String answer2;
    private String correctAnswer;
    private String question;
}
