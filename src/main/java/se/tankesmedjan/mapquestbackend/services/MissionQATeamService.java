package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.MissionQATeamDTO;
import se.tankesmedjan.mapquestbackend.mappers.MissionQATeamMapper;
import se.tankesmedjan.mapquestbackend.models.MissionQATeam;
import se.tankesmedjan.mapquestbackend.models.Player;
import se.tankesmedjan.mapquestbackend.repositories.MissionQATeamRepo;

import java.util.List;

@Service
public class MissionQATeamService {

    private final MissionQATeamRepo missionQATeamRepo;

    @Autowired
    public MissionQATeamService(MissionQATeamRepo missionQATeamRepo){
        this.missionQATeamRepo = missionQATeamRepo;
    }

    public MissionQATeamDTO addMissionQATeam(MissionQATeamDTO missionQATeam) {
        missionQATeamRepo.save(MissionQATeamMapper.INSTANCE.dtoToMissionQATeam(missionQATeam));
        return missionQATeam;
    }

    public List<MissionQATeam> getMissionQATeam() {
        return missionQATeamRepo.findAll();
    }

    public MissionQATeam deleteMissionQATeam(String id) {
        MissionQATeam missionQATeam = missionQATeamRepo.findMissionQATeamById(id);
        missionQATeamRepo.delete(missionQATeam);
        return missionQATeam;
    }
}

