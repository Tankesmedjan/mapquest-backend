package se.tankesmedjan.mapquestbackend.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.MissionPlayerDTO;
import se.tankesmedjan.mapquestbackend.models.MissionPlayer;

@Mapper
public interface MissionPlayerMapper {

    MissionPlayerMapper INSTANCE = Mappers.getMapper(MissionPlayerMapper.class);

    @Mapping(source = "time", target = "time")
    @Mapping(source = "missionId", target = "missionId.id")
    @Mapping(source = "playerId", target = "playerId.id")
    MissionPlayer dtoToMissionPlayer(MissionPlayerDTO missionPlayerDTO);
}
