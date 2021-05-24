package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class MissionQA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "missionQAs", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Mission> missionId;

    private String question;
    private String answer1;
    private String answerX;
    private String answer2;
    private String correctAnswer;
}
