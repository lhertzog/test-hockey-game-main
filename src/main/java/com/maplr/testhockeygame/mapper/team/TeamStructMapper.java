package com.maplr.testhockeygame.mapper.team;

import com.maplr.testhockeygame.entity.team.TeamEntity;
import com.maplr.testhockeygame.rest.dto.team.TeamDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeamStructMapper {

    TeamDTO teamEntityToTeamDTO(final TeamEntity teamEntity);

}
