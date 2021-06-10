package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double lat;
    private double lng;


    @ManyToOne
    @JoinColumn(name = "storyId", referencedColumnName = "id")
    @NotFound(action = NotFoundAction.IGNORE)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Story story;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Team> team;

    @OneToOne(mappedBy = "game", cascade = CascadeType.ALL)
    @JsonIgnore
    private Scoreboard scoreboard;

}
