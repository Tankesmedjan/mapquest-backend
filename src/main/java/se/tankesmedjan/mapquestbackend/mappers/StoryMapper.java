package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.StoryDTO;
import se.tankesmedjan.mapquestbackend.models.Story;

@Mapper
public interface StoryMapper {

    StoryMapper INSTANCE = Mappers.getMapper(StoryMapper.class);

    @Mapping(source = "storyName", target = "storyName")
    @Mapping(source = "storyText", target = "storyText")
    Story dtoToStory(StoryDTO storyDTO);
}
