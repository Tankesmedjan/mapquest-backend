package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.Mission;
import se.tankesmedjan.mapquestbackend.repositories.MissionRepo;

import java.util.List;

@Service
public class MissionService {

    private final MissionRepo missionRepo;

    @Autowired
    public MissionService(MissionRepo missionRepo){
        this.missionRepo = missionRepo;
    }

    /**
     * Basic method for adding a Mission.
     * @param mission the body of a Mission.
     * @return saves the Mission.
     */
    public Mission addMissions(Mission mission) {
       return missionRepo.save(mission);
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
     * @return the Mission to be deleted.
     */
    public Mission deleteMission(Long id) {
        Mission mission = missionRepo.findMissionById(id);
        missionRepo.delete(mission);
        return mission;
    }
}
