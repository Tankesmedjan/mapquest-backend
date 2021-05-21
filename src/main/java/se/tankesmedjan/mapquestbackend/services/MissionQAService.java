package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.MissionDTO;
import se.tankesmedjan.mapquestbackend.mappers.MissionMapper;
import se.tankesmedjan.mapquestbackend.mappers.MissionQAMapper;
import se.tankesmedjan.mapquestbackend.models.MissionQA;
import se.tankesmedjan.mapquestbackend.repositories.MissionQARepo;

import java.util.List;

@Service
public class MissionQAService {

    private final MissionQARepo missionQARepo;

    @Autowired
    public MissionQAService(MissionQARepo missionQARepo){
        this.missionQARepo = missionQARepo;
    }

    /**
     * Basic method to add a missionQA.
     * @param missionQA the body of a missionQA.
     * @return saves the missionQA.
     */
    public MissionDTO addQuestion(MissionDTO missionQA) {
        missionQARepo.save(MissionQAMapper.INSTANCE.dtoToMissionQA(missionQA));
        return missionQA;
    }

    /**
     * Basic method to get a list of all questions.
     * @return the list of questions.
     */
    public List<MissionQA> getQuestions() {
        return missionQARepo.findAll();
    }

    /**
     * Basic method to find a specific question.
     * @param id the id of the question.
     * @return the question with same id as the input.
     */
    public List<MissionQA> getQuestion(Long id) {
        return missionQARepo.findAllById(id);
    }

    /**
     * Basic method for deleting a specific question
     * @param id the id of a mission to be deleted.
     * @return deletes the chosen mission
     */
    public MissionQA deleteMission(Long id) {
        MissionQA missionQA = missionQARepo.findMissionQAById(id);
        missionQARepo.delete(missionQA);
        return missionQA;
    }
}
