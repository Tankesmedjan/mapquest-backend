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
}
