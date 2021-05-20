package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.MissionQATeamDTO;
import se.tankesmedjan.mapquestbackend.models.MissionQATeam;

@Mapper
public interface MissionQATeamMapper {

    MissionQATeamMapper INSTANCE = Mappers.getMapper(MissionQATeamMapper.class);

    @Mapping(source = "answered", target = "answered")
    @Mapping(source = "correct", target = "correct")
    @Mapping(source = "missionQAId", target = "missionQAId.id")
    MissionQATeam dtoToMissionQATeam(MissionQATeamDTO missionQATeamDTO);
}
