package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class GameMission {

    @Id
    private String Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gameId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Game gameId;

    private BigDecimal latitude;
    private BigDecimal longitude;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "missionId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Mission missionId;
}
