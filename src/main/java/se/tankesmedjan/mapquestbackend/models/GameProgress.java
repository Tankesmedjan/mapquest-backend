package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teams")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Mission mission;

}
