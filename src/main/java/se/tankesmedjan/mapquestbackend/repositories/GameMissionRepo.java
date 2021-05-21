package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Game;
import se.tankesmedjan.mapquestbackend.models.GameMission;
import se.tankesmedjan.mapquestbackend.models.MissionQA;

import java.util.List;

public interface GameMissionRepo extends CrudRepository<GameMission, Long> {

    @Query("SELECT gm FROM GameMission gm " +
            "left join MissionQA mqa on gm.missionId.id = mqa.missionId.id " +
            "where gm.gameId.id = ?1")
    List<GameMission> findAllPointersByGameId(Long id);

    GameMission findGameMissionById(Long id);
}
