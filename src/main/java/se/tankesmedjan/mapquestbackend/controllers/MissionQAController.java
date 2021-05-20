package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.MissionDTO;
import se.tankesmedjan.mapquestbackend.models.MissionQA;
import se.tankesmedjan.mapquestbackend.services.MissionQAService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/missionQA")
public class MissionQAController {

    private final MissionQAService missionQAService;

    @Autowired
    public MissionQAController(MissionQAService missionQAService){
        this.missionQAService = missionQAService;
    }

    @PostMapping
    public MissionDTO addQuestion(@RequestBody MissionDTO missionQA){
        return missionQAService.addQuestion(missionQA);
    }

    @GetMapping
    public List<MissionQA> getQuestions(){
        return missionQAService.getQuestions();
    }

    @GetMapping("/id")
    public List<MissionQA> getQuestion(@RequestParam Long id){
        return missionQAService.getQuestion(id);
    }
}
