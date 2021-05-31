package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.GameProgress;

import java.util.List;

public interface GameProgressRepo extends CrudRepository<GameProgress, String> {

    @Query("SELECT gp from GameProgress gp " +
            "where gp.gameid = ?1 and gp.teamid = ?2")
    List<GameProgress> findGameProgressByGameid(Long gameid, Long teamid);
}
