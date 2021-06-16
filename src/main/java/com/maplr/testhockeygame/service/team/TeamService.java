package com.maplr.testhockeygame.service.team;

import com.maplr.testhockeygame.entity.team.TeamEntity;
import com.maplr.testhockeygame.exeptions.team.TeamNotFoundException;
import com.maplr.testhockeygame.repository.team.TeamRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public TeamEntity getTeamByYear(long year) {
        TeamEntity teamEntity = teamRepository.findByYear(year);
        if (teamEntity == null) {
            throw new TeamNotFoundException();
        }

        return teamEntity;
    }

}
