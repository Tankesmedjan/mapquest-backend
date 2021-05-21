package se.tankesmedjan.mapquestbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameMissionDTO {

    private double lng;
    private double lat;

    private Long gameId;
    private Long missionId;

}
