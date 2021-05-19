package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.MissionDTO;
import se.tankesmedjan.mapquestbackend.models.Mission;

@Mapper
public interface MissionMapper {

    MissionMapper INSTANCE = Mappers.getMapper(MissionMapper.class);

    @Mapping(source = "izQuestion", target = "izQuestion")
    @Mapping(source = "missionDescription", target = "missionDescription")
    @Mapping(source = "missionName", target = "missionName")
    @Mapping(source = "shortDescription", target = "shortDescription")
    @Mapping(source = "winnerScore", target = "winnerScore")
    @Mapping(source = "storyId", target = "story.id")
    Mission dtoToMission (MissionDTO missionDTO);
}
