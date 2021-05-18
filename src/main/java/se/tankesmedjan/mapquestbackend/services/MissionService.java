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

    public Mission addMissions(Mission mission) {
       return missionRepo.save(mission);
    }

    public List<Mission> getAllMissions() {
        return missionRepo.findAll();
    }

    public Mission deleteMission(Long id) {
        Mission mission = missionRepo.findMissionById(id);
        missionRepo.delete(mission);
        return mission;
    }
}
