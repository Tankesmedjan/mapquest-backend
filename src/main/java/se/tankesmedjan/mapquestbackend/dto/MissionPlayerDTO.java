package se.tankesmedjan.mapquestbackend.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;


@Getter
@Setter
public class MissionPlayerDTO {

    private Long playerId;
    private Long missionId;

    private Long timer;
}
