package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.MissionPlayerDTO;
import se.tankesmedjan.mapquestbackend.models.MissionPlayer;

/**
 * Mapper with MapStruct
 * https://mapstruct.org/documentation/reference-guide/
 *
 * Maps the dto:information to entities
 */

@Mapper
public interface MissionPlayerMapper {

    MissionPlayerMapper INSTANCE = Mappers.getMapper(MissionPlayerMapper.class);

    @Mapping(source = "timer", target = "timer")
    @Mapping(source = "missionId", target = "missionId.id")
    @Mapping(source = "playerId", target = "playerId.id")
    MissionPlayer dtoToMissionPlayer(MissionPlayerDTO missionPlayerDTO);
}
