package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Mission {

    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String missionName;

    @Type(type = "text")
    private String missionDescription;

    @Column(columnDefinition = "boolean default false")
    private boolean izQuestion;

    @Column(length = 128)
    private String shortDescription;

    @Column(length = 20)
    private Long winnerScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storyId", nullable = true)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Story story;

    @OneToMany(mappedBy = "missionId", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<GameMission> gameMissions;

    @OneToOne
    @JoinColumn(name = "missionQAId", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private MissionQA missionQAs;

    @OneToMany(mappedBy = "missionId", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<MissionPlayer> missionPlayers;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mission")
    @JsonIgnore
    private List<GameProgress> gameProgressList;
}

