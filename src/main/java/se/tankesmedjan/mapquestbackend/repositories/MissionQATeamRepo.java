package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.MissionQATeam;

import java.util.List;

public interface MissionQATeamRepo extends CrudRepository<MissionQATeam, Long> {

    List<MissionQATeam> findAll();
    MissionQATeam findMissionQATeamById(String id);
}
