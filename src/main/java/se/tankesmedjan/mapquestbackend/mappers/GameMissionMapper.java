package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.GameMissionDTO;
import se.tankesmedjan.mapquestbackend.models.GameMission;


@Mapper
public interface GameMissionMapper {

    GameMissionMapper INSTANCE = Mappers.getMapper( GameMissionMapper.class );

    @Mapping(source = "lat", target = "lat")
    @Mapping(source = "lng", target = "lng")
    @Mapping(source = "gameId", target = "gameId.id")
    @Mapping(source = "missionId", target = "missionId.id")
    GameMission dtoToGameMission (GameMissionDTO gameMissionDTO);


}
