package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.FeedbackDTO;
import se.tankesmedjan.mapquestbackend.models.Feedback;

/**
 * Mapper with MapStruct
 * https://mapstruct.org/documentation/reference-guide/
 *
 * Maps the dto:information to entities
 */

@Mapper
public interface FeedbackMapper {

    FeedbackMapper INSTANCE = Mappers.getMapper(FeedbackMapper.class);

    @Mapping(source = "fullName", target = "name")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "message", target = "message")
    Feedback dtoToFeedback(FeedbackDTO feedbackDTO);
}
