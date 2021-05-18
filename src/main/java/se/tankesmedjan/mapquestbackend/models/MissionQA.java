package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class MissionQA {

    @Id
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "missionId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Mission missionId;

    private String question;
    private String answer1;
    private String answerX;
    private String answer2;
    private String correctAnswer;
}
