package com.maplr.testhockeygame.repository.player;

import com.maplr.testhockeygame.entity.player.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {


}
