package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.GameMissionDTO;
import se.tankesmedjan.mapquestbackend.mappers.GameMissionMapper;
import se.tankesmedjan.mapquestbackend.models.GameMission;
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
     * @param gameMissionDTO the body of a GameMission.
     * @return saves the GameMission.
     */
    public GameMissionDTO addGameMissions(GameMissionDTO gameMissionDTO) {

        GameMission createNewGameMission = GameMissionMapper.INSTANCE.dtoToGameMission(gameMissionDTO);
        gameMissionRepo.save(createNewGameMission);

        return gameMissionDTO;
    }

    /**
     * Basic method for getting a list of all GameMissions.
     * @return the list of all GameMissions.
     */
    public List<GameMission> getMissionsPointers(Long id) {
        return gameMissionRepo.findAllPointersByGameId(id);
    }

    /**
     * Basic method for deleting a specific GameMission.
     * @param id the ID of the GameMission to be deleted.
     * @return deletes the chosen GameMission
     */
    public GameMission deleteGameMission(Long id) {
        GameMission gameMission = gameMissionRepo.findGameMissionById(id);
        gameMissionRepo.delete(gameMission);
        return gameMission;
    }
}
