package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.MissionQA;

import java.util.List;

public interface MissionQARepo extends CrudRepository<MissionQA, Long> {

    List<MissionQA> findAll();
    List<MissionQA> findAllById(Long id);
    MissionQA findMissionQAById(Long id);

    @Query("SELECT mqa FROM MissionQA mqa " +
            "inner join Mission m on m.missionQAs.id = mqa.id " +
            "where m.id = ?1 ")
    MissionQA findMissionQAbyMissionId(Long id);
}
