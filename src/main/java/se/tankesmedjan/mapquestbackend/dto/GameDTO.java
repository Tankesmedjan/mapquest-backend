package se.tankesmedjan.mapquestbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameDTO {

    private double startLat;
    private double startLong;
    private double endLat;
    private double endLong;

    private Long storyId;
    private Long userId;

}