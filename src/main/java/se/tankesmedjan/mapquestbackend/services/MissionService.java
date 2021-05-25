package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.MissionDTO;
import se.tankesmedjan.mapquestbackend.mappers.MissionMapper;
import se.tankesmedjan.mapquestbackend.mappers.MissionQAMapper;
import se.tankesmedjan.mapquestbackend.models.Mission;
import se.tankesmedjan.mapquestbackend.models.MissionQA;
import se.tankesmedjan.mapquestbackend.repositories.MissionQARepo;
import se.tankesmedjan.mapquestbackend.repositories.MissionRepo;

import java.util.List;

@Service
public class MissionService {

    private final MissionRepo missionRepo;
    private final MissionQARepo missionQARepo;

    @Autowired
    public MissionService(MissionRepo missionRepo, MissionQARepo missionQARepo){
        this.missionRepo = missionRepo;
        this.missionQARepo = missionQARepo;
    }

    /**
     * Basic method for adding a Mission.
     * @param missionDTO the body of a Mission.
     * @return saves the Mission.
     *
     * If the mission contains a question, it gets saved to
     * missionQA as well.
     */
    public MissionDTO addMissions(MissionDTO missionDTO) {
        Mission mission = MissionMapper.INSTANCE.dtoToMission(missionDTO);

        if(mission.isIzQuestion()){

            missionRepo.save(mission);
            missionDTO.setMissionId(mission.getId());

            MissionQA missionQA = MissionQAMapper.INSTANCE.dtoToMissionQA(missionDTO);
            missionQARepo.save(missionQA);
            return missionDTO;
        }

        missionRepo.save(mission);
        return missionDTO;
    }

    /**
     * Basic method for getting a list of all Missions.
     * @return the list of all Missions.
     */
    public List<Mission> getAllMissions() {
        return missionRepo.findAll();
    }

    /**
     * Basic method for deleting a specific mission.
     * @param id the ID of the Mission to be deleted.
     * @return deletes the chosen Mission.
     */
    public Mission deleteMission(Long id) {
        Mission mission = missionRepo.findMissionById(id);
        missionRepo.delete(mission);
        return mission;
    }

    /**
     * @param id is the id of the question you want to edit.
     * @param missionDTO contains the information you want to change to.
     *
     * The method finds the mission you want to edit, changes the values of information
     * and then saves the mission to the database.
     * If the mission contains a question, the question also changes to the values
     * you enter as input.
     */
    public MissionDTO editMission(Long id, MissionDTO missionDTO) {
        Mission missionEdit = missionRepo.findMissionById(id);
        Mission missionStory = MissionMapper.INSTANCE.dtoToMission(missionDTO);

        missionEdit.setMissionName(missionDTO.getMissionName());
        missionEdit.setMissionDescription(missionDTO.getMissionDescription());
        missionEdit.setIzQuestion(missionDTO.isIzQuestion());
        missionEdit.setShortDescription(missionDTO.getShortDescription());
        missionEdit.setWinnerScore(missionDTO.getWinnerScore());
        missionEdit.setStory(missionStory.getStory());
        missionRepo.save(missionEdit);
        missionDTO.setMissionId(missionEdit.getId());

        if(missionEdit.isIzQuestion()) {
            MissionQA missionId = MissionQAMapper.INSTANCE.dtoToMissionQA(missionDTO);
            MissionQA missionQAEdit = missionQARepo.findMissionQAbyMissionId(id);

            missionQAEdit.setAnswer1(missionDTO.getAnswer1());
            missionQAEdit.setAnswerX(missionDTO.getAnswerX());
            missionQAEdit.setAnswer2(missionDTO.getAnswer2());
            missionQAEdit.setQuestion(missionDTO.getQuestion());
            missionQAEdit.setCorrectAnswer(missionDTO.getCorrectAnswer());
            missionQAEdit.setMissionId(missionId.getMissionId());
            missionQARepo.save(missionQAEdit);
        }
        return missionDTO;
    }

    public List<Mission> getMissionPointers(Long id) {
        return missionRepo.getMissionPointers(id);
    }

}
