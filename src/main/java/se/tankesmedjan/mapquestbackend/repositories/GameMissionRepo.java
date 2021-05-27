package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.GameMission;

import java.util.List;

public interface GameMissionRepo extends CrudRepository<GameMission, Long> {
    /**
     * nativQuery that selects all gamemission information needed for a specific game,
     * includes MissionQA & Mission.
     * @param id specific game.
     */
    @Query(value = "select * from game_mission gm " +
            "inner join mission m on gm.mission_id = m.id " +
            "left join missionqa mqa on m.missionqaid = mqa.id " +
            "where gm.game_id = ?1 order by m.id", nativeQuery = true)
    List<GameMission> findAllPointersByGameId(Long id);

    GameMission findGameMissionById(Long id);
}