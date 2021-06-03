package se.tankesmedjan.mapquestbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameDTO {

    private double lat;
    private double lng;


    private Long storyId;
    private String userId;

}