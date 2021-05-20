package se.tankesmedjan.mapquestbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MissionQATeamDTO {

    private String answered;
    private String correct;

    private Long missionQAId;
}
