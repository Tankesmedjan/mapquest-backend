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

    /**
     * Basic method to add a missionQATeam.
     * @param missionQATeam the body of a missionQATeam.
     * @return saves the missionQATeam.
     */
    public MissionQATeamDTO addMissionQATeam(MissionQATeamDTO missionQATeam) {
        missionQATeamRepo.save(MissionQATeamMapper.INSTANCE.dtoToMissionQATeam(missionQATeam));
        return missionQATeam;
    }

    /**
     * Basic method to get a list of all missionQATeams.
     * @return the list of all missionQATeams.
     */
    public List<MissionQATeam> getMissionQATeam() {
        return missionQATeamRepo.findAll();
    }

    /**
     * Basic method for deleting a specific missionQATeam.
     * @param id the id of the missionQATeam to be deleted.
     * @return deletes the chosen missionQATeam.
     */
    public MissionQATeam deleteMissionQATeam(String id) {
        MissionQATeam missionQATeam = missionQATeamRepo.findMissionQATeamById(id);
        missionQATeamRepo.delete(missionQATeam);
        return missionQATeam;
    }
}

