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
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double startLat;
    private double startLong;
    private double endLat;
    private double endLong;

    @ManyToOne
    @JoinColumn(name = "storyId", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Story story;

    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Team> team;

    @OneToOne(mappedBy = "game", cascade = CascadeType.ALL)
    @JsonIgnore
    private Scoreboard scoreboard;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gameId")
//    @JsonIgnore
//    private List<GameMission> gameMissions;

}
