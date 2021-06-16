package com.maplr.testhockeygame.mapper.player;

import com.maplr.testhockeygame.entity.player.PlayerEntity;
import com.maplr.testhockeygame.rest.dto.player.PlayerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerStructMapper {

    PlayerDTO playerEntityToPlayerDTO(final PlayerEntity playerEntity);
    PlayerEntity playerDTOToPlayerEntity(final PlayerDTO playerDTO);

}
