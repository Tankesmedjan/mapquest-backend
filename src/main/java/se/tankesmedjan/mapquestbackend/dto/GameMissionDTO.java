package se.tankesmedjan.mapquestbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameMissionDTO {

    private double longitude;
    private double latitude;

    private Long gameId;
    private Long missionId;

}
