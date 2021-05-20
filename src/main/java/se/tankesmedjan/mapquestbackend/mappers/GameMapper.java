package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.GameDTO;
import se.tankesmedjan.mapquestbackend.models.Game;

@Mapper
public interface GameMapper {

    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);

    @Mapping(source = "startLat", target = "startLat")
    @Mapping(source = "startLong", target = "startLong")
    @Mapping(source = "endLat", target = "endLat")
    @Mapping(source = "endLong", target = "endLong")
    @Mapping(source = "storyId", target = "story.id")
    @Mapping(source = "userId", target = "user.id")
    Game dtoToGame(GameDTO gameDTO);


}
