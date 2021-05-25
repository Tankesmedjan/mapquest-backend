package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class MissionQA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "missionQAs", cascade = CascadeType.ALL)
    @JsonIgnore
    private Mission missionId;

    private String question;
    private String answer1;
    private String answerX;
    private String answer2;
    private String correctAnswer;
}
