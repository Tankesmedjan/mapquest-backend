package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class MissionPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "missionId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Mission missionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playerId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Player playerId;

    /**
     * Ifall det skiter sig, gör om time till int och lägg en timer i
     * frontend som sparar värdet och lagrar som en int i time.
     */
    private Long timer;
}
