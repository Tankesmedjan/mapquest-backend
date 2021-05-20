package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.TeamDTO;
import se.tankesmedjan.mapquestbackend.models.Team;

@Mapper
public interface TeamMapper {

    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    @Mapping(source = "teamName", target = "teamName")
    @Mapping(source = "gameId", target = "game.id")
    Team dtoToTeam (TeamDTO teamDTO);
}
