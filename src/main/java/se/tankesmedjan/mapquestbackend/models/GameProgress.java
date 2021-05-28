package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class GameProgress {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @OneToOne
    @JoinColumn(name = "game", referencedColumnName = "id")
    @JsonIgnore
    private Game game;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gameProgress")
    @JsonIgnore
    private List<Team> teams;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gameProgress")
    @JsonIgnore
    private List<Mission> missions;

}
