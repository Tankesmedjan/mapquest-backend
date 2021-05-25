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
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teamId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Team team;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "playerId")
    @JsonIgnore
    private List<MissionPlayer> missionPlayers;
}
