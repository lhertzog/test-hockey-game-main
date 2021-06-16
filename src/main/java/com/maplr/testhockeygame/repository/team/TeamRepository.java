package com.maplr.testhockeygame.repository.team;

import com.maplr.testhockeygame.entity.team.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, Long> {

    TeamEntity findByYear(long year);

}
