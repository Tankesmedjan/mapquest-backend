package se.tankesmedjan.mapquestbackend.services;

import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.PlayerRepo;

@Service
public class PlayerService {

    private final PlayerRepo playerRepo;

    public PlayerService(PlayerRepo playerRepo){
        this.playerRepo = playerRepo;
    }
}
