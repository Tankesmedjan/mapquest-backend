package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.MissionPlayerDTO;
import se.tankesmedjan.mapquestbackend.mappers.GameMissionMapper;
import se.tankesmedjan.mapquestbackend.mappers.MissionPlayerMapper;
import se.tankesmedjan.mapquestbackend.models.MissionPlayer;
import se.tankesmedjan.mapquestbackend.repositories.MissionPlayerRepo;

import java.util.List;

@Service
public class MissionPlayerService {

    private final MissionPlayerRepo missionPlayerRepo;

    @Autowired
    public MissionPlayerService(MissionPlayerRepo missionPlayerRepo){
        this.missionPlayerRepo = missionPlayerRepo;
    }

    public MissionPlayerDTO addMissionPlayer(MissionPlayerDTO missionPlayerDTO) {

        missionPlayerRepo.save(MissionPlayerMapper.INSTANCE.dtoToMissionPlayer(missionPlayerDTO));
        return missionPlayerDTO;
    }

    public List<MissionPlayer> getMissionPlayer() {
        return missionPlayerRepo.findAll();
    }
}
