package com.maplr.testhockeygame.service.player;

import com.maplr.testhockeygame.entity.player.PlayerEntity;
import com.maplr.testhockeygame.entity.team.TeamEntity;
import com.maplr.testhockeygame.exeptions.team.TeamNotFoundException;
import com.maplr.testhockeygame.repository.player.PlayerRepository;
import com.maplr.testhockeygame.service.team.TeamService;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final TeamService teamService;

    public PlayerService(PlayerRepository playerRepository, TeamService teamService) {
        this.playerRepository = playerRepository;
        this.teamService = teamService;
    }


    public PlayerEntity insertPlayerInTeam(long year, final PlayerEntity playerEntity) {
        TeamEntity teamEntity = teamService.getTeamByYear(year);
        if (teamEntity == null) {
            throw new TeamNotFoundException();
        }

        playerEntity.setTeamEntity(teamEntity);
        return playerRepository.save(playerEntity);
    }

    public PlayerEntity makePlayerCaptain(long id) {
        PlayerEntity playerEntity = playerRepository.getById(id);

        playerEntity.setCaptain(true);
        playerRepository.save(playerEntity);

        return playerEntity;

    }

}
