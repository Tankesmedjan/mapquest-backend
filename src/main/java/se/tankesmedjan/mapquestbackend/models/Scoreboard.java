package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Scoreboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "teamId", referencedColumnName = "id")
    @JsonIgnore
    private Team team;

    private Long score;

    @OneToOne
    @JoinColumn(name = "gameId", referencedColumnName = "id")
    @JsonIgnore
    private Game game;
}
