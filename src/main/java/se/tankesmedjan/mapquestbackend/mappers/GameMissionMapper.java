package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.GameMissionDTO;
import se.tankesmedjan.mapquestbackend.models.GameMission;


@Mapper
public interface GameMissionMapper {

    GameMissionMapper INSTANCE = Mappers.getMapper( GameMissionMapper.class );

    @Mapping(source = "latitude", target = "latitude")
    @Mapping(source = "longitude", target = "longitude")
    @Mapping(source = "gameId", target = "gameId.id")
    @Mapping(source = "missionId", target = "missionId.id")
    GameMission dtoToGameMission (GameMissionDTO gameMissionDTO);


}
