package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.MissionQA;
import se.tankesmedjan.mapquestbackend.repositories.MissionQARepo;

import java.util.List;

@Service
public class MissionQAService {

    private final MissionQARepo missionQARepo;

    @Autowired
    public MissionQAService(MissionQARepo missionQARepo){
        this.missionQARepo = missionQARepo;
    }

    public MissionQA addQuestion(MissionQA missionQA) {
        return missionQARepo.save(missionQA);
    }

    public List<MissionQA> getQuestions() {
        return missionQARepo.findAll();
    }

    public List<MissionQA> getQuestion(Long id) {
        return missionQARepo.findAllById(id);
    }
}
