package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.Mission;

import java.util.List;

public interface MissionRepo extends CrudRepository<Mission, Long> {

    @Query("select m, mqa from Mission m " +
            "join MissionQA mqa on mqa.missionId = m.id " +
            "where m.id = ?1")
    List<Mission> getMissionPointers(Long id);

    List<Mission> findAll();
    Mission findMissionById(Long id);
}

