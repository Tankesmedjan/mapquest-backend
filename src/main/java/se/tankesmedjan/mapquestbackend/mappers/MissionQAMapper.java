package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.MissionDTO;
import se.tankesmedjan.mapquestbackend.models.MissionQA;

@Mapper
public interface MissionQAMapper {

    MissionQAMapper INSTANCE = Mappers.getMapper(MissionQAMapper.class);

    @Mapping(source = "answer1", target = "answer1")
    @Mapping(source = "answerX", target = "answerX")
    @Mapping(source = "answer2", target = "answer2")
    @Mapping(source = "correctAnswer", target = "correctAnswer")
    @Mapping(source = "question", target = "question")
    @Mapping(source = "missionId", target = "missionId.id")
    MissionQA dtoToMissionQA (MissionDTO missionDTO);
}
