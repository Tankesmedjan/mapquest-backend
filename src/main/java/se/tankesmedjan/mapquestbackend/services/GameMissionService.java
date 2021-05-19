package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.GameMission;
import se.tankesmedjan.mapquestbackend.models.Mission;
import se.tankesmedjan.mapquestbackend.repositories.GameMissionRepo;

import java.util.List;

@Service
public class GameMissionService {

    private final GameMissionRepo gameMissionRepo;

    @Autowired
    public GameMissionService(GameMissionRepo gameMissionRepo){
        this.gameMissionRepo = gameMissionRepo;
    }

    /**
     * Basic method for adding a GameMission.
     * @param gameMission the body of a GameMission.
     * @return saves the GameMission.
     */
    public GameMission addGameMissions(GameMission gameMission) {
        return gameMissionRepo.save(gameMission);
    }

    /**
     * Basic method for getting a list of all GameMissions.
     * @return the list of all GameMissions.
     */
    public List<GameMission> getMissionsPointers(Long id) {
        return gameMissionRepo.findAllPointersByGameId(id);
    }
}
