package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.MissionQATeam;
import se.tankesmedjan.mapquestbackend.repositories.MissionQATeamRepo;

import java.util.List;

@Service
public class MissionQATeamService {

    private final MissionQATeamRepo missionQATeamRepo;

    @Autowired
    public MissionQATeamService(MissionQATeamRepo missionQATeamRepo){
        this.missionQATeamRepo = missionQATeamRepo;
    }

    public MissionQATeam addMissionQATeam(MissionQATeam missionQATeam) {
        return missionQATeamRepo.save(missionQATeam);
    }

    public List<MissionQATeam> getMissionQATeam() {
        return missionQATeamRepo.findAll();
    }
}
