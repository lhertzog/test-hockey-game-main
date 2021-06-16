package com.maplr.testhockeygame.controller.impl.player;

import com.maplr.testhockeygame.mapper.player.PlayerStructMapper;
import com.maplr.testhockeygame.rest.controller.player.PlayerController;
import com.maplr.testhockeygame.rest.dto.player.PlayerDTO;
import com.maplr.testhockeygame.service.player.PlayerService;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerControllerImpl implements PlayerController {

    private final PlayerService playerService;
    private final PlayerStructMapper playerStructMapper;

    public PlayerControllerImpl(PlayerService playerService, PlayerStructMapper playerStructMapper) {
        this.playerService = playerService;
        this.playerStructMapper = playerStructMapper;
    }

    @Override
    public PlayerDTO makePlayerCaptain(long id) {
        return playerStructMapper.playerEntityToPlayerDTO(playerService.makePlayerCaptain(id));
    }
}
