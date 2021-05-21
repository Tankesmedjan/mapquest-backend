package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.PlayerDTO;
import se.tankesmedjan.mapquestbackend.mappers.PlayerMapper;
import se.tankesmedjan.mapquestbackend.models.Player;
import se.tankesmedjan.mapquestbackend.models.User;
import se.tankesmedjan.mapquestbackend.repositories.PlayerRepo;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepo playerRepo;

    @Autowired
    public PlayerService(PlayerRepo playerRepo){
        this.playerRepo = playerRepo;
    }

    /**
     * Basic method for getting a list of all Players.
     * @return the list of all Players.
     */
    public List<Player> getPlayers() { return playerRepo.findAll(); }

    /**
     * Basic method for adding a Player.
     * @param player the body of a Player.
     * @return saves the Player.
     */
    public PlayerDTO addPlayer(PlayerDTO player){
        playerRepo.save(PlayerMapper.INSTANCE.dtoToPlayer(player));
        return player;
    }

    /**
     * Basic method for deleting a Player.
     * @param id the id of the Player to be deleted.
     * @return deletes the chosen Player.
     */
    public Player deletePlayer(String id) {
        Player player = playerRepo.findPlayerById(id);
        playerRepo.delete(player);
        return player;
    }
}
