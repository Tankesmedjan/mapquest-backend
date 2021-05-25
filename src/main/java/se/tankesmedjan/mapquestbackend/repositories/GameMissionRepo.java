package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.GameMission;

import java.util.List;

public interface GameMissionRepo extends CrudRepository<GameMission, Long> {
//    @Query(value = "select m.mission_name, m.mission_description, gm.lat, gm.lng, mqa.question, mqa.answer1, mqa.answerx, mqa.answer2, mqa.correct_answer, m.id, gm.game_id, gm.mission_id, mqa.mission_id as mqa_mission_id from mission m " +
//            "inner join game_mission gm on gm.mission_id = m.id " +
//            "left join missionqa mqa on m.missionqaid = mqa.id " +
//            "where gm.game_id = ?1", nativeQuery = true)
    @Query(value = "select * from game_mission gm " +
            "inner join mission m on gm.mission_id = m.id " +
            "left join missionqa mqa on m.missionqaid = mqa.id " +
            "where gm.game_id = ?1 order by m.id", nativeQuery = true)
    List<GameMission> findAllPointersByGameId(Long id);

    GameMission findGameMissionById(Long id);
}