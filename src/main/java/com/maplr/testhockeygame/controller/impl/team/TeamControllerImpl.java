package com.maplr.testhockeygame.controller.impl.team;

import com.maplr.testhockeygame.entity.player.PlayerEntity;
import com.maplr.testhockeygame.mapper.player.PlayerStructMapper;
import com.maplr.testhockeygame.mapper.team.TeamStructMapper;
import com.maplr.testhockeygame.rest.controller.team.TeamController;
import com.maplr.testhockeygame.rest.dto.player.PlayerDTO;
import com.maplr.testhockeygame.rest.dto.team.TeamDTO;
import com.maplr.testhockeygame.service.player.PlayerService;
import com.maplr.testhockeygame.service.team.TeamService;
import org.springframework.stereotype.Controller;

@Controller
public class TeamControllerImpl implements TeamController {

    private final TeamService teamService;
    private final PlayerService playerService;
    private final TeamStructMapper teamStructMapper;
    private final PlayerStructMapper playerStructMapper;

    public TeamControllerImpl(TeamService teamService, PlayerService playerService, TeamStructMapper teamStructMapper, PlayerStructMapper playerStructMapper) {
        this.teamService = teamService;
        this.playerService = playerService;
        this.teamStructMapper = teamStructMapper;
        this.playerStructMapper = playerStructMapper;
    }

    @Override
    public TeamDTO getPlayerByYear(long year) {
        return teamStructMapper.teamEntityToTeamDTO(teamService.getTeamByYear(year));
    }

    @Override
    public PlayerDTO insertPlayerInTeam(long year, PlayerDTO playerDTO) {
        PlayerEntity playerEntity = playerStructMapper.playerDTOToPlayerEntity(playerDTO);

        playerEntity = playerService.insertPlayerInTeam(year, playerEntity);

        return playerStructMapper.playerEntityToPlayerDTO(playerEntity);
    }
}
