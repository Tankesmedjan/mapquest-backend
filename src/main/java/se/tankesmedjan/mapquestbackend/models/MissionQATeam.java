package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class MissionQATeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "missionQAId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private MissionQA missionQAId;

    private String answered;
    private String correct;

    @ManyToOne
    @JoinColumn(name = "teamId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Team team;

}
